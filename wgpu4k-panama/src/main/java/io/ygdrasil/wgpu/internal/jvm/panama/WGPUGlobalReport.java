// Generated by jextract

package io.ygdrasil.wgpu.internal.jvm.panama;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

/**
 * {@snippet lang=c :
 * struct WGPUGlobalReport {
 *     WGPURegistryReport surfaces;
 *     WGPUBackendType backendType;
 *     WGPUHubReport vulkan;
 *     WGPUHubReport metal;
 *     WGPUHubReport dx12;
 *     WGPUHubReport gl;
 * }
 * }
 */
public class WGPUGlobalReport {

    WGPUGlobalReport() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        WGPURegistryReport.layout().withName("surfaces"),
        wgpu_h.C_INT.withName("backendType"),
        MemoryLayout.paddingLayout(4),
        WGPUHubReport.layout().withName("vulkan"),
        WGPUHubReport.layout().withName("metal"),
        WGPUHubReport.layout().withName("dx12"),
        WGPUHubReport.layout().withName("gl")
    ).withName("WGPUGlobalReport");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout surfaces$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("surfaces"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPURegistryReport surfaces
     * }
     */
    public static final GroupLayout surfaces$layout() {
        return surfaces$LAYOUT;
    }

    private static final long surfaces$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPURegistryReport surfaces
     * }
     */
    public static final long surfaces$offset() {
        return surfaces$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPURegistryReport surfaces
     * }
     */
    public static MemorySegment surfaces(MemorySegment struct) {
        return struct.asSlice(surfaces$OFFSET, surfaces$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPURegistryReport surfaces
     * }
     */
    public static void surfaces(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, surfaces$OFFSET, surfaces$LAYOUT.byteSize());
    }

    private static final OfInt backendType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("backendType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPUBackendType backendType
     * }
     */
    public static final OfInt backendType$layout() {
        return backendType$LAYOUT;
    }

    private static final long backendType$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPUBackendType backendType
     * }
     */
    public static final long backendType$offset() {
        return backendType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPUBackendType backendType
     * }
     */
    public static int backendType(MemorySegment struct) {
        return struct.get(backendType$LAYOUT, backendType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPUBackendType backendType
     * }
     */
    public static void backendType(MemorySegment struct, int fieldValue) {
        struct.set(backendType$LAYOUT, backendType$OFFSET, fieldValue);
    }

    private static final GroupLayout vulkan$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("vulkan"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPUHubReport vulkan
     * }
     */
    public static final GroupLayout vulkan$layout() {
        return vulkan$LAYOUT;
    }

    private static final long vulkan$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPUHubReport vulkan
     * }
     */
    public static final long vulkan$offset() {
        return vulkan$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPUHubReport vulkan
     * }
     */
    public static MemorySegment vulkan(MemorySegment struct) {
        return struct.asSlice(vulkan$OFFSET, vulkan$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPUHubReport vulkan
     * }
     */
    public static void vulkan(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, vulkan$OFFSET, vulkan$LAYOUT.byteSize());
    }

    private static final GroupLayout metal$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("metal"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPUHubReport metal
     * }
     */
    public static final GroupLayout metal$layout() {
        return metal$LAYOUT;
    }

    private static final long metal$OFFSET = 688;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPUHubReport metal
     * }
     */
    public static final long metal$offset() {
        return metal$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPUHubReport metal
     * }
     */
    public static MemorySegment metal(MemorySegment struct) {
        return struct.asSlice(metal$OFFSET, metal$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPUHubReport metal
     * }
     */
    public static void metal(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, metal$OFFSET, metal$LAYOUT.byteSize());
    }

    private static final GroupLayout dx12$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("dx12"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPUHubReport dx12
     * }
     */
    public static final GroupLayout dx12$layout() {
        return dx12$LAYOUT;
    }

    private static final long dx12$OFFSET = 1328;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPUHubReport dx12
     * }
     */
    public static final long dx12$offset() {
        return dx12$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPUHubReport dx12
     * }
     */
    public static MemorySegment dx12(MemorySegment struct) {
        return struct.asSlice(dx12$OFFSET, dx12$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPUHubReport dx12
     * }
     */
    public static void dx12(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, dx12$OFFSET, dx12$LAYOUT.byteSize());
    }

    private static final GroupLayout gl$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("gl"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPUHubReport gl
     * }
     */
    public static final GroupLayout gl$layout() {
        return gl$LAYOUT;
    }

    private static final long gl$OFFSET = 1968;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPUHubReport gl
     * }
     */
    public static final long gl$offset() {
        return gl$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPUHubReport gl
     * }
     */
    public static MemorySegment gl(MemorySegment struct) {
        return struct.asSlice(gl$OFFSET, gl$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPUHubReport gl
     * }
     */
    public static void gl(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, gl$OFFSET, gl$LAYOUT.byteSize());
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

