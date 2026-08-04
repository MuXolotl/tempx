package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؙٝٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6613l extends AbstractC5563l implements Function2 {
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws IOException {
        AbstractC2829l.crashlytics(obj);
        VKXApplication.Companion companion = VKXApplication.f36628l;
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        InputStream inputStreamOpen = vKXApplication.getAssets().open("vkx_eq_prebuilt.json");
        try {
            C15913l c15913l = AbstractC8237l.amazon;
            c15913l.getClass();
            List list = (List) AbstractC7876l.crashlytics(c15913l, new C0087l(C11359l.Companion.serializer(), 0), inputStreamOpen);
            AbstractC7876l.loadAd(inputStreamOpen, null);
            return list;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC7876l.loadAd(inputStreamOpen, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C6613l(2, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C6613l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
