package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lٌٍؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8532l {
    public static volatile ScheduledExecutorServiceC10335l yandex;
    public static final C4733l loadAd = new C4733l(C10441l.class, new C10754l(25));
    public static final C8873l crashlytics = new C8873l("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", new C10754l(26));
    public static final C5773l amazon = new C5773l(C11041l.class, new C10754l(27));
    public static final C9439l purchase = new C9439l("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", new C10754l(28));

    public static final InterfaceC8680l admob(InterfaceC12932l interfaceC12932l) {
        InterfaceC5763l interfaceC5763lMo245l = interfaceC12932l.mo245l(C6168l.f13001l);
        InterfaceC8680l interfaceC8680l = interfaceC5763lMo245l instanceof InterfaceC8680l ? (InterfaceC8680l) interfaceC5763lMo245l : null;
        return interfaceC8680l == null ? AbstractC3357l.yandex : interfaceC8680l;
    }

    public static final C13105l amazon(InterfaceC17477l interfaceC17477l, InterfaceC17477l interfaceC17477l2) {
        interfaceC17477l.isVip().size();
        interfaceC17477l2.isVip().size();
        List listIsVip = interfaceC17477l.isVip();
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listIsVip, 10));
        Iterator it = listIsVip.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC16902l) it.next()).metrica());
        }
        List listIsVip2 = interfaceC17477l2.isVip();
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(listIsVip2, 10));
        Iterator it2 = listIsVip2.iterator();
        while (true) {
            int i = 1;
            if (!it2.hasNext()) {
                return new C13105l(i, AbstractC8676l.subscription(AbstractC16901l.m4226l(arrayList2, arrayList)));
            }
            arrayList2.add(new C10636l(1, ((InterfaceC16902l) it2.next()).ad()));
        }
    }

    public static final Object billing(long j, InterfaceC14029l interfaceC14029l) {
        Object objPurchase = purchase(subs(j), interfaceC14029l);
        return objPurchase == EnumC9342l.f19165l ? objPurchase : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void crashlytics(AbstractC0283l abstractC0283l) {
        C6284l c6284l;
        if (abstractC0283l instanceof C6284l) {
            c6284l = (C6284l) abstractC0283l;
            int i = c6284l.f13239l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c6284l.f13239l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c6284l = new C6284l(abstractC0283l);
            }
        } else {
            c6284l = new C6284l(abstractC0283l);
        }
        Object obj = c6284l.f13240l;
        int i2 = c6284l.f13239l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c6284l.f13239l = 1;
            C2397l c2397l = new C2397l(1, AbstractC17082l.billing(c6284l));
            c2397l.license();
            if (c2397l.Signature() == EnumC9342l.f19165l) {
                return;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            AbstractC2829l.crashlytics(obj);
        }
        C17132l.firebase();
    }

    public static C11534l firebase(C9358l c9358l) throws GeneralSecurityException {
        C11534l c11534l = C11534l.f23199l;
        if (c9358l == C9358l.crashlytics) {
            return C11534l.f23193l;
        }
        if (c9358l == C9358l.billing || c9358l == C9358l.amazon) {
            return c11534l;
        }
        if (c9358l == C9358l.purchase) {
            return C11534l.f23196l;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(c9358l)));
    }

    public static C9358l isPro(C11534l c11534l) throws GeneralSecurityException {
        if (c11534l == C11534l.f23193l) {
            return C9358l.crashlytics;
        }
        if (c11534l == C11534l.f23199l) {
            return C9358l.billing;
        }
        if (c11534l == C11534l.f23196l) {
            return C9358l.purchase;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c11534l)));
    }

    public static InterfaceC17242l loadAd(InterfaceC17242l interfaceC17242l, C13315l c13315l, int i) {
        if ((i & 1) != 0) {
            C8896l c8896l = AbstractC11922l.yandex;
            c13315l = AbstractC0532l.admob(0.0f, 400.0f, new C4999l(4294967297L), 1);
        }
        return AbstractC0019l.amazon(interfaceC17242l).premium(new C4013l(c13315l));
    }

    public static final long mopub(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final Object purchase(long j, InterfaceC14029l interfaceC14029l) {
        if (j <= 0) {
            return Unit.INSTANCE;
        }
        C2397l c2397l = new C2397l(1, AbstractC17082l.billing(interfaceC14029l));
        c2397l.license();
        if (j < Long.MAX_VALUE) {
            admob(c2397l.f5166l).billing(j, c2397l);
        }
        Object objSignature = c2397l.Signature();
        return objSignature == EnumC9342l.f19165l ? objSignature : Unit.INSTANCE;
    }

    public static int smaato(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static final long subs(long j) {
        C6760l c6760l = C9658l.f19699l;
        boolean z = j > 0;
        if (z) {
            return C9658l.amazon(C9658l.mopub(j, AbstractC15918l.Signature(999999L, EnumC16636l.NANOSECONDS)));
        }
        if (!z) {
            return 0L;
        }
        C18725l.billing();
        return 0L;
    }

    public static final long yandex(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }
}
