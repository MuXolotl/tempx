package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؕٓۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3384l {
    public final /* synthetic */ int loadAd;
    public final Function2 yandex;

    public C3384l(int i, Function2 function2) {
        this.loadAd = i;
        this.yandex = function2;
    }

    public final float yandex(float f, InterfaceC18212l interfaceC18212l, InterfaceC18212l interfaceC18212l2) {
        switch (this.loadAd) {
            case 0:
                return Float.intBitsToFloat((int) (interfaceC18212l2.mo2593throws(interfaceC18212l, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(((int) (interfaceC18212l.smaato() >> 32)) / 2.0f) << 32)) & 4294967295L));
            default:
                return Float.intBitsToFloat((int) (interfaceC18212l2.mo2593throws(interfaceC18212l, (((long) Float.floatToRawIntBits(((int) (interfaceC18212l.smaato() & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)) >> 32));
        }
    }
}
