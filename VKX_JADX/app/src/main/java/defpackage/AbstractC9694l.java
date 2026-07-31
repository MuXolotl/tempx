package defpackage;

import android.content.res.Resources;
import android.view.GestureDetector;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.isPro;
import androidx.recyclerview.widget.subs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import ua.itaysonlab.catalogkit.objects.Catalog2Section;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.ui.ThemedRecyclerView;

/* JADX INFO: renamed from: lٍٜ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9694l extends AbstractC3372l implements InterfaceC1982l, InterfaceC0489l, InterfaceC16867l {

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public String f19769l;

    /* JADX INFO: renamed from: lؒٓؐ, reason: contains not printable characters */
    public final C10086l f19770l;

    /* JADX INFO: renamed from: lؕۦؓ, reason: contains not printable characters */
    public final C10086l f19771l;

    /* JADX INFO: renamed from: lؖ۠ٙ, reason: contains not printable characters */
    public boolean f19772l;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public C9554l f19774l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public String f19776l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public String f19777l;

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public final ArrayList f19773l = new ArrayList();

    /* JADX INFO: renamed from: lؘْٙ, reason: contains not printable characters */
    public final LinkedHashMap f19775l = new LinkedHashMap();

    public AbstractC9694l(String str) {
        this.f19776l = str;
        C16076l c16076l = VKXApplication.f36632l;
        this.f19770l = AbstractC8020l.smaato((c16076l == null ? null : c16076l).f31521l.amazon);
        C16076l c16076l2 = VKXApplication.f36632l;
        this.f19771l = AbstractC8020l.smaato((c16076l2 != null ? c16076l2 : null).purchase());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    public static Object m2716l(AbstractC9694l abstractC9694l, int i, AbstractC0283l abstractC0283l) {
        C17965l c17965l;
        AbstractC8189l abstractC8189lMo226l;
        if (abstractC0283l instanceof C17965l) {
            c17965l = (C17965l) abstractC0283l;
            int i2 = c17965l.f34971l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c17965l.f34971l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c17965l = new C17965l(abstractC9694l, abstractC0283l);
            }
        } else {
            c17965l = new C17965l(abstractC9694l, abstractC0283l);
        }
        Object objMopub = c17965l.f34970l;
        int i3 = c17965l.f34971l;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(objMopub);
            if (abstractC9694l.f19776l != null) {
                Cgoto cgotoMo781return = abstractC9694l.mo781return();
                String str = abstractC9694l.f19776l;
                cgotoMo781return.getClass();
                abstractC8189lMo226l = new C12772l(str, 13);
            } else {
                abstractC8189lMo226l = abstractC9694l.mo781return().mo226l();
            }
            abstractC8189lMo226l.loadAd = abstractC9694l.m2722l();
            abstractC8189lMo226l.remoteconfig(new Integer(1), "need_blocks");
            abstractC8189lMo226l.vip("start_from", abstractC9694l.f19777l);
            c17965l.f34971l = 1;
            objMopub = abstractC8189lMo226l.mopub(c17965l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objMopub == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i3 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objMopub);
        }
        return Collections.singletonList(objMopub);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0248, code lost:
    
        if (r1 == r10) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0149, code lost:
    
        if (r1 == r10) goto L152;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: lَٖؔ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object m2717l(defpackage.AbstractC9694l r16, java.util.List r17, defpackage.AbstractC0283l r18) {
        /*
            Method dump skipped, instruction units count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC9694l.m2717l(lٍٜ٘, java.util.List, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        if (defpackage.AbstractC10999l.firebase(r8, r1, r0) == r5) goto L25;
     */
    /* JADX INFO: renamed from: protected, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m2718protected(defpackage.AbstractC9694l r7, java.lang.String r8, defpackage.AbstractC0283l r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof defpackage.C17682l
            if (r0 == 0) goto L13
            r0 = r9
            lؙ٘ؖ r0 = (defpackage.C17682l) r0
            int r1 = r0.f34466l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34466l = r1
            goto L18
        L13:
            lؙ٘ؖ r0 = new lؙ٘ؖ
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f34465l
            int r1 = r0.f34466l
            r2 = 2
            r3 = 1
            r4 = 0
            lٍؗؐ r5 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.AbstractC2829l.crashlytics(r9)
            goto L77
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r7)
            return r4
        L31:
            defpackage.AbstractC2829l.crashlytics(r9)
            goto L61
        L35:
            defpackage.AbstractC2829l.crashlytics(r9)
            java.lang.String r9 = "/#"
            java.lang.String[] r9 = new java.lang.String[]{r9}
            r1 = 6
            java.util.List r8 = defpackage.AbstractC12024l.m3338public(r8, r9, r1)
            java.lang.Object r8 = defpackage.AbstractC16901l.m4220for(r3, r8)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L4e
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L4e:
            lٖۖ r9 = defpackage.AbstractC11463l.yandex
            lؙۙؑ r9 = defpackage.ExecutorC6708l.f14063l
            lٗ۠ۗ r1 = new lٗ۠ۗ
            r6 = 5
            r1.<init>(r8, r7, r4, r6)
            r0.f34466l = r3
            java.lang.Object r9 = defpackage.AbstractC10999l.firebase(r9, r1, r0)
            if (r9 != r5) goto L61
            goto L76
        L61:
            ua.itaysonlab.catalogkit.objects.Catalog2Response r9 = (ua.itaysonlab.catalogkit.objects.Catalog2Response) r9
            lٖۖ r8 = defpackage.AbstractC11463l.yandex
            lؔۢؒ r8 = defpackage.AbstractC17278l.yandex
            lؔۢؒ r8 = r8.f6462l
            lًْٛ r1 = new lًْٛ
            r1.<init>(r7, r9, r4, r3)
            r0.f34466l = r2
            java.lang.Object r7 = defpackage.AbstractC10999l.firebase(r8, r1, r0)
            if (r7 != r5) goto L77
        L76:
            return r5
        L77:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC9694l.m2718protected(lٍٜ٘, java.lang.String, lّؑۧ):java.lang.Object");
    }

    @Override // defpackage.InterfaceC1982l
    public final void Signature(InterfaceC17817l interfaceC17817l, boolean z) {
        AbstractC9092l.crashlytics((AppActivity) isVip(), interfaceC17817l, new C13305l(null, 0L, null, false, false, z, 95));
    }

    @Override // defpackage.InterfaceC1982l
    public final void admob(String str) {
        AbstractC9033l.crashlytics((AppActivity) isVip(), new C17455l(str, this, (InterfaceC14029l) null, 4));
    }

    @Override // defpackage.InterfaceC1982l
    public final void ads(int i, String str, List list) {
        Object objPrevious;
        ArrayList arrayList = this.f19773l;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!AbstractC8576l.yandex(((Catalog2Block) objPrevious).getYandex(), str));
        AppActivity appActivity = (AppActivity) isVip();
        C7108l c7108l = new C7108l(str, smaato());
        AudioTrack audioTrack = (AudioTrack) AbstractC16901l.m4220for(i, list);
        String strBilling = audioTrack != null ? AbstractC16676l.billing(audioTrack) : null;
        AbstractC9092l.crashlytics(appActivity, c7108l, new C13305l(strBilling != null ? new C11392l(strBilling) : C4618l.yandex, 0L, list, false, false, false, 122));
    }

    @Override // defpackage.InterfaceC1982l
    public boolean amazon() {
        return false;
    }

    @Override // defpackage.AbstractC3372l
    /* JADX INFO: renamed from: break */
    public Object mo850break(int i, InterfaceC14029l interfaceC14029l) {
        return m2716l(this, i, (AbstractC0283l) interfaceC14029l);
    }

    @Override // defpackage.AbstractC11519l, defpackage.AbstractC2484l
    /* JADX INFO: renamed from: case */
    public final AbstractC14412l mo647case() {
        return mo781return().mo203l() ? new C12375l() : mo781return().mo227l();
    }

    /* JADX INFO: renamed from: const, reason: not valid java name */
    public final void m2719const(String str) {
        AbstractC9033l.loadAd(this, isVip(), false, new C17455l(this, str, (InterfaceC14029l) null, 1));
    }

    @Override // defpackage.InterfaceC1982l
    public final void crashlytics(String str) {
        AbstractC9033l.crashlytics((AppActivity) isVip(), new C17455l(str, this, (InterfaceC14029l) null, 6));
    }

    @Override // defpackage.AbstractC11519l
    /* JADX INFO: renamed from: finally */
    public final void mo2421finally() {
        ThemedRecyclerView themedRecyclerView = this.f23157l;
        if (themedRecyclerView == null) {
            themedRecyclerView = null;
        }
        isPro layoutManager = themedRecyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null && !this.f23171l && linearLayoutManager.m75l() >= m1338try().mopub() - 1 && this.f23160l) {
            int i = this.f23167l + this.f23161l;
            this.f23167l = i;
            mo1337abstract(i);
        }
    }

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public final void m2720implements(List list, Integer num) {
        int iIntValue = num != null ? num.intValue() : 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Catalog2Block catalog2Block = (Catalog2Block) it.next();
            String yandex = catalog2Block.getYandex();
            LinkedHashMap linkedHashMap = this.f19775l;
            if (linkedHashMap.containsKey(yandex)) {
                subs subsVar = (subs) linkedHashMap.get(catalog2Block.getYandex());
                List listPurchase = catalog2Block.purchase();
                if (!listPurchase.isEmpty() && (subsVar instanceof AbstractC14630l)) {
                    Map mapCrashlytics = catalog2Block.crashlytics(this.f19774l);
                    AbstractC14630l abstractC14630l = (AbstractC14630l) subsVar;
                    C10227l c10227lAdmob = AbstractC14055l.admob();
                    c10227lAdmob.addAll(abstractC14630l.f28630l.billing);
                    ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listPurchase, 10));
                    Iterator it2 = listPurchase.iterator();
                    while (it2.hasNext()) {
                        arrayList.add((InterfaceC12360l) mapCrashlytics.get((String) it2.next()));
                    }
                    c10227lAdmob.addAll(arrayList);
                    AbstractC10586l.isPro(abstractC14630l, AbstractC14055l.purchase(c10227lAdmob));
                }
            } else {
                String yandex2 = catalog2Block.getYandex();
                Catalog2Layout loadAd = catalog2Block.getLoadAd();
                C6408l c6408l = (C6408l) mo781return().f833l;
                Class<?> cls = loadAd.getClass();
                InterfaceC10654l interfaceC10654l = (InterfaceC10654l) c6408l.yandex.get(cls);
                if (interfaceC10654l == null) {
                    C11983l.subscription(33, cls.getSimpleName(), "No binder found for type ");
                    return;
                }
                subs subsVarYandex = interfaceC10654l.yandex(this, catalog2Block, catalog2Block.getLoadAd(), this.f19774l);
                if (num != null) {
                    m1338try().f4577l.yandex(iIntValue, subsVarYandex);
                    iIntValue++;
                } else {
                    m1338try().isVip(subsVarYandex);
                }
                List listPurchase2 = catalog2Block.purchase();
                if (!listPurchase2.isEmpty()) {
                    boolean z = catalog2Block instanceof Catalog2Block.ActionsBlock;
                    List list2 = C2580l.f5619l;
                    if (z) {
                        List list3 = ((Catalog2Block.ActionsBlock) catalog2Block).crashlytics;
                        if (list3 != null) {
                            list2 = list3;
                        }
                        AbstractC10586l.isPro(subsVarYandex, list2);
                    } else {
                        Map mapCrashlytics2 = catalog2Block.crashlytics(this.f19774l);
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it3 = listPurchase2.iterator();
                            while (it3.hasNext()) {
                                InterfaceC12360l interfaceC12360l = (InterfaceC12360l) mapCrashlytics2.get((String) it3.next());
                                if (interfaceC12360l != null) {
                                    arrayList2.add(interfaceC12360l);
                                }
                            }
                            list2 = arrayList2;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        AbstractC10586l.isPro(subsVarYandex, list2);
                    }
                }
                linkedHashMap.put(yandex2, subsVarYandex);
            }
        }
    }

    @Override // defpackage.AbstractC11519l
    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void mo2721import(Throwable th) {
        if (AbstractC17948l.purchase(th)) {
            Cgoto cgotoMo781return = mo781return();
            cgotoMo781return.getClass();
            if (cgotoMo781return instanceof C3985l) {
                InterfaceC14029l interfaceC14029l = null;
                AbstractC10999l.mopub(this, new C3273l(this), 0, new C6637l(this, new C13954l(this, interfaceC14029l, 4), interfaceC14029l, 13), 2);
                return;
            }
        }
        super.mo2721import(th);
    }

    public C18480l isPro() {
        throw new IllegalStateException("Not supported in current CatalogContext");
    }

    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    public final String m2722l() {
        return mo781return().mo226l().loadAd;
    }

    @Override // defpackage.AbstractC11519l
    /* JADX INFO: renamed from: new */
    public final subs mo1270new() {
        return new C2045l(new C14706l(true, 0), new subs[0]);
    }

    @Override // defpackage.AbstractC17777l
    public final void premium() {
        InterfaceC14029l interfaceC14029l = null;
        C15816l c15816l = new C15816l(this, interfaceC14029l, 0);
        C8490l c8490l = AbstractC6025l.yandex;
        C8084l c8084l = AbstractC6025l.loadAd;
        int i = 2;
        C2347l c2347l = new C2347l(new C10424l(c8084l, 18), new C15559l(c15816l, interfaceC14029l, 15), 2);
        C5268l c5268l = this.f34614l;
        EnumC8981l enumC8981l = EnumC8981l.f18524l;
        AbstractC0622l.startapp(AbstractC14024l.startapp(c2347l, c5268l, enumC8981l), AbstractC11738l.yandex(c5268l));
        int i2 = 1;
        int i3 = 19;
        int i4 = 17;
        AbstractC0622l.startapp(AbstractC14024l.startapp(new C2347l(new C10424l(c8084l, i3), new C15559l(new C15816l(this, interfaceC14029l, i2), interfaceC14029l, i4), 2), c5268l, enumC8981l), AbstractC11738l.yandex(c5268l));
        AbstractC0622l.startapp(AbstractC14024l.startapp(new C2347l(new C10424l(c8084l, 20), new C15559l(new C15816l(this, interfaceC14029l, i), interfaceC14029l, i3), 2), c5268l, enumC8981l), AbstractC11738l.yandex(c5268l));
        int i5 = 21;
        AbstractC0622l.startapp(AbstractC14024l.startapp(new C2347l(new C10424l(c8084l, i5), new C15559l(new C15816l(this, interfaceC14029l, 3), interfaceC14029l, i5), 2), c5268l, enumC8981l), AbstractC11738l.yandex(c5268l));
        AbstractC0622l.startapp(AbstractC14024l.startapp(new C2347l(new C10424l(c8084l, 22), new C15559l(new C4642l(this, null), interfaceC14029l, 9), 2), c5268l, enumC8981l), AbstractC11738l.yandex(c5268l));
        AbstractC0622l.startapp(AbstractC14024l.startapp(new C2347l(new C10424l(c8084l, 16), new C15559l(new C10481l(this, interfaceC14029l, i2), interfaceC14029l, 11), 2), c5268l, enumC8981l), AbstractC11738l.yandex(c5268l));
        AbstractC0622l.startapp(AbstractC14024l.startapp(new C2347l(new C10424l(c8084l, i4), new C15559l(new C10481l(this, interfaceC14029l, i), interfaceC14029l, 13), 2), c5268l, enumC8981l), AbstractC11738l.yandex(c5268l));
    }

    @Override // defpackage.InterfaceC1982l
    public final void purchase() {
        View view = this.f5280l;
        if (view == null) {
            view = null;
        }
        C12656l c12656l = view instanceof C12656l ? (C12656l) view : null;
        if (c12656l != null) {
            c12656l.setEnabled(false);
        }
    }

    /* JADX INFO: renamed from: return */
    public abstract Cgoto mo781return();

    @Override // defpackage.InterfaceC1982l
    public String smaato() {
        String str = this.f19769l;
        return str == null ? "Каталог" : str;
    }

    @Override // defpackage.InterfaceC0489l
    public final void subs() {
        try {
            ThemedRecyclerView themedRecyclerView = this.f23157l;
            if (themedRecyclerView == null) {
                themedRecyclerView = null;
            }
            themedRecyclerView.smoothScrollToPosition(0);
        } catch (Exception unused) {
        }
    }

    public boolean subscription() {
        return true;
    }

    @Override // defpackage.AbstractC11519l
    /* JADX INFO: renamed from: super */
    public final void mo1271super() {
        LinkedHashMap linkedHashMap = this.f19775l;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            m1338try().premium((subs) it.next());
        }
        linkedHashMap.clear();
        this.f19773l.clear();
        this.f19777l = null;
        this.f19776l = null;
    }

    @Override // defpackage.AbstractC3372l
    /* JADX INFO: renamed from: transient */
    public final Object mo1272transient(List list, InterfaceC14029l interfaceC14029l) {
        return m2717l(this, list, (AbstractC0283l) interfaceC14029l);
    }

    @Override // defpackage.AbstractC15988l, defpackage.AbstractC17777l
    /* JADX INFO: renamed from: volatile */
    public void mo783volatile(View view) {
        super.mo783volatile(view);
        C16678l c16678l = new C16678l(new C7221l(new C1770l(17, this)));
        ThemedRecyclerView themedRecyclerView = this.f23157l;
        if (themedRecyclerView == null) {
            themedRecyclerView = null;
        }
        RecyclerView recyclerView = c16678l.ads;
        if (recyclerView != themedRecyclerView) {
            C7666l c7666l = c16678l.isVip;
            if (recyclerView != null) {
                recyclerView.removeItemDecoration(c16678l);
                c16678l.ads.removeOnItemTouchListener(c7666l);
                c16678l.ads.removeOnChildAttachStateChangeListener(c16678l);
                ArrayList arrayList = c16678l.startapp;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C9603l c9603l = (C9603l) arrayList.get(0);
                    c9603l.mopub.cancel();
                    c16678l.remoteconfig.yandex(c9603l.purchase);
                }
                arrayList.clear();
                c16678l.pro = null;
                VelocityTracker velocityTracker = c16678l.tapsense;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    c16678l.tapsense = null;
                }
                C17011l c17011l = c16678l.advert;
                if (c17011l != null) {
                    c17011l.yandex = false;
                    c16678l.advert = null;
                }
                if (c16678l.ad != null) {
                    c16678l.ad = null;
                }
            }
            c16678l.ads = themedRecyclerView;
            if (themedRecyclerView != null) {
                Resources resources = themedRecyclerView.getResources();
                c16678l.billing = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
                c16678l.mopub = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
                c16678l.adcel = ViewConfiguration.get(c16678l.ads.getContext()).getScaledTouchSlop();
                c16678l.ads.addItemDecoration(c16678l);
                c16678l.ads.addOnItemTouchListener(c7666l);
                c16678l.ads.addOnChildAttachStateChangeListener(c16678l);
                c16678l.advert = new C17011l(c16678l);
                c16678l.ad = new GestureDetector(c16678l.ads.getContext(), c16678l.advert);
            }
        }
        ThemedRecyclerView themedRecyclerView2 = this.f23157l;
        if (themedRecyclerView2 == null) {
            themedRecyclerView2 = null;
        }
        themedRecyclerView2.setClipToPadding(false);
        ThemedRecyclerView themedRecyclerView3 = this.f23157l;
        ThemedRecyclerView themedRecyclerView4 = themedRecyclerView3 != null ? themedRecyclerView3 : null;
        mo781return().getClass();
        VKXApplication.Companion companion = VKXApplication.f36628l;
        themedRecyclerView4.setPadding(themedRecyclerView4.getPaddingLeft(), 0, themedRecyclerView4.getPaddingRight(), VKXApplication.Companion.yandex(8.0f));
    }

    /* JADX INFO: renamed from: lؙٗٙ */
    public void mo780l() {
    }

    @Override // defpackage.InterfaceC1982l
    public void ad(CatalogArtist catalogArtist) {
    }

    @Override // defpackage.InterfaceC1982l
    public void license(String str) {
    }

    /* JADX INFO: renamed from: lؔٙؕ */
    public Object mo779l(Catalog2Section catalog2Section, C9554l c9554l, InterfaceC14029l interfaceC14029l) {
        return catalog2Section;
    }
}
