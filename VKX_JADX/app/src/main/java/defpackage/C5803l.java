package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lؘٛ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5803l implements InterfaceC17842l {
    public final C11919l admob;
    public final C10740l amazon;
    public final C11919l billing;
    public final C5834l crashlytics;
    public final C11919l isPro;
    public final C3151l loadAd;
    public final C11919l mopub;
    public final C18662l purchase = AbstractC18263l.purchase(this);
    public final C11919l subs;
    public final /* synthetic */ InterfaceC17842l yandex;

    public C5803l(InterfaceC17842l interfaceC17842l, C3151l c3151l, C5834l c5834l, C10740l c10740l) {
        this.yandex = interfaceC17842l;
        this.loadAd = c3151l;
        this.crashlytics = c5834l;
        this.amazon = c10740l;
        C7206l c7206l = C7206l.yandex;
        this.billing = new C11919l(Boolean.valueOf(!C7206l.crashlytics(EnumC10788l.f21811l)));
        this.mopub = new C11919l(Boolean.TRUE);
        this.admob = new C11919l(Boolean.FALSE);
        this.subs = new C11919l("");
        this.isPro = new C11919l(C11507l.f23131l);
        InterfaceC12356l interfaceC12356lLoadAd = interfaceC17842l.loadAd();
        interfaceC12356lLoadAd.mopub(new C17326l(interfaceC12356lLoadAd, this, 3));
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
        C11355l c11355l;
        Object c18435l;
        C5803l c5803l;
        List<C2757l> list;
        C11919l c11919l = this.subs;
        if (abstractC0283l instanceof C11355l) {
            c11355l = (C11355l) abstractC0283l;
            int i = c11355l.f22899l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c11355l.f22899l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c11355l = new C11355l(this, abstractC0283l);
            }
        } else {
            c11355l = new C11355l(this, abstractC0283l);
        }
        C11355l c11355l2 = c11355l;
        Object objLoadAd = c11355l2.f22900l;
        int i2 = c11355l2.f22899l;
        C11919l c11919l2 = this.mopub;
        boolean z = true;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(objLoadAd);
                c11919l2.subscription(Boolean.TRUE);
                int length = ((CharSequence) c11919l.admob()).length();
                C11919l c11919l3 = this.isPro;
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (length > 0) {
                    C7644l c7644lLoadAd = AbstractC16584l.loadAd();
                    String str = (String) c11919l.admob();
                    long j = ((C4645l) AbstractC16584l.loadAd().f15735l).yandex;
                    int iPro = ((AbstractC18082l) c11919l3.admob()).pro();
                    C9793l c9793l = EnumC17226l.Companion;
                    Long l = new Long(j);
                    c11355l2.f22901l = this;
                    c11355l2.f22899l = 1;
                    objLoadAd = AbstractC14312l.amazon(c7644lLoadAd, str, iPro, l, c11355l2);
                    if (objLoadAd != enumC9342l) {
                        c5803l = this;
                        list = ((C5619l) AbstractC10802l.subs((AbstractC14237l) objLoadAd)).loadAd;
                    }
                } else {
                    C7644l c7644lLoadAd2 = AbstractC16584l.loadAd();
                    long j2 = ((C4645l) AbstractC16584l.loadAd().f15735l).yandex;
                    int iPro2 = ((AbstractC18082l) c11919l3.admob()).pro();
                    Long l2 = new Long(j2);
                    c11355l2.f22901l = this;
                    c11355l2.f22899l = 2;
                    objLoadAd = AbstractC14312l.loadAd(c7644lLoadAd2, iPro2, 120, l2, null, c11355l2, 16376);
                    if (objLoadAd != enumC9342l) {
                        c5803l = this;
                        list = ((C4363l) AbstractC10802l.subs((AbstractC14237l) objLoadAd)).loadAd;
                    }
                }
                return enumC9342l;
            }
            if (i2 == 1) {
                c5803l = c11355l2.f22901l;
                AbstractC2829l.crashlytics(objLoadAd);
                list = ((C5619l) AbstractC10802l.subs((AbstractC14237l) objLoadAd)).loadAd;
            } else {
                if (i2 != 2) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c5803l = c11355l2.f22901l;
                AbstractC2829l.crashlytics(objLoadAd);
                list = ((C4363l) AbstractC10802l.subs((AbstractC14237l) objLoadAd)).loadAd;
            }
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
            for (C2757l c2757l : list) {
                StringBuilder sb = new StringBuilder();
                sb.append((Object) String.valueOf(c2757l.crashlytics));
                sb.append('_');
                sb.append(c2757l.loadAd);
                arrayList.add(new C7933l(sb.toString(), c2757l));
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList) {
                if (((C7933l) obj).loadAd.crashlytics == ((C4645l) AbstractC16584l.loadAd().f15735l).yandex) {
                    arrayList2.add(obj);
                } else {
                    arrayList3.add(obj);
                }
            }
            C11919l c11919l4 = c5803l.isPro;
            boolean zIsEmpty = ((AbstractC18082l) c11919l4.admob()).isEmpty();
            boolean z2 = ((AbstractC18082l) c11919l4.admob()).isEmpty() && !arrayList3.isEmpty();
            Object objM4212class = AbstractC16901l.m4212class((List) c11919l4.admob());
            C7933l c7933l = objM4212class instanceof C7933l ? (C7933l) objM4212class : null;
            boolean z3 = z2 || (c7933l != null && (c7933l.loadAd.crashlytics > ((C4645l) AbstractC16584l.loadAd().f15735l).yandex ? 1 : (c7933l.loadAd.crashlytics == ((C4645l) AbstractC16584l.loadAd().f15735l).yandex ? 0 : -1)) == 0);
            C10227l c10227lAdmob = AbstractC14055l.admob();
            if (zIsEmpty) {
                c10227lAdmob.add(C17536l.yandex);
            }
            c10227lAdmob.addAll(arrayList2);
            if (z3) {
                c10227lAdmob.add(C5631l.yandex);
            }
            c10227lAdmob.addAll(arrayList3);
            c11919l4.subscription(((AbstractC18082l) c11919l4.admob()).advert(AbstractC14055l.purchase(c10227lAdmob)));
            C11919l c11919l5 = c5803l.admob;
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
            this.admob.subscription(Boolean.FALSE);
        }
        c11919l2.subscription(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
