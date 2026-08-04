package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًٓؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14012l extends C7119l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final int f27319l;

    public C14012l(int i, int i2, Function1 function1) {
        super(i, function1);
        this.f27319l = i2;
        if (i2 == 1) {
            C10754l.license(AbstractC18202l.yandex.loadAd(C7119l.class).license(), " instead", "This implementation does not support suspension for senders, use ");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        C10754l.metrica(AbstractC15560l.tapsense("Buffered channel capacity must be at least 1, but ", i, " was specified"));
        throw null;
    }

    @Override // defpackage.C7119l, defpackage.InterfaceC0389l
    public final Object amazon(Object obj) {
        return m3831catch(obj, false);
    }

    @Override // defpackage.C7119l
    public final boolean appmetrica() {
        return this.f27319l == 2;
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final Object m3831catch(Object obj, boolean z) {
        Function1 function1;
        C6451l c6451lCrashlytics;
        InterfaceC15894l interfaceC15894l = null;
        if (this.f27319l == 3) {
            Object objAmazon = super.amazon(obj);
            if (!(objAmazon instanceof C15230l) || (objAmazon instanceof C14638l)) {
                return objAmazon;
            }
            if (!z || (function1 = this.f14924l) == null || (c6451lCrashlytics = AbstractC16829l.crashlytics(function1, obj, null)) == null) {
                return Unit.INSTANCE;
            }
            throw c6451lCrashlytics;
        }
        Object obj2 = obj;
        InterfaceC8396l interfaceC8396l = AbstractC14503l.amazon;
        C12611l c12611l = (C12611l) C7119l.f14915l.get(this);
        while (true) {
            long andIncrement = C7119l.f14918l.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean zSignatures = signatures(andIncrement, false);
            int i = AbstractC14503l.loadAd;
            long j2 = i;
            long j3 = j / j2;
            interfaceC15894l = interfaceC15894l;
            int i2 = (int) (j % j2);
            if (c12611l.f32620l != j3) {
                C12611l c12611lYandex = C7119l.yandex(this, j3, c12611l);
                if (c12611lYandex != null) {
                    c12611l = c12611lYandex;
                } else if (zSignatures) {
                    return new C14638l(ad());
                }
            }
            int iMopub = C7119l.mopub(this, c12611l, i2, obj2, j, interfaceC8396l, zSignatures);
            if (iMopub == 0) {
                c12611l.loadAd();
                return Unit.INSTANCE;
            }
            if (iMopub == 1) {
                return Unit.INSTANCE;
            }
            if (iMopub == 2) {
                if (zSignatures) {
                    c12611l.subs();
                    return new C14638l(ad());
                }
                InterfaceC15894l interfaceC15894l2 = interfaceC8396l instanceof InterfaceC15894l ? (InterfaceC15894l) interfaceC8396l : interfaceC15894l;
                if (interfaceC15894l2 != null) {
                    interfaceC15894l2.loadAd(c12611l, i2 + i);
                }
                remoteconfig((c12611l.f32620l * j2) + ((long) i2));
                return Unit.INSTANCE;
            }
            if (iMopub == 3) {
                C8339l.smaato("unexpected");
                return interfaceC15894l;
            }
            if (iMopub == 4) {
                if (j < C7119l.f14917l.get(this)) {
                    c12611l.loadAd();
                }
                return new C14638l(ad());
            }
            if (iMopub == 5) {
                c12611l.loadAd();
            }
            obj2 = obj;
        }
    }

    @Override // defpackage.C7119l, defpackage.InterfaceC0389l
    public final Object loadAd(InterfaceC14029l interfaceC14029l, Object obj) throws Throwable {
        C6451l c6451lCrashlytics;
        if (!(m3831catch(obj, true) instanceof C14638l)) {
            return Unit.INSTANCE;
        }
        Function1 function1 = this.f14924l;
        if (function1 == null || (c6451lCrashlytics = AbstractC16829l.crashlytics(function1, obj, null)) == null) {
            throw ad();
        }
        AbstractC11718l.yandex(c6451lCrashlytics, ad());
        throw c6451lCrashlytics;
    }
}
