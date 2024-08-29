// Generated by jextract

package io.ygdrasil.wgpu.internal.jvm.panama;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

/**
 * {@snippet lang=c :
 * typedef void (*WGPUProcCommandEncoderCopyTextureToTexture)(WGPUCommandEncoder, const WGPUImageCopyTexture *, const WGPUImageCopyTexture *, const WGPUExtent3D *)
 * }
 */
public class WGPUProcCommandEncoderCopyTextureToTexture {

    WGPUProcCommandEncoderCopyTextureToTexture() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(MemorySegment commandEncoder, MemorySegment source, MemorySegment destination, MemorySegment copySize);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        wgpu_h.C_POINTER,
        wgpu_h.C_POINTER,
        wgpu_h.C_POINTER,
        wgpu_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = wgpu_h.upcallHandle(WGPUProcCommandEncoderCopyTextureToTexture.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(WGPUProcCommandEncoderCopyTextureToTexture.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,MemorySegment commandEncoder, MemorySegment source, MemorySegment destination, MemorySegment copySize) {
        try {
             DOWN$MH.invokeExact(funcPtr, commandEncoder, source, destination, copySize);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

