// Generated by jextract

package io.ygdrasil.wgpu.internal.jvm.panama;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

/**
 * {@snippet lang=c :
 * struct WGPURenderPassColorAttachment {
 *     const WGPUChainedStruct *nextInChain;
 *     WGPUTextureView view;
 *     uint32_t depthSlice;
 *     WGPUTextureView resolveTarget;
 *     WGPULoadOp loadOp;
 *     WGPUStoreOp storeOp;
 *     WGPUColor clearValue;
 * }
 * }
 */
public class WGPURenderPassColorAttachment {

    WGPURenderPassColorAttachment() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgpu_h.C_POINTER.withName("nextInChain"),
        wgpu_h.C_POINTER.withName("view"),
        wgpu_h.C_INT.withName("depthSlice"),
        MemoryLayout.paddingLayout(4),
        wgpu_h.C_POINTER.withName("resolveTarget"),
        wgpu_h.C_INT.withName("loadOp"),
        wgpu_h.C_INT.withName("storeOp"),
        WGPUColor.layout().withName("clearValue")
    ).withName("WGPURenderPassColorAttachment");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout nextInChain$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("nextInChain"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const WGPUChainedStruct *nextInChain
     * }
     */
    public static final AddressLayout nextInChain$layout() {
        return nextInChain$LAYOUT;
    }

    private static final long nextInChain$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const WGPUChainedStruct *nextInChain
     * }
     */
    public static final long nextInChain$offset() {
        return nextInChain$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const WGPUChainedStruct *nextInChain
     * }
     */
    public static MemorySegment nextInChain(MemorySegment struct) {
        return struct.get(nextInChain$LAYOUT, nextInChain$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const WGPUChainedStruct *nextInChain
     * }
     */
    public static void nextInChain(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(nextInChain$LAYOUT, nextInChain$OFFSET, fieldValue);
    }

    private static final AddressLayout view$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("view"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPUTextureView view
     * }
     */
    public static final AddressLayout view$layout() {
        return view$LAYOUT;
    }

    private static final long view$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPUTextureView view
     * }
     */
    public static final long view$offset() {
        return view$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPUTextureView view
     * }
     */
    public static MemorySegment view(MemorySegment struct) {
        return struct.get(view$LAYOUT, view$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPUTextureView view
     * }
     */
    public static void view(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(view$LAYOUT, view$OFFSET, fieldValue);
    }

    private static final OfInt depthSlice$LAYOUT = (OfInt)$LAYOUT.select(groupElement("depthSlice"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t depthSlice
     * }
     */
    public static final OfInt depthSlice$layout() {
        return depthSlice$LAYOUT;
    }

    private static final long depthSlice$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t depthSlice
     * }
     */
    public static final long depthSlice$offset() {
        return depthSlice$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t depthSlice
     * }
     */
    public static int depthSlice(MemorySegment struct) {
        return struct.get(depthSlice$LAYOUT, depthSlice$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t depthSlice
     * }
     */
    public static void depthSlice(MemorySegment struct, int fieldValue) {
        struct.set(depthSlice$LAYOUT, depthSlice$OFFSET, fieldValue);
    }

    private static final AddressLayout resolveTarget$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("resolveTarget"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPUTextureView resolveTarget
     * }
     */
    public static final AddressLayout resolveTarget$layout() {
        return resolveTarget$LAYOUT;
    }

    private static final long resolveTarget$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPUTextureView resolveTarget
     * }
     */
    public static final long resolveTarget$offset() {
        return resolveTarget$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPUTextureView resolveTarget
     * }
     */
    public static MemorySegment resolveTarget(MemorySegment struct) {
        return struct.get(resolveTarget$LAYOUT, resolveTarget$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPUTextureView resolveTarget
     * }
     */
    public static void resolveTarget(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(resolveTarget$LAYOUT, resolveTarget$OFFSET, fieldValue);
    }

    private static final OfInt loadOp$LAYOUT = (OfInt)$LAYOUT.select(groupElement("loadOp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPULoadOp loadOp
     * }
     */
    public static final OfInt loadOp$layout() {
        return loadOp$LAYOUT;
    }

    private static final long loadOp$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPULoadOp loadOp
     * }
     */
    public static final long loadOp$offset() {
        return loadOp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPULoadOp loadOp
     * }
     */
    public static int loadOp(MemorySegment struct) {
        return struct.get(loadOp$LAYOUT, loadOp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPULoadOp loadOp
     * }
     */
    public static void loadOp(MemorySegment struct, int fieldValue) {
        struct.set(loadOp$LAYOUT, loadOp$OFFSET, fieldValue);
    }

    private static final OfInt storeOp$LAYOUT = (OfInt)$LAYOUT.select(groupElement("storeOp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPUStoreOp storeOp
     * }
     */
    public static final OfInt storeOp$layout() {
        return storeOp$LAYOUT;
    }

    private static final long storeOp$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPUStoreOp storeOp
     * }
     */
    public static final long storeOp$offset() {
        return storeOp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPUStoreOp storeOp
     * }
     */
    public static int storeOp(MemorySegment struct) {
        return struct.get(storeOp$LAYOUT, storeOp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPUStoreOp storeOp
     * }
     */
    public static void storeOp(MemorySegment struct, int fieldValue) {
        struct.set(storeOp$LAYOUT, storeOp$OFFSET, fieldValue);
    }

    private static final GroupLayout clearValue$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("clearValue"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPUColor clearValue
     * }
     */
    public static final GroupLayout clearValue$layout() {
        return clearValue$LAYOUT;
    }

    private static final long clearValue$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPUColor clearValue
     * }
     */
    public static final long clearValue$offset() {
        return clearValue$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPUColor clearValue
     * }
     */
    public static MemorySegment clearValue(MemorySegment struct) {
        return struct.asSlice(clearValue$OFFSET, clearValue$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPUColor clearValue
     * }
     */
    public static void clearValue(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, clearValue$OFFSET, clearValue$LAYOUT.byteSize());
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

