package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.isPro;
import androidx.recyclerview.widget.subs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.catalogkit.objects.Catalog2Response;
import ua.itaysonlab.catalogkit.objects.Catalog2Text;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;
import ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems;
import ua.itaysonlab.vkapi2.objects.newsfeed.NewsfeedItem;
import ua.itaysonlab.vkapi2.objects.newsfeed.ProtoNewsfeedItem;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkxreborn.ui.ThemedRecyclerView;

/* JADX INFO: renamed from: lٌُ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8706l extends AbstractC3372l {

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public Integer f17906l;

    /* JADX INFO: renamed from: lؒٓؐ, reason: contains not printable characters */
    public final String f17907l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public String f17912l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public String f17913l;

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public List f17909l = C2580l.f5619l;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public final ArrayList f17910l = new ArrayList();

    /* JADX INFO: renamed from: lؘْٙ, reason: contains not printable characters */
    public final ArrayList f17911l = new ArrayList();

    /* JADX INFO: renamed from: lؖ۠ٙ, reason: contains not printable characters */
    public final C9554l f17908l = new C9554l(new Catalog2Response(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741823));

    public C8706l() {
        VKXApplication.Companion companion = VKXApplication.f36628l;
        this.f17907l = VKXApplication.Companion.loadAd(R.string.acc_news);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0099 A[PHI: r11
  0x0099: PHI (r11v3 int) = (r11v0 int), (r11v1 int), (r11v6 int) binds: [B:21:0x005a, B:30:0x0096, B:18:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e1 A[LOOP:0: B:42:0x00db->B:44:0x00e1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:49:0x0104  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.AbstractC3372l
    /* JADX INFO: renamed from: break */
    public final Object mo850break(int i, InterfaceC14029l interfaceC14029l) {
        C7249l c7249l;
        C8706l c8706l;
        C2975l c2975l;
        C0431l c0431l;
        C16184l c16184l;
        Integer num;
        int i2;
        Object objSubs;
        Function1 function1;
        Object objSubs2;
        Function1 function2;
        ArrayList arrayList;
        Iterator it;
        if (interfaceC14029l instanceof C7249l) {
            c7249l = (C7249l) interfaceC14029l;
            int i3 = c7249l.f15083l;
            if ((i3 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c7249l.f15083l = i3 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c7249l = new C7249l(this, (AbstractC0283l) interfaceC14029l);
            }
        } else {
            c7249l = new C7249l(this, (AbstractC0283l) interfaceC14029l);
        }
        Object objSubs3 = c7249l.f15086l;
        int i4 = c7249l.f15083l;
        int i5 = 1;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i4 != 0) {
            if (i4 == 1) {
                i = c7249l.f15085l;
                c8706l = (C8706l) c7249l.f15084l;
                AbstractC2829l.crashlytics(objSubs3);
                c8706l.f17909l = (List) ((VKResponseWithItems) objSubs3).yandex;
                C16552l c16552l = AbstractC11463l.yandex;
                c2975l = AbstractC17278l.yandex;
                c0431l = new C0431l(this, null);
                c7249l.f15084l = null;
                c7249l.f15085l = i;
                c7249l.f15083l = 2;
                if (AbstractC10999l.firebase(c2975l, c0431l, c7249l) != enumC9342l) {
                    c16184l = new C16184l(this, i5);
                    num = this.f17906l;
                    i2 = this.f23161l;
                    if (num == null) {
                        C12772l c12772l = new C12772l(i2, this.f17906l, this.f17912l);
                        c7249l.f15084l = c16184l;
                        c7249l.f15085l = i;
                        c7249l.f15083l = 4;
                        objSubs = c12772l.subs(c7249l);
                        if (objSubs != enumC9342l) {
                            objSubs3 = objSubs;
                            function1 = c16184l;
                            function1.invoke(objSubs3);
                            return (List) ((VKResponseWithItems) objSubs3).yandex;
                        }
                    } else {
                        C12772l c12772l2 = new C12772l(i2, this.f17912l);
                        c7249l.f15084l = c16184l;
                        c7249l.f15085l = i;
                        c7249l.f15083l = 3;
                        objSubs2 = c12772l2.subs(c7249l);
                        if (objSubs2 != enumC9342l) {
                            objSubs3 = objSubs2;
                            function2 = c16184l;
                            function2.invoke(objSubs3);
                            Iterable iterable = (Iterable) ((VKResponseWithItems) objSubs3).yandex;
                            arrayList = new ArrayList(AbstractC14055l.billing(iterable, 10));
                            it = iterable.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((ProtoNewsfeedItem) it.next()).yandex);
                            }
                            return arrayList;
                        }
                    }
                }
                return enumC9342l;
            }
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function1 = (Function1) c7249l.f15084l;
                    AbstractC2829l.crashlytics(objSubs3);
                    function1.invoke(objSubs3);
                    return (List) ((VKResponseWithItems) objSubs3).yandex;
                }
                function2 = (Function1) c7249l.f15084l;
                AbstractC2829l.crashlytics(objSubs3);
                function2.invoke(objSubs3);
                Iterable iterable2 = (Iterable) ((VKResponseWithItems) objSubs3).yandex;
                arrayList = new ArrayList(AbstractC14055l.billing(iterable2, 10));
                it = iterable2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ProtoNewsfeedItem) it.next()).yandex);
                }
                return arrayList;
            }
            i = c7249l.f15085l;
            AbstractC2829l.crashlytics(objSubs3);
            c16184l = new C16184l(this, i5);
            num = this.f17906l;
            i2 = this.f23161l;
            if (num == null && num.intValue() == -1) {
                C12772l c12772l3 = new C12772l(i2, this.f17912l);
                c7249l.f15084l = c16184l;
                c7249l.f15085l = i;
                c7249l.f15083l = 3;
                objSubs2 = c12772l3.subs(c7249l);
                if (objSubs2 != enumC9342l) {
                    objSubs3 = objSubs2;
                    function2 = c16184l;
                    function2.invoke(objSubs3);
                    Iterable iterable3 = (Iterable) ((VKResponseWithItems) objSubs3).yandex;
                    arrayList = new ArrayList(AbstractC14055l.billing(iterable3, 10));
                    it = iterable3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ProtoNewsfeedItem) it.next()).yandex);
                    }
                    return arrayList;
                }
            } else {
                C12772l c12772l4 = new C12772l(i2, this.f17906l, this.f17912l);
                c7249l.f15084l = c16184l;
                c7249l.f15085l = i;
                c7249l.f15083l = 4;
                objSubs = c12772l4.subs(c7249l);
                if (objSubs != enumC9342l) {
                    objSubs3 = objSubs;
                    function1 = c16184l;
                    function1.invoke(objSubs3);
                    return (List) ((VKResponseWithItems) objSubs3).yandex;
                }
            }
            return enumC9342l;
        }
        AbstractC2829l.crashlytics(objSubs3);
        if (i != 0) {
            c16184l = new C16184l(this, i5);
            num = this.f17906l;
            i2 = this.f23161l;
            if (num == null) {
                C12772l c12772l5 = new C12772l(i2, this.f17906l, this.f17912l);
                c7249l.f15084l = c16184l;
                c7249l.f15085l = i;
                c7249l.f15083l = 4;
                objSubs = c12772l5.subs(c7249l);
                if (objSubs != enumC9342l) {
                    objSubs3 = objSubs;
                    function1 = c16184l;
                    function1.invoke(objSubs3);
                    return (List) ((VKResponseWithItems) objSubs3).yandex;
                }
            } else {
                C12772l c12772l6 = new C12772l(i2, this.f17912l);
                c7249l.f15084l = c16184l;
                c7249l.f15085l = i;
                c7249l.f15083l = 3;
                objSubs2 = c12772l6.subs(c7249l);
                if (objSubs2 != enumC9342l) {
                    objSubs3 = objSubs2;
                    function2 = c16184l;
                    function2.invoke(objSubs3);
                    Iterable iterable4 = (Iterable) ((VKResponseWithItems) objSubs3).yandex;
                    arrayList = new ArrayList(AbstractC14055l.billing(iterable4, 10));
                    it = iterable4.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ProtoNewsfeedItem) it.next()).yandex);
                    }
                    return arrayList;
                }
            }
        } else if (this.f17909l.isEmpty()) {
            C12772l c12772l7 = new C12772l((byte) 0, 23);
            c7249l.f15084l = this;
            c7249l.f15085l = i;
            c7249l.f15083l = 1;
            objSubs3 = c12772l7.subs(c7249l);
            if (objSubs3 != enumC9342l) {
                c8706l = this;
                c8706l.f17909l = (List) ((VKResponseWithItems) objSubs3).yandex;
                C16552l c16552l2 = AbstractC11463l.yandex;
                c2975l = AbstractC17278l.yandex;
                c0431l = new C0431l(this, null);
                c7249l.f15084l = null;
                c7249l.f15085l = i;
                c7249l.f15083l = 2;
                if (AbstractC10999l.firebase(c2975l, c0431l, c7249l) != enumC9342l) {
                    c16184l = new C16184l(this, i5);
                    num = this.f17906l;
                    i2 = this.f23161l;
                    if (num == null) {
                        C12772l c12772l8 = new C12772l(i2, this.f17906l, this.f17912l);
                        c7249l.f15084l = c16184l;
                        c7249l.f15085l = i;
                        c7249l.f15083l = 4;
                        objSubs = c12772l8.subs(c7249l);
                        if (objSubs != enumC9342l) {
                            objSubs3 = objSubs;
                            function1 = c16184l;
                            function1.invoke(objSubs3);
                            return (List) ((VKResponseWithItems) objSubs3).yandex;
                        }
                    } else {
                        C12772l c12772l9 = new C12772l(i2, this.f17912l);
                        c7249l.f15084l = c16184l;
                        c7249l.f15085l = i;
                        c7249l.f15083l = 3;
                        objSubs2 = c12772l9.subs(c7249l);
                        if (objSubs2 != enumC9342l) {
                            objSubs3 = objSubs2;
                            function2 = c16184l;
                            function2.invoke(objSubs3);
                            Iterable iterable5 = (Iterable) ((VKResponseWithItems) objSubs3).yandex;
                            arrayList = new ArrayList(AbstractC14055l.billing(iterable5, 10));
                            it = iterable5.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((ProtoNewsfeedItem) it.next()).yandex);
                            }
                            return arrayList;
                        }
                    }
                }
            }
        } else {
            C16552l c16552l3 = AbstractC11463l.yandex;
            c2975l = AbstractC17278l.yandex;
            c0431l = new C0431l(this, null);
            c7249l.f15084l = null;
            c7249l.f15085l = i;
            c7249l.f15083l = 2;
            if (AbstractC10999l.firebase(c2975l, c0431l, c7249l) != enumC9342l) {
                c16184l = new C16184l(this, i5);
                num = this.f17906l;
                i2 = this.f23161l;
                if (num == null) {
                    C12772l c12772l10 = new C12772l(i2, this.f17906l, this.f17912l);
                    c7249l.f15084l = c16184l;
                    c7249l.f15085l = i;
                    c7249l.f15083l = 4;
                    objSubs = c12772l10.subs(c7249l);
                    if (objSubs != enumC9342l) {
                        objSubs3 = objSubs;
                        function1 = c16184l;
                        function1.invoke(objSubs3);
                        return (List) ((VKResponseWithItems) objSubs3).yandex;
                    }
                } else {
                    C12772l c12772l11 = new C12772l(i2, this.f17912l);
                    c7249l.f15084l = c16184l;
                    c7249l.f15085l = i;
                    c7249l.f15083l = 3;
                    objSubs2 = c12772l11.subs(c7249l);
                    if (objSubs2 != enumC9342l) {
                        objSubs3 = objSubs2;
                        function2 = c16184l;
                        function2.invoke(objSubs3);
                        Iterable iterable6 = (Iterable) ((VKResponseWithItems) objSubs3).yandex;
                        arrayList = new ArrayList(AbstractC14055l.billing(iterable6, 10));
                        it = iterable6.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((ProtoNewsfeedItem) it.next()).yandex);
                        }
                        return arrayList;
                    }
                }
            }
        }
        return enumC9342l;
    }

    @Override // defpackage.AbstractC11519l, defpackage.AbstractC2484l
    /* JADX INFO: renamed from: case */
    public final AbstractC14412l mo647case() {
        return new C12375l();
    }

    @Override // defpackage.AbstractC3372l, defpackage.AbstractC2484l
    /* JADX INFO: renamed from: continue */
    public final String mo648continue() {
        return this.f17907l;
    }

    @Override // defpackage.AbstractC11519l
    /* JADX INFO: renamed from: finally, reason: not valid java name */
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

    @Override // defpackage.AbstractC11519l
    /* JADX INFO: renamed from: new */
    public final subs mo1270new() {
        return new C2045l(C14706l.f28764l, new subs[0]);
    }

    @Override // defpackage.AbstractC11519l
    /* JADX INFO: renamed from: super */
    public final void mo1271super() {
        this.f17912l = null;
        this.f17908l.loadAd();
        this.f17911l.clear();
        ArrayList arrayList = this.f17910l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m1338try().premium((subs) it.next());
        }
        arrayList.clear();
    }

    @Override // defpackage.AbstractC3372l
    /* JADX INFO: renamed from: transient */
    public final Object mo1272transient(List list, InterfaceC14029l interfaceC14029l) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!((NewsfeedItem) obj).adcel) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            int i = 0;
            arrayList = this.f17910l;
            if (!zHasNext) {
                break;
            }
            NewsfeedItem newsfeedItem = (NewsfeedItem) it.next();
            String str = newsfeedItem.billing;
            String str2 = newsfeedItem.yandex;
            List listSingletonList = Collections.singletonList(newsfeedItem);
            ArrayList arrayList3 = new ArrayList();
            int i2 = 4;
            C13772l.m3755l(listSingletonList, new C8103l(i2, arrayList3));
            List listSingletonList2 = Collections.singletonList(newsfeedItem);
            ArrayList arrayList4 = new ArrayList();
            C13772l.m3755l(listSingletonList2, new C8103l(5, arrayList4));
            this.f17911l.addAll(arrayList3);
            boolean zYandex = AbstractC8576l.yandex(str2, "recommended_audios");
            C9554l c9554l = this.f17908l;
            if (zYandex) {
                C12732l c12732l = C2782l.f6055l;
                String str3 = newsfeedItem.purchase;
                if (str3 == null) {
                    str3 = "";
                }
                arrayList.add(new C8092l(c12732l, new Catalog2Layout.CompactHeader(str3), newsfeedItem.admob));
            } else {
                LinkedHashMap linkedHashMap = c9554l.admob;
                Integer num = newsfeedItem.crashlytics;
                if (num == null) {
                    num = newsfeedItem.amazon;
                }
                VKProfile vKProfile = (VKProfile) linkedHashMap.get(String.valueOf(num));
                if (vKProfile == null) {
                    vKProfile = VKProfile.admob;
                }
                arrayList.add(new C9341l(newsfeedItem, vKProfile));
            }
            int i3 = 8;
            String str4 = "_synth_post_info";
            if (AbstractC8576l.yandex(str2, "audio_playlist")) {
                C4559l c4559l = new C4559l(i3);
                c4559l.appmetrica(Collections.singletonList(new Catalog2Text(i, i2, str4, "добавил плейлисты в библиотеку:")));
                arrayList.add(c4559l);
            } else if (AbstractC8576l.yandex(str2, "audio")) {
                C4559l c4559l2 = new C4559l(i3);
                c4559l2.appmetrica(Collections.singletonList(new Catalog2Text(i, i2, str4, "добавил аудиозаписи в библиотеку:")));
                arrayList.add(c4559l2);
            }
            if (str != null && str.length() != 0) {
                C4559l c4559l3 = new C4559l(i3);
                c4559l3.appmetrica(Collections.singletonList(new Catalog2Text(i, i2, "_synth_post", str)));
                arrayList.add(c4559l3);
            }
            if (!arrayList3.isEmpty()) {
                C14451l c14451l = new C14451l(false, false, 0, C6371l.yandex, null, null, 116);
                c14451l.f28311l = new C16184l(this, i);
                c14451l.appmetrica(arrayList3);
                arrayList.add(c14451l);
            }
            if (!arrayList4.isEmpty()) {
                C17022l c17022l = new C17022l(3, false, c9554l);
                c17022l.appmetrica(arrayList4);
                arrayList.add(c17022l);
            }
            arrayList.add(new C13793l());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m1338try().isVip((subs) it2.next());
        }
        this.f23163l = true;
        this.f23171l = false;
        return Unit.INSTANCE;
    }
}
