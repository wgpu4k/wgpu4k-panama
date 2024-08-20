// Generated by jextract

package io.ygdrasil.wgpu.internal.jvm.panama;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfLong;

/**
 * {@snippet lang = c:
 * struct WGPUBindGroupDescriptor {
 *     const WGPUChainedStruct *nextInChain;
 *     const char *label;
 *     WGPUBindGroupLayout layout;
 *     size_t entryCount;
 *     const WGPUBindGroupEntry *entries;
 * }
 *}
 */
public class WGPUBindGroupDescriptor {

    WGPUBindGroupDescriptor() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            wgpu_h.C_POINTER.withName("nextInChain"),
            wgpu_h.C_POINTER.withName("label"),
            wgpu_h.C_POINTER.withName("layout"),
            wgpu_h.C_LONG.withName("entryCount"),
            wgpu_h.C_POINTER.withName("entries")
    ).withName("WGPUBindGroupDescriptor");

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

    private static final AddressLayout label$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("label"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * const char *label
     *}
     */
    public static final AddressLayout label$layout() {
        return label$LAYOUT;
    }

    private static final long label$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * const char *label
     *}
     */
    public static final long label$offset() {
        return label$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * const char *label
     *}
     */
    public static MemorySegment label(MemorySegment struct) {
        return struct.get(label$LAYOUT, label$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * const char *label
     *}
     */
    public static void label(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(label$LAYOUT, label$OFFSET, fieldValue);
    }

    private static final AddressLayout layout$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("layout"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * WGPUBindGroupLayout layout
     *}
     */
    public static final AddressLayout layout$layout() {
        return layout$LAYOUT;
    }

    private static final long layout$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * WGPUBindGroupLayout layout
     *}
     */
    public static final long layout$offset() {
        return layout$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * WGPUBindGroupLayout layout
     *}
     */
    public static MemorySegment layout(MemorySegment struct) {
        return struct.get(layout$LAYOUT, layout$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * WGPUBindGroupLayout layout
     *}
     */
    public static void layout(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(layout$LAYOUT, layout$OFFSET, fieldValue);
    }

    private static final OfLong entryCount$LAYOUT = (OfLong) $LAYOUT.select(groupElement("entryCount"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * size_t entryCount
     *}
     */
    public static final OfLong entryCount$layout() {
        return entryCount$LAYOUT;
    }

    private static final long entryCount$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * size_t entryCount
     *}
     */
    public static final long entryCount$offset() {
        return entryCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * size_t entryCount
     *}
     */
    public static long entryCount(MemorySegment struct) {
        return struct.get(entryCount$LAYOUT, entryCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * size_t entryCount
     *}
     */
    public static void entryCount(MemorySegment struct, long fieldValue) {
        struct.set(entryCount$LAYOUT, entryCount$OFFSET, fieldValue);
    }

    private static final AddressLayout entries$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("entries"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * const WGPUBindGroupEntry *entries
     *}
     */
    public static final AddressLayout entries$layout() {
        return entries$LAYOUT;
    }

    private static final long entries$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * const WGPUBindGroupEntry *entries
     *}
     */
    public static final long entries$offset() {
        return entries$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * const WGPUBindGroupEntry *entries
     *}
     */
    public static MemorySegment entries(MemorySegment struct) {
        return struct.get(entries$LAYOUT, entries$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * const WGPUBindGroupEntry *entries
     *}
     */
    public static void entries(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(entries$LAYOUT, entries$OFFSET, fieldValue);
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

