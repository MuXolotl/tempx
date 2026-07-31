package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lٌؙ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17785l implements InterfaceC7523l {
    public final C12823l yandex;

    public C17785l(C12823l c12823l) {
        this.yandex = c12823l;
    }

    @Override // defpackage.InterfaceC7523l
    public final Object loadAd(int i, int i2, C8674l c8674l) throws Throwable {
        C16552l c16552l = AbstractC11463l.yandex;
        Object objFirebase = AbstractC10999l.firebase(AbstractC17278l.yandex, new C13017l(this, i2, i, (InterfaceC14029l) null), c8674l);
        return objFirebase == EnumC9342l.f19165l ? objFirebase : Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC7523l
    public final void yandex(final float f) {
        ((C4520l) this.yandex.f25198l).post(new Runnable() { // from class: lَؙۛ
            @Override // java.lang.Runnable
            public final void run() {
                C12823l c12823l = this.f14146l.yandex;
                ((C4520l) c12823l.f25198l).setIndeterminate(false);
                Object obj = c12823l.f25198l;
                ((C4520l) obj).setMax(100);
                ((C4520l) obj).yandex(AbstractC8576l.billing((int) (f * 100.0f), new C8934l(0, 100, 1)), true);
            }
        });
    }
}
