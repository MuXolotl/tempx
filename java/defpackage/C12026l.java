package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِٟۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12026l implements InterfaceC8885l {
    public InterfaceC6497l crashlytics;
    public C6973l loadAd;
    public final InterfaceC8533l yandex;

    public C12026l(InterfaceC8533l interfaceC8533l) {
        this.yandex = interfaceC8533l;
    }

    public final boolean loadAd(int i) {
        Function1 function1;
        InterfaceC8533l interfaceC8533l;
        if (i == 7) {
            C6973l c6973l = this.loadAd;
            if (c6973l == null) {
                c6973l = null;
            }
            function1 = c6973l.yandex;
        } else {
            if (i == 2) {
                C6973l c6973l2 = this.loadAd;
                if (c6973l2 == null) {
                    c6973l2 = null;
                }
                c6973l2.getClass();
            } else if (i == 6) {
                C6973l c6973l3 = this.loadAd;
                if (c6973l3 == null) {
                    c6973l3 = null;
                }
                c6973l3.getClass();
            } else if (i == 5) {
                C6973l c6973l4 = this.loadAd;
                if (c6973l4 == null) {
                    c6973l4 = null;
                }
                c6973l4.getClass();
            } else if (i == 3) {
                C6973l c6973l5 = this.loadAd;
                if (c6973l5 == null) {
                    c6973l5 = null;
                }
                function1 = c6973l5.loadAd;
            } else if (i == 4) {
                C6973l c6973l6 = this.loadAd;
                if (c6973l6 == null) {
                    c6973l6 = null;
                }
                c6973l6.getClass();
            } else if (i != 1 && i != 0) {
                C8339l.smaato("invalid ImeAction");
                return false;
            }
            function1 = null;
        }
        if (function1 != null) {
            function1.invoke(this);
            return true;
        }
        if (i == 6) {
            InterfaceC6497l interfaceC6497l = this.crashlytics;
            ((C15552l) (interfaceC6497l != null ? interfaceC6497l : null)).mopub(1, true);
        } else if (i == 5) {
            InterfaceC6497l interfaceC6497l2 = this.crashlytics;
            ((C15552l) (interfaceC6497l2 != null ? interfaceC6497l2 : null)).mopub(2, true);
        } else {
            if (i != 7 || (interfaceC8533l = this.yandex) == null) {
                return false;
            }
            ((C4666l) interfaceC8533l).yandex();
        }
        return true;
    }

    @Override // defpackage.InterfaceC8885l
    public final void yandex(int i) {
    }
}
