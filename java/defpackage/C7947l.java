package defpackage;

import android.content.Context;
import android.os.Build;

/* JADX INFO: renamed from: lًِۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7947l implements InterfaceC11856l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Context f16544l;

    @Override // defpackage.InterfaceC11856l
    public InterfaceC17529l isPro(C1424l c1424l) {
        Context context;
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && ((context = this.f16544l) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new C2183l(11).isPro(c1424l);
        }
        int iAdmob = AbstractC3825l.admob(((C5978l) c1424l.f3601l).metrica);
        AbstractC6427l.firebase("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(AbstractC15323l.m3987volatile(iAdmob)));
        C8634l c8634l = new C8634l(new C9332l(iAdmob, 0), new C9332l(iAdmob, 1));
        c8634l.f17793l = true;
        return c8634l.isPro(c1424l);
    }
}
