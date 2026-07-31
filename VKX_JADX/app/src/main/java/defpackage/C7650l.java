package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚۦً, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7650l extends AbstractC11801l {

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C10086l f15745l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C10086l f15746l;

    public C7650l() {
        super(0);
        this.f15745l = AbstractC8020l.smaato(C11507l.f23131l);
        this.f15746l = AbstractC8020l.smaato(Boolean.FALSE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: import, reason: not valid java name */
    public static final Object m2191import(C7650l c7650l, AbstractC0283l abstractC0283l) {
        C8026l c8026l;
        AbstractC18082l abstractC18082l;
        Object obj;
        C7650l c7650l2;
        Object c18435l;
        List list;
        C10086l c10086l = c7650l.f15745l;
        EnumC1428l enumC1428l = EnumC1428l.ANDROID;
        if (abstractC0283l instanceof C8026l) {
            c8026l = (C8026l) abstractC0283l;
            int i = c8026l.f16714l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c8026l.f16714l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c8026l = new C8026l(c7650l, abstractC0283l);
            }
        } else {
            c8026l = new C8026l(c7650l, abstractC0283l);
        }
        Object obj2 = c8026l.f16710l;
        int i2 = c8026l.f16714l;
        int i3 = 10;
        boolean z = true;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj2);
            abstractC18082l = (AbstractC18082l) c10086l.getValue();
            try {
                C13568l c13568lM1817l = ((C5501l) ((C1770l) AbstractC16584l.yandex().isPro.f7482l).f4179l).m1817l(new C10111l("/UpdateService/QueryChangelog", C16661l.f32662l, C8222l.f17120l, 19));
                C16661l c16661l = new C16661l(enumC1428l, new C11193l(i3, ((AbstractC18082l) c10086l.getValue()).pro()), C3844l.f7950l);
                c8026l.f16713l = c7650l;
                c8026l.f16712l = c7650l;
                c8026l.f16715l = abstractC18082l;
                c8026l.f16714l = 1;
                Object objSmaato = c13568lM1817l.smaato(c16661l, c8026l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objSmaato == enumC9342l) {
                    return enumC9342l;
                }
                obj = objSmaato;
                c7650l2 = c7650l;
                if (((C8222l) obj).f17121l.size() == 10) {
                    z = false;
                }
                c7650l.f15746l.setValue(Boolean.valueOf(z));
                c18435l = (C8222l) obj;
            } catch (Throwable th) {
                th = th;
                c18435l = new C18435l(th);
                c7650l2 = c7650l;
                if (c18435l instanceof C18435l) {
                    c18435l = null;
                }
                C8222l c8222l = (C8222l) c18435l;
                if (c8222l != null) {
                }
                if (list == null) {
                    list = C2580l.f5619l;
                }
                c7650l2.f15745l.setValue(abstractC18082l.advert(list));
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC18082l abstractC18082l2 = c8026l.f16715l;
            c7650l2 = c8026l.f16712l;
            C7650l c7650l3 = c8026l.f16713l;
            try {
                AbstractC2829l.crashlytics(obj2);
                abstractC18082l = abstractC18082l2;
                c7650l = c7650l3;
                obj = obj2;
                try {
                    if (((C8222l) obj).f17121l.size() == 10) {
                        z = false;
                    }
                    c7650l.f15746l.setValue(Boolean.valueOf(z));
                    c18435l = (C8222l) obj;
                } catch (Throwable th2) {
                    C7650l c7650l4 = c7650l2;
                    th = th2;
                    c7650l = c7650l4;
                    c18435l = new C18435l(th);
                    c7650l2 = c7650l;
                }
            } catch (Throwable th3) {
                abstractC18082l = abstractC18082l2;
                c7650l = c7650l2;
                th = th3;
                c18435l = new C18435l(th);
                c7650l2 = c7650l;
                if (c18435l instanceof C18435l) {
                    c18435l = null;
                }
                C8222l c8222l2 = (C8222l) c18435l;
                list = c8222l2 != null ? c8222l2.f17121l : null;
                if (list == null) {
                    list = C2580l.f5619l;
                }
                c7650l2.f15745l.setValue(abstractC18082l.advert(list));
                return Unit.INSTANCE;
            }
        }
        if (c18435l instanceof C18435l) {
            c18435l = null;
        }
        C8222l c8222l3 = (C8222l) c18435l;
        if (c8222l3 != null) {
        }
        if (list == null) {
            list = C2580l.f5619l;
        }
        c7650l2.f15745l.setValue(abstractC18082l.advert(list));
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(1940726890);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        byte b = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            Unit unit = Unit.INSTANCE;
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C1669l(this, null, 0);
                c6956l.m2147try(objM2132native);
            }
            AbstractC12311l.amazon(c6956l, unit, (Function2) objM2132native);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(677356326, new C18332l(this, b, b), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(-1808276485, new C4855l(this, b), c6956l), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C18332l(this, i);
        }
    }
}
