package defpackage;

/* JADX INFO: renamed from: lؔؐۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C2316l {
    public final C17893l yandex = new C17893l(0, new C14438l[16]);
    public final C12463l loadAd = new C12463l(10);

    public void loadAd(C8634l c8634l) {
        C17893l c17893l = this.yandex;
        int i = c17893l.f34846l;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((C14438l) c17893l.f34848l[i]).amazon.loadAd == 0) {
                c17893l.vip(i);
            }
        }
    }

    public boolean yandex(C3994l c3994l, InterfaceC18212l interfaceC18212l, C8634l c8634l, boolean z) {
        C17893l c17893l = this.yandex;
        Object[] objArr = c17893l.f34848l;
        int i = c17893l.f34846l;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((C14438l) objArr[i2]).yandex(c3994l, interfaceC18212l, c8634l, z) || z2;
        }
        return z2;
    }
}
