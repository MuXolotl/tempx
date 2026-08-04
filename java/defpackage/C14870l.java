package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lْٔٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14870l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7721l f29102l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29103l;

    public /* synthetic */ C14870l(C7721l c7721l, int i) {
        this.f29103l = i;
        this.f29102l = c7721l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f29103l;
        byte b = 0;
        int i2 = 1;
        C7721l c7721l = this.f29102l;
        switch (i) {
            case 0:
                if (((Boolean) c7721l.f16206l.getValue()).booleanValue()) {
                    c7721l.m2205finally();
                } else {
                    c7721l.m2207public();
                }
                return Unit.INSTANCE;
            case 1:
                c7721l.getClass();
                AbstractC10999l.mopub(c7721l, null, 0, new C6586l(c7721l, b == true ? 1 : 0, i2), 3);
                return Unit.INSTANCE;
            case 2:
                VKXApplication vKXApplication = VKXApplication.f36631l;
                if (vKXApplication == null) {
                    vKXApplication = null;
                }
                vKXApplication.getApplicationContext();
                VKXApplication.Companion companion = VKXApplication.f36628l;
                VKXApplication vKXApplication2 = VKXApplication.f36631l;
                if (vKXApplication2 == null) {
                    vKXApplication2 = null;
                }
                Context applicationContext = vKXApplication2.getApplicationContext();
                C11610l c11610l = AbstractC3629l.yandex;
                C11610l c11610l2 = c11610l != null ? c11610l : null;
                C16076l c16076l = VKXApplication.f36632l;
                C17804l c17804lAmazon = AbstractC1213l.amazon(applicationContext, c11610l2, (c16076l != null ? c16076l : null).f31505l, new C5146l(22), new C1712l(14), (c16076l != null ? c16076l : null).f31519l);
                c17804lAmazon.mo2748break(new C13736l(2, 0, 1, 1, 0, false, true), false);
                c17804lAmazon.f34677l.yandex(new C15523l(i2, c7721l));
                return c17804lAmazon;
            default:
                boolean zBooleanValue = ((Boolean) c7721l.f16205l.getValue()).booleanValue();
                C11362l c11362l = c7721l.f16203l;
                return Integer.valueOf(zBooleanValue ? c11362l.size() + 1 : c11362l.size());
        }
    }
}
