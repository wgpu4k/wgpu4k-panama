// Generated by jextract

package io.ygdrasil.wgpu.internal.jvm.panama;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang = c:
 * struct WGPUTextureBindingLayout {
 *     const WGPUChainedStruct *nextInChain;
 *     WGPUTextureSampleType sampleType;
 *     WGPUTextureViewDimension viewDimension;
 *     WGPUBool multisampled;
 * }
 *}
 */
public class WGPUTextureBindingLayout {

    WGPUTextureBindingLayout() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            wgpu_h.C_POINTER.withName("nextInChain"),
            wgpu_h.C_INT.withName("sampleType"),
            wgpu_h.C_INT.withName("viewDimension"),
            wgpu_h.C_INT.withName("multisampled"),
            MemoryLayout.paddingLayout(4)
    ).withName("WGPUTextureBindingLayout");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout nextInChain$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("nextInChain"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * const WGPUChainedStruct *nextInChain
     *}
     */
    public static final AddressLayout nextInChain$layout() {
        return nextInChain$LAYOUT;
    }

    private static final long nextInChain$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * const WGPUChainedStruct *nextInChain
     *}
     */
    public static final long nextInChain$offset() {
        return nextInChain$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * const WGPUChainedStruct *nextInChain
     *}
     */
    public static MemorySegment nextInChain(MemorySegment struct) {
        return struct.get(nextInChain$LAYOUT, nextInChain$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * const WGPUChainedStruct *nextInChain
     *}
     */
    public static void nextInChain(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(nextInChain$LAYOUT, nextInChain$OFFSET, fieldValue);
    }

    private static final OfInt sampleType$LAYOUT = (OfInt) $LAYOUT.select(groupElement("sampleType"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * WGPUTextureSampleType sampleType
     *}
     */
    public static final OfInt sampleType$layout() {
        return sampleType$LAYOUT;
    }

    private static final long sampleType$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * WGPUTextureSampleType sampleType
     *}
     */
    public static final long sampleType$offset() {
        return sampleType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * WGPUTextureSampleType sampleType
     *}
     */
    public static int sampleType(MemorySegment struct) {
        return struct.get(sampleType$LAYOUT, sampleType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * WGPUTextureSampleType sampleType
     *}
     */
    public static void sampleType(MemorySegment struct, int fieldValue) {
        struct.set(sampleType$LAYOUT, sampleType$OFFSET, fieldValue);
    }

    private static final OfInt viewDimension$LAYOUT = (OfInt) $LAYOUT.select(groupElement("viewDimension"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * WGPUTextureViewDimension viewDimension
     *}
     */
    public static final OfInt viewDimension$layout() {
        return viewDimension$LAYOUT;
    }

    private static final long viewDimension$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * WGPUTextureViewDimension viewDimension
     *}
     */
    public static final long viewDimension$offset() {
        return viewDimension$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * WGPUTextureViewDimension viewDimension
     *}
     */
    public static int viewDimension(MemorySegment struct) {
        return struct.get(viewDimension$LAYOUT, viewDimension$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * WGPUTextureViewDimension viewDimension
     *}
     */
    public static void viewDimension(MemorySegment struct, int fieldValue) {
        struct.set(viewDimension$LAYOUT, viewDimension$OFFSET, fieldValue);
    }

    private static final OfInt multisampled$LAYOUT = (OfInt) $LAYOUT.select(groupElement("multisampled"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * WGPUBool multisampled
     *}
     */
    public static final OfInt multisampled$layout() {
        return multisampled$LAYOUT;
    }

    private static final long multisampled$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * WGPUBool multisampled
     *}
     */
    public static final long multisampled$offset() {
        return multisampled$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * WGPUBool multisampled
     *}
     */
    public static int multisampled(MemorySegment struct) {
        return struct.get(multisampled$LAYOUT, multisampled$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * WGPUBool multisampled
     *}
     */
    public static void multisampled(MemorySegment struct, int fieldValue) {
        struct.set(multisampled$LAYOUT, multisampled$OFFSET, fieldValue);
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
    public static long sizeof() {
        return layout().byteSize();
    }

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

