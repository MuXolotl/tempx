package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؓۡؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2169l extends AbstractC10581l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C13884l f4810l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C10086l f4811l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final C10086l f4812l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C10086l f4813l = AbstractC8020l.smaato(Boolean.TRUE);

    public C2169l(C13884l c13884l) {
        this.f4810l = c13884l;
        C11507l c11507l = C11507l.f23131l;
        this.f4811l = AbstractC8020l.smaato(c11507l);
        this.f4812l = AbstractC8020l.smaato(c11507l);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: public, reason: not valid java name */
    public static final Object m1116public(C2169l c2169l, AbstractC0283l abstractC0283l) throws Throwable {
        C10823l c10823l;
        C10086l c10086l = c2169l.f4813l;
        if (abstractC0283l instanceof C10823l) {
            c10823l = (C10823l) abstractC0283l;
            int i = c10823l.f21881l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c10823l.f21881l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c10823l = new C10823l(c2169l, abstractC0283l);
            }
        } else {
            c10823l = new C10823l(c2169l, abstractC0283l);
        }
        Object obj = c10823l.f21880l;
        int i2 = c10823l.f21881l;
        InterfaceC14029l interfaceC14029l = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c10086l.setValue(Boolean.TRUE);
            C16552l c16552l = AbstractC11463l.yandex;
            ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
            C14951l c14951l = new C14951l(c2169l, interfaceC14029l, 28);
            c10823l.f21881l = 1;
            Object objFirebase = AbstractC10999l.firebase(executorC6708l, c14951l, c10823l);
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
        c6956l.m2133new(1954124309);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        byte b = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            Unit unit = Unit.INSTANCE;
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C8912l(this, null, 21);
                c6956l.m2147try(objM2132native);
            }
            AbstractC12311l.amazon(c6956l, unit, (Function2) objM2132native);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(1940121305, new C0894l(this, b, b), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(2016331172, new C6338l(this, b), c6956l), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0894l(this, i);
        }
    }
}
