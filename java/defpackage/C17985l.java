package defpackage;

import java.nio.channels.FileChannel;
import java.util.ArrayList;

/* JADX INFO: renamed from: l٘٘ؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17985l extends AbstractC16847l {
    public C2955l amazon;

    @Override // defpackage.AbstractC16847l
    public final void billing(FileChannel fileChannel, String str) throws C9511l {
        C2955l c2955l = this.amazon;
        c2955l.getClass();
        c2955l.amazon(new C13188l(null, new ArrayList(), false), fileChannel, str);
    }

    @Override // defpackage.AbstractC16847l
    public final void mopub(InterfaceC13280l interfaceC13280l, FileChannel fileChannel, String str) throws C9511l {
        this.amazon.amazon(interfaceC13280l, fileChannel, str);
    }
}
