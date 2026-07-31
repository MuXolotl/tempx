package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٕۥؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16042l extends AbstractC10581l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C14286l f31433l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C10086l f31435l = AbstractC8020l.smaato(Boolean.TRUE);

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C10086l f31434l = AbstractC8020l.smaato(C11507l.f23131l);

    public C16042l(C14286l c14286l) {
        this.f31433l = c14286l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: public, reason: not valid java name */
    public static final Object m4128public(C16042l c16042l, AbstractC0283l abstractC0283l) throws Throwable {
        C15016l c15016l;
        C10086l c10086l = c16042l.f31435l;
        if (abstractC0283l instanceof C15016l) {
            c15016l = (C15016l) abstractC0283l;
            int i = c15016l.f29540l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c15016l.f29540l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c15016l = new C15016l(c16042l, abstractC0283l);
            }
        } else {
            c15016l = new C15016l(c16042l, abstractC0283l);
        }
        Object obj = c15016l.f29539l;
        int i2 = c15016l.f29540l;
        InterfaceC14029l interfaceC14029l = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c10086l.setValue(Boolean.TRUE);
            C16552l c16552l = AbstractC11463l.yandex;
            ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
            C14951l c14951l = new C14951l(c16042l, interfaceC14029l, 29);
            c15016l.f29540l = 1;
            Object objFirebase = AbstractC10999l.firebase(executorC6708l, c14951l, c15016l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objFirebase == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        c10086l.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(-1760533067);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        byte b = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            Unit unit = Unit.INSTANCE;
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C8912l(this, null, 22);
                c6956l.m2147try(objM2132native);
            }
            AbstractC12311l.amazon(c6956l, unit, (Function2) objM2132native);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(-1682261895, new C3926l(this, b, b), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(-1898759740, new C12640l(this, b), c6956l), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3926l(this, i);
        }
    }
}
