package top.wangxiaomei.machine;


import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

import static top.wangxiaomei.thing.Thing_BlockEntity.TEST_BLOCK_ENTITY_TYPE;

public class Machine_BlockEntity extends BlockEntity implements ImplementedInventory, NamedScreenHandlerFactory {

    //存放物品的栈
    private final DefaultedList<ItemStack> items = DefaultedList.ofSize(9, ItemStack.EMPTY);

    public Machine_BlockEntity(BlockPos pos, BlockState state) {
        // We will create this BlockEntityType later on
        super(TEST_BLOCK_ENTITY_TYPE, pos, state);
    }


    /**
     * 保存实体块数据
     **/
    @Override
    protected void writeNbt(NbtCompound nbt) {
        Inventories.writeNbt(nbt, items);
        super.writeNbt(nbt);
    }

    /**
     * 读取实体块数据
     **/
    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, items);
    }


    @Override
    public DefaultedList<ItemStack> getItems() {
        return items;
    }


    @Override
    public Text getDisplayName() {
        return Text.translatable(getCachedState().getBlock().getTranslationKey());
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        //We provide *this* to the screenHandler as our class Implements Inventory
        //Only the Server has the Inventory at the start, this will be synced to the client in the ScreenHandler
        return new BoxScreenHandler(syncId, playerInventory, this);;
    }
}
