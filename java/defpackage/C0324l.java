package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lؑٔؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0324l implements InterfaceC17842l {
    public final Function0 amazon;
    public final Function4 crashlytics;
    public final boolean loadAd;
    public final /* synthetic */ InterfaceC17842l yandex;
    public final C18662l purchase = AbstractC18263l.purchase(this);
    public final C11919l billing = new C11919l(Boolean.TRUE);
    public final C11919l mopub = new C11919l(Boolean.FALSE);
    public final C11919l admob = new C11919l("");
    public final C11919l subs = new C11919l(C11507l.f23131l);

    public C0324l(InterfaceC17842l interfaceC17842l, boolean z, Function4 function4, Function0 function0) {
        this.yandex = interfaceC17842l;
        this.loadAd = z;
        this.crashlytics = function4;
        this.amazon = function0;
        InterfaceC12356l interfaceC12356lLoadAd = interfaceC17842l.loadAd();
        interfaceC12356lLoadAd.mopub(new C17326l(interfaceC12356lLoadAd, this, 5));
    }

    @Override // defpackage.InterfaceC17842l
    public final C10023l amazon() {
        return this.yandex.amazon();
    }

    @Override // defpackage.InterfaceC17842l
    public final C4917l billing() {
        return this.yandex.billing();
    }

    @Override // defpackage.InterfaceC17842l
    public final C6921l crashlytics() {
        return this.yandex.crashlytics();
    }

    @Override // defpackage.InterfaceC17842l
    public final InterfaceC12356l loadAd() {
        return this.yandex.loadAd();
    }

    @Override // defpackage.InterfaceC17842l
    public final InterfaceC9573l purchase() {
        return this.yandex.purchase();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object yandex(AbstractC0283l abstractC0283l) {
        C1509l c1509l;
        Object c18435l;
        C0324l c0324l;
        List<C3346l> list;
        C11919l c11919l = this.admob;
        if (abstractC0283l instanceof C1509l) {
            c1509l = (C1509l) abstractC0283l;
            int i = c1509l.f3759l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c1509l.f3759l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c1509l = new C1509l(this, abstractC0283l);
            }
        } else {
            c1509l = new C1509l(this, abstractC0283l);
        }
        C1509l c1509l2 = c1509l;
        Object objCrashlytics = c1509l2.f3760l;
        int i2 = c1509l2.f3759l;
        C11919l c11919l2 = this.billing;
        boolean z = true;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(objCrashlytics);
                c11919l2.subscription(Boolean.TRUE);
                int length = ((CharSequence) c11919l.admob()).length();
                boolean z2 = this.loadAd;
                C11919l c11919l3 = this.subs;
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (length > 0) {
                    C7644l c7644lLoadAd = AbstractC16584l.loadAd();
                    String str = (String) c11919l.admob();
                    long j = ((C4645l) AbstractC16584l.loadAd().f15735l).yandex;
                    int iPro = ((AbstractC18082l) c11919l3.admob()).pro();
                    List listSingletonList = z2 ? Collections.singletonList("owned") : Collections.singletonList("all");
                    Long l = new Long(j);
                    c1509l2.f3761l = this;
                    c1509l2.f3759l = 1;
                    objCrashlytics = AbstractC14312l.purchase(c7644lLoadAd, str, iPro, l, listSingletonList, c1509l2);
                    if (objCrashlytics != enumC9342l) {
                        c0324l = this;
                        list = ((C18292l) AbstractC10802l.subs((AbstractC14237l) objCrashlytics)).loadAd;
                    }
                } else {
                    C7644l c7644lLoadAd2 = AbstractC16584l.loadAd();
                    long j2 = ((C4645l) AbstractC16584l.loadAd().f15735l).yandex;
                    int iPro2 = ((AbstractC18082l) c11919l3.admob()).pro();
                    List listSingletonList2 = z2 ? Collections.singletonList("owned") : Collections.singletonList("all");
                    Integer num = new Integer(iPro2);
                    Long l2 = new Long(j2);
                    c1509l2.f3761l = this;
                    c1509l2.f3759l = 2;
                    objCrashlytics = AbstractC14312l.crashlytics(c7644lLoadAd2, num, l2, listSingletonList2, c1509l2, 376);
                    if (objCrashlytics != enumC9342l) {
                        c0324l = this;
                        list = ((C18292l) AbstractC10802l.subs((AbstractC14237l) objCrashlytics)).loadAd;
                    }
                }
                return enumC9342l;
            }
            if (i2 == 1) {
                c0324l = c1509l2.f3761l;
                AbstractC2829l.crashlytics(objCrashlytics);
                list = ((C18292l) AbstractC10802l.subs((AbstractC14237l) objCrashlytics)).loadAd;
            } else {
                if (i2 != 2) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c0324l = c1509l2.f3761l;
                AbstractC2829l.crashlytics(objCrashlytics);
                list = ((C18292l) AbstractC10802l.subs((AbstractC14237l) objCrashlytics)).loadAd;
            }
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
            for (C3346l c3346l : list) {
                StringBuilder sb = new StringBuilder();
                sb.append((Object) String.valueOf(c3346l.loadAd));
                sb.append('_');
                sb.append(c3346l.yandex);
                arrayList.add(new C15661l(c3346l, sb.toString()));
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList) {
                if (((C15661l) obj).loadAd.loadAd == ((C4645l) AbstractC16584l.loadAd().f15735l).yandex) {
                    arrayList2.add(obj);
                } else {
                    arrayList3.add(obj);
                }
            }
            C11919l c11919l4 = c0324l.subs;
            boolean z3 = ((AbstractC18082l) c11919l4.admob()).isEmpty() && !arrayList3.isEmpty();
            Object objM4212class = AbstractC16901l.m4212class((List) c11919l4.admob());
            C15661l c15661l = objM4212class instanceof C15661l ? (C15661l) objM4212class : null;
            boolean z4 = z3 || (c15661l != null && (c15661l.loadAd.loadAd > ((C4645l) AbstractC16584l.loadAd().f15735l).yandex ? 1 : (c15661l.loadAd.loadAd == ((C4645l) AbstractC16584l.loadAd().f15735l).yandex ? 0 : -1)) == 0);
            C10227l c10227lAdmob = AbstractC14055l.admob();
            c10227lAdmob.addAll(arrayList2);
            if (z4) {
                c10227lAdmob.add(C5631l.yandex);
            }
            c10227lAdmob.addAll(arrayList3);
            c11919l4.subscription(((AbstractC18082l) c11919l4.admob()).advert(AbstractC14055l.purchase(c10227lAdmob)));
            C11919l c11919l5 = c0324l.mopub;
            if (list.size() != 120) {
                z = false;
            }
            c11919l5.subscription(Boolean.valueOf(z));
            c18435l = Unit.INSTANCE;
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        Throwable thYandex = C1171l.yandex(c18435l);
        if (thYandex != null) {
            thYandex.printStackTrace();
            this.mopub.subscription(Boolean.FALSE);
        }
        c11919l2.subscription(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
