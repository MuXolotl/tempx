package defpackage;

import android.media.MediaCodec;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lًٍؘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9395l {
    public final C8688l amazon;
    public final C8688l billing;
    public final C8688l crashlytics;
    public final boolean loadAd;
    public final C8688l mopub;
    public final C8688l purchase;
    public final Collection yandex;

    public C9395l(Collection collection, boolean z) {
        this.yandex = collection;
        this.loadAd = z;
        final int i = 0;
        this.crashlytics = new C8688l(new Function0(this) { // from class: lٔۨؓ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C9395l f29972l;

            {
                this.f29972l = this;
            }

            /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:98:0x024e  */
            /* JADX WARN: Instruction removed from duplicated block: B:98:0x024e, please report this as an issue */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                C9395l c9395l = this.f29972l;
                switch (i2) {
                    case 0:
                        ArrayList<C10814l> arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (AbstractC6896l abstractC6896l : c9395l.yandex) {
                            arrayList.add(c9395l.loadAd ? abstractC6896l.adcel : abstractC6896l.ads);
                            arrayList2.add(abstractC6896l.admob);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((C10814l) it.next()).mopub.crashlytics == 5) {
                                    if (AbstractC5088l.smaato()) {
                                        Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    return C14054l.f27396l;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        C6916l c6916l = AbstractC18386l.yandex;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        for (C10814l c10814l : arrayList) {
                            if (c10814l.mopub.loadAd.f15372l.containsKey(c6916l) && c10814l.loadAd().size() != 1) {
                                if (!AbstractC5088l.smaato()) {
                                    return linkedHashMap;
                                }
                                Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + c10814l.loadAd().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                return linkedHashMap;
                            }
                            if (c10814l.mopub.loadAd.f15372l.containsKey(c6916l)) {
                                int i3 = 0;
                                for (C10814l c10814l2 : arrayList) {
                                    if (((InterfaceC0048l) arrayList3.get(i3)).mo256native() == EnumC11949l.f23820l) {
                                        AbstractC5641l.purchase("MeteringRepeating should contain a surface", !c10814l2.loadAd().isEmpty());
                                        linkedHashMap.put(c10814l2.loadAd().get(0), 1L);
                                    } else if (c10814l2.mopub.loadAd.f15372l.containsKey(c6916l) && !c10814l2.loadAd().isEmpty()) {
                                        linkedHashMap.put(c10814l2.loadAd().get(0), c10814l2.mopub.loadAd.adcel(c6916l));
                                    }
                                    i3++;
                                }
                                if (AbstractC5088l.firebase("CXCP")) {
                                    return linkedHashMap;
                                }
                                Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                                return linkedHashMap;
                            }
                        }
                        if (AbstractC5088l.firebase("CXCP")) {
                            return linkedHashMap;
                        }
                        Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        return linkedHashMap;
                    case 1:
                        Collection<AbstractC6896l> collection2 = c9395l.yandex;
                        ArrayList<C10814l> arrayList4 = new ArrayList(AbstractC14055l.billing(collection2, 10));
                        for (AbstractC6896l abstractC6896l2 : collection2) {
                            arrayList4.add(c9395l.loadAd ? abstractC6896l2.adcel : abstractC6896l2.ads);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (C10814l c10814l3 : arrayList4) {
                            List<AbstractC0958l> listLoadAd = c10814l3.loadAd();
                            C0665l c0665l = c10814l3.mopub;
                            for (AbstractC0958l abstractC0958l : listLoadAd) {
                                C7420l c7420l = c0665l.loadAd;
                                C6916l c6916l2 = C16443l.f32157l;
                                if (!c7420l.f15372l.containsKey(c6916l2) || c7420l.adcel(c6916l2) == null) {
                                    linkedHashMap2.put(abstractC0958l, Long.valueOf(AbstractC8576l.yandex(abstractC0958l.isPro, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    linkedHashMap2.put(abstractC0958l, c7420l.adcel(c6916l2));
                                }
                            }
                        }
                        return linkedHashMap2;
                    case 2:
                        C11419l c11419l = new C11419l();
                        for (AbstractC6896l abstractC6896l3 : c9395l.yandex) {
                            c11419l.yandex(c9395l.loadAd ? abstractC6896l3.adcel : abstractC6896l3.ads);
                        }
                        return c11419l;
                    case 3:
                        C8688l c8688l = c9395l.purchase;
                        if (((C11419l) c8688l.getValue()).crashlytics()) {
                            return ((C11419l) c8688l.getValue()).loadAd();
                        }
                        C8339l.smaato("Check failed.");
                        return null;
                    default:
                        C8688l c8688l2 = c9395l.billing;
                        if (!((C11419l) c9395l.purchase.getValue()).crashlytics()) {
                            C8339l.smaato("Check failed.");
                            return null;
                        }
                        C14113l c14113l = ((C10814l) c8688l2.getValue()).loadAd;
                        if (c14113l != null) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(((C10814l) c8688l2.getValue()).loadAd());
                            arrayList5.add(c14113l.yandex);
                            List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList5);
                            if (listUnmodifiableList != null) {
                                return listUnmodifiableList;
                            }
                        }
                        return ((C10814l) c8688l2.getValue()).loadAd();
                }
            }
        });
        final int i2 = 1;
        this.amazon = new C8688l(new Function0(this) { // from class: lٔۨؓ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C9395l f29972l;

            {
                this.f29972l = this;
            }

            /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:98:0x024e  */
            /* JADX WARN: Instruction removed from duplicated block: B:98:0x024e, please report this as an issue */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                C9395l c9395l = this.f29972l;
                switch (i3) {
                    case 0:
                        ArrayList<C10814l> arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (AbstractC6896l abstractC6896l : c9395l.yandex) {
                            arrayList.add(c9395l.loadAd ? abstractC6896l.adcel : abstractC6896l.ads);
                            arrayList2.add(abstractC6896l.admob);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((C10814l) it.next()).mopub.crashlytics == 5) {
                                    if (AbstractC5088l.smaato()) {
                                        Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    return C14054l.f27396l;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        C6916l c6916l = AbstractC18386l.yandex;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        for (C10814l c10814l : arrayList) {
                            if (c10814l.mopub.loadAd.f15372l.containsKey(c6916l) && c10814l.loadAd().size() != 1) {
                                if (!AbstractC5088l.smaato()) {
                                    return linkedHashMap;
                                }
                                Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + c10814l.loadAd().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                return linkedHashMap;
                            }
                            if (c10814l.mopub.loadAd.f15372l.containsKey(c6916l)) {
                                int i4 = 0;
                                for (C10814l c10814l2 : arrayList) {
                                    if (((InterfaceC0048l) arrayList3.get(i4)).mo256native() == EnumC11949l.f23820l) {
                                        AbstractC5641l.purchase("MeteringRepeating should contain a surface", !c10814l2.loadAd().isEmpty());
                                        linkedHashMap.put(c10814l2.loadAd().get(0), 1L);
                                    } else if (c10814l2.mopub.loadAd.f15372l.containsKey(c6916l) && !c10814l2.loadAd().isEmpty()) {
                                        linkedHashMap.put(c10814l2.loadAd().get(0), c10814l2.mopub.loadAd.adcel(c6916l));
                                    }
                                    i4++;
                                }
                                if (AbstractC5088l.firebase("CXCP")) {
                                    return linkedHashMap;
                                }
                                Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                                return linkedHashMap;
                            }
                        }
                        if (AbstractC5088l.firebase("CXCP")) {
                            return linkedHashMap;
                        }
                        Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        return linkedHashMap;
                    case 1:
                        Collection<AbstractC6896l> collection2 = c9395l.yandex;
                        ArrayList<C10814l> arrayList4 = new ArrayList(AbstractC14055l.billing(collection2, 10));
                        for (AbstractC6896l abstractC6896l2 : collection2) {
                            arrayList4.add(c9395l.loadAd ? abstractC6896l2.adcel : abstractC6896l2.ads);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (C10814l c10814l3 : arrayList4) {
                            List<AbstractC0958l> listLoadAd = c10814l3.loadAd();
                            C0665l c0665l = c10814l3.mopub;
                            for (AbstractC0958l abstractC0958l : listLoadAd) {
                                C7420l c7420l = c0665l.loadAd;
                                C6916l c6916l2 = C16443l.f32157l;
                                if (!c7420l.f15372l.containsKey(c6916l2) || c7420l.adcel(c6916l2) == null) {
                                    linkedHashMap2.put(abstractC0958l, Long.valueOf(AbstractC8576l.yandex(abstractC0958l.isPro, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    linkedHashMap2.put(abstractC0958l, c7420l.adcel(c6916l2));
                                }
                            }
                        }
                        return linkedHashMap2;
                    case 2:
                        C11419l c11419l = new C11419l();
                        for (AbstractC6896l abstractC6896l3 : c9395l.yandex) {
                            c11419l.yandex(c9395l.loadAd ? abstractC6896l3.adcel : abstractC6896l3.ads);
                        }
                        return c11419l;
                    case 3:
                        C8688l c8688l = c9395l.purchase;
                        if (((C11419l) c8688l.getValue()).crashlytics()) {
                            return ((C11419l) c8688l.getValue()).loadAd();
                        }
                        C8339l.smaato("Check failed.");
                        return null;
                    default:
                        C8688l c8688l2 = c9395l.billing;
                        if (!((C11419l) c9395l.purchase.getValue()).crashlytics()) {
                            C8339l.smaato("Check failed.");
                            return null;
                        }
                        C14113l c14113l = ((C10814l) c8688l2.getValue()).loadAd;
                        if (c14113l != null) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(((C10814l) c8688l2.getValue()).loadAd());
                            arrayList5.add(c14113l.yandex);
                            List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList5);
                            if (listUnmodifiableList != null) {
                                return listUnmodifiableList;
                            }
                        }
                        return ((C10814l) c8688l2.getValue()).loadAd();
                }
            }
        });
        final int i3 = 2;
        this.purchase = new C8688l(new Function0(this) { // from class: lٔۨؓ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C9395l f29972l;

            {
                this.f29972l = this;
            }

            /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:98:0x024e  */
            /* JADX WARN: Instruction removed from duplicated block: B:98:0x024e, please report this as an issue */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                C9395l c9395l = this.f29972l;
                switch (i4) {
                    case 0:
                        ArrayList<C10814l> arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (AbstractC6896l abstractC6896l : c9395l.yandex) {
                            arrayList.add(c9395l.loadAd ? abstractC6896l.adcel : abstractC6896l.ads);
                            arrayList2.add(abstractC6896l.admob);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((C10814l) it.next()).mopub.crashlytics == 5) {
                                    if (AbstractC5088l.smaato()) {
                                        Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    return C14054l.f27396l;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        C6916l c6916l = AbstractC18386l.yandex;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        for (C10814l c10814l : arrayList) {
                            if (c10814l.mopub.loadAd.f15372l.containsKey(c6916l) && c10814l.loadAd().size() != 1) {
                                if (!AbstractC5088l.smaato()) {
                                    return linkedHashMap;
                                }
                                Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + c10814l.loadAd().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                return linkedHashMap;
                            }
                            if (c10814l.mopub.loadAd.f15372l.containsKey(c6916l)) {
                                int i5 = 0;
                                for (C10814l c10814l2 : arrayList) {
                                    if (((InterfaceC0048l) arrayList3.get(i5)).mo256native() == EnumC11949l.f23820l) {
                                        AbstractC5641l.purchase("MeteringRepeating should contain a surface", !c10814l2.loadAd().isEmpty());
                                        linkedHashMap.put(c10814l2.loadAd().get(0), 1L);
                                    } else if (c10814l2.mopub.loadAd.f15372l.containsKey(c6916l) && !c10814l2.loadAd().isEmpty()) {
                                        linkedHashMap.put(c10814l2.loadAd().get(0), c10814l2.mopub.loadAd.adcel(c6916l));
                                    }
                                    i5++;
                                }
                                if (AbstractC5088l.firebase("CXCP")) {
                                    return linkedHashMap;
                                }
                                Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                                return linkedHashMap;
                            }
                        }
                        if (AbstractC5088l.firebase("CXCP")) {
                            return linkedHashMap;
                        }
                        Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        return linkedHashMap;
                    case 1:
                        Collection<AbstractC6896l> collection2 = c9395l.yandex;
                        ArrayList<C10814l> arrayList4 = new ArrayList(AbstractC14055l.billing(collection2, 10));
                        for (AbstractC6896l abstractC6896l2 : collection2) {
                            arrayList4.add(c9395l.loadAd ? abstractC6896l2.adcel : abstractC6896l2.ads);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (C10814l c10814l3 : arrayList4) {
                            List<AbstractC0958l> listLoadAd = c10814l3.loadAd();
                            C0665l c0665l = c10814l3.mopub;
                            for (AbstractC0958l abstractC0958l : listLoadAd) {
                                C7420l c7420l = c0665l.loadAd;
                                C6916l c6916l2 = C16443l.f32157l;
                                if (!c7420l.f15372l.containsKey(c6916l2) || c7420l.adcel(c6916l2) == null) {
                                    linkedHashMap2.put(abstractC0958l, Long.valueOf(AbstractC8576l.yandex(abstractC0958l.isPro, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    linkedHashMap2.put(abstractC0958l, c7420l.adcel(c6916l2));
                                }
                            }
                        }
                        return linkedHashMap2;
                    case 2:
                        C11419l c11419l = new C11419l();
                        for (AbstractC6896l abstractC6896l3 : c9395l.yandex) {
                            c11419l.yandex(c9395l.loadAd ? abstractC6896l3.adcel : abstractC6896l3.ads);
                        }
                        return c11419l;
                    case 3:
                        C8688l c8688l = c9395l.purchase;
                        if (((C11419l) c8688l.getValue()).crashlytics()) {
                            return ((C11419l) c8688l.getValue()).loadAd();
                        }
                        C8339l.smaato("Check failed.");
                        return null;
                    default:
                        C8688l c8688l2 = c9395l.billing;
                        if (!((C11419l) c9395l.purchase.getValue()).crashlytics()) {
                            C8339l.smaato("Check failed.");
                            return null;
                        }
                        C14113l c14113l = ((C10814l) c8688l2.getValue()).loadAd;
                        if (c14113l != null) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(((C10814l) c8688l2.getValue()).loadAd());
                            arrayList5.add(c14113l.yandex);
                            List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList5);
                            if (listUnmodifiableList != null) {
                                return listUnmodifiableList;
                            }
                        }
                        return ((C10814l) c8688l2.getValue()).loadAd();
                }
            }
        });
        final int i4 = 3;
        this.billing = new C8688l(new Function0(this) { // from class: lٔۨؓ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C9395l f29972l;

            {
                this.f29972l = this;
            }

            /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:98:0x024e  */
            /* JADX WARN: Instruction removed from duplicated block: B:98:0x024e, please report this as an issue */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i4;
                C9395l c9395l = this.f29972l;
                switch (i5) {
                    case 0:
                        ArrayList<C10814l> arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (AbstractC6896l abstractC6896l : c9395l.yandex) {
                            arrayList.add(c9395l.loadAd ? abstractC6896l.adcel : abstractC6896l.ads);
                            arrayList2.add(abstractC6896l.admob);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((C10814l) it.next()).mopub.crashlytics == 5) {
                                    if (AbstractC5088l.smaato()) {
                                        Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    return C14054l.f27396l;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        C6916l c6916l = AbstractC18386l.yandex;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        for (C10814l c10814l : arrayList) {
                            if (c10814l.mopub.loadAd.f15372l.containsKey(c6916l) && c10814l.loadAd().size() != 1) {
                                if (!AbstractC5088l.smaato()) {
                                    return linkedHashMap;
                                }
                                Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + c10814l.loadAd().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                return linkedHashMap;
                            }
                            if (c10814l.mopub.loadAd.f15372l.containsKey(c6916l)) {
                                int i6 = 0;
                                for (C10814l c10814l2 : arrayList) {
                                    if (((InterfaceC0048l) arrayList3.get(i6)).mo256native() == EnumC11949l.f23820l) {
                                        AbstractC5641l.purchase("MeteringRepeating should contain a surface", !c10814l2.loadAd().isEmpty());
                                        linkedHashMap.put(c10814l2.loadAd().get(0), 1L);
                                    } else if (c10814l2.mopub.loadAd.f15372l.containsKey(c6916l) && !c10814l2.loadAd().isEmpty()) {
                                        linkedHashMap.put(c10814l2.loadAd().get(0), c10814l2.mopub.loadAd.adcel(c6916l));
                                    }
                                    i6++;
                                }
                                if (AbstractC5088l.firebase("CXCP")) {
                                    return linkedHashMap;
                                }
                                Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                                return linkedHashMap;
                            }
                        }
                        if (AbstractC5088l.firebase("CXCP")) {
                            return linkedHashMap;
                        }
                        Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        return linkedHashMap;
                    case 1:
                        Collection<AbstractC6896l> collection2 = c9395l.yandex;
                        ArrayList<C10814l> arrayList4 = new ArrayList(AbstractC14055l.billing(collection2, 10));
                        for (AbstractC6896l abstractC6896l2 : collection2) {
                            arrayList4.add(c9395l.loadAd ? abstractC6896l2.adcel : abstractC6896l2.ads);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (C10814l c10814l3 : arrayList4) {
                            List<AbstractC0958l> listLoadAd = c10814l3.loadAd();
                            C0665l c0665l = c10814l3.mopub;
                            for (AbstractC0958l abstractC0958l : listLoadAd) {
                                C7420l c7420l = c0665l.loadAd;
                                C6916l c6916l2 = C16443l.f32157l;
                                if (!c7420l.f15372l.containsKey(c6916l2) || c7420l.adcel(c6916l2) == null) {
                                    linkedHashMap2.put(abstractC0958l, Long.valueOf(AbstractC8576l.yandex(abstractC0958l.isPro, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    linkedHashMap2.put(abstractC0958l, c7420l.adcel(c6916l2));
                                }
                            }
                        }
                        return linkedHashMap2;
                    case 2:
                        C11419l c11419l = new C11419l();
                        for (AbstractC6896l abstractC6896l3 : c9395l.yandex) {
                            c11419l.yandex(c9395l.loadAd ? abstractC6896l3.adcel : abstractC6896l3.ads);
                        }
                        return c11419l;
                    case 3:
                        C8688l c8688l = c9395l.purchase;
                        if (((C11419l) c8688l.getValue()).crashlytics()) {
                            return ((C11419l) c8688l.getValue()).loadAd();
                        }
                        C8339l.smaato("Check failed.");
                        return null;
                    default:
                        C8688l c8688l2 = c9395l.billing;
                        if (!((C11419l) c9395l.purchase.getValue()).crashlytics()) {
                            C8339l.smaato("Check failed.");
                            return null;
                        }
                        C14113l c14113l = ((C10814l) c8688l2.getValue()).loadAd;
                        if (c14113l != null) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(((C10814l) c8688l2.getValue()).loadAd());
                            arrayList5.add(c14113l.yandex);
                            List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList5);
                            if (listUnmodifiableList != null) {
                                return listUnmodifiableList;
                            }
                        }
                        return ((C10814l) c8688l2.getValue()).loadAd();
                }
            }
        });
        final int i5 = 4;
        this.mopub = new C8688l(new Function0(this) { // from class: lٔۨؓ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C9395l f29972l;

            {
                this.f29972l = this;
            }

            /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:98:0x024e  */
            /* JADX WARN: Instruction removed from duplicated block: B:98:0x024e, please report this as an issue */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i6 = i5;
                C9395l c9395l = this.f29972l;
                switch (i6) {
                    case 0:
                        ArrayList<C10814l> arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (AbstractC6896l abstractC6896l : c9395l.yandex) {
                            arrayList.add(c9395l.loadAd ? abstractC6896l.adcel : abstractC6896l.ads);
                            arrayList2.add(abstractC6896l.admob);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((C10814l) it.next()).mopub.crashlytics == 5) {
                                    if (AbstractC5088l.smaato()) {
                                        Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    return C14054l.f27396l;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        C6916l c6916l = AbstractC18386l.yandex;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        for (C10814l c10814l : arrayList) {
                            if (c10814l.mopub.loadAd.f15372l.containsKey(c6916l) && c10814l.loadAd().size() != 1) {
                                if (!AbstractC5088l.smaato()) {
                                    return linkedHashMap;
                                }
                                Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + c10814l.loadAd().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                return linkedHashMap;
                            }
                            if (c10814l.mopub.loadAd.f15372l.containsKey(c6916l)) {
                                int i7 = 0;
                                for (C10814l c10814l2 : arrayList) {
                                    if (((InterfaceC0048l) arrayList3.get(i7)).mo256native() == EnumC11949l.f23820l) {
                                        AbstractC5641l.purchase("MeteringRepeating should contain a surface", !c10814l2.loadAd().isEmpty());
                                        linkedHashMap.put(c10814l2.loadAd().get(0), 1L);
                                    } else if (c10814l2.mopub.loadAd.f15372l.containsKey(c6916l) && !c10814l2.loadAd().isEmpty()) {
                                        linkedHashMap.put(c10814l2.loadAd().get(0), c10814l2.mopub.loadAd.adcel(c6916l));
                                    }
                                    i7++;
                                }
                                if (AbstractC5088l.firebase("CXCP")) {
                                    return linkedHashMap;
                                }
                                Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                                return linkedHashMap;
                            }
                        }
                        if (AbstractC5088l.firebase("CXCP")) {
                            return linkedHashMap;
                        }
                        Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        return linkedHashMap;
                    case 1:
                        Collection<AbstractC6896l> collection2 = c9395l.yandex;
                        ArrayList<C10814l> arrayList4 = new ArrayList(AbstractC14055l.billing(collection2, 10));
                        for (AbstractC6896l abstractC6896l2 : collection2) {
                            arrayList4.add(c9395l.loadAd ? abstractC6896l2.adcel : abstractC6896l2.ads);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (C10814l c10814l3 : arrayList4) {
                            List<AbstractC0958l> listLoadAd = c10814l3.loadAd();
                            C0665l c0665l = c10814l3.mopub;
                            for (AbstractC0958l abstractC0958l : listLoadAd) {
                                C7420l c7420l = c0665l.loadAd;
                                C6916l c6916l2 = C16443l.f32157l;
                                if (!c7420l.f15372l.containsKey(c6916l2) || c7420l.adcel(c6916l2) == null) {
                                    linkedHashMap2.put(abstractC0958l, Long.valueOf(AbstractC8576l.yandex(abstractC0958l.isPro, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    linkedHashMap2.put(abstractC0958l, c7420l.adcel(c6916l2));
                                }
                            }
                        }
                        return linkedHashMap2;
                    case 2:
                        C11419l c11419l = new C11419l();
                        for (AbstractC6896l abstractC6896l3 : c9395l.yandex) {
                            c11419l.yandex(c9395l.loadAd ? abstractC6896l3.adcel : abstractC6896l3.ads);
                        }
                        return c11419l;
                    case 3:
                        C8688l c8688l = c9395l.purchase;
                        if (((C11419l) c8688l.getValue()).crashlytics()) {
                            return ((C11419l) c8688l.getValue()).loadAd();
                        }
                        C8339l.smaato("Check failed.");
                        return null;
                    default:
                        C8688l c8688l2 = c9395l.billing;
                        if (!((C11419l) c9395l.purchase.getValue()).crashlytics()) {
                            C8339l.smaato("Check failed.");
                            return null;
                        }
                        C14113l c14113l = ((C10814l) c8688l2.getValue()).loadAd;
                        if (c14113l != null) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(((C10814l) c8688l2.getValue()).loadAd());
                            arrayList5.add(c14113l.yandex);
                            List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList5);
                            if (listUnmodifiableList != null) {
                                return listUnmodifiableList;
                            }
                        }
                        return ((C10814l) c8688l2.getValue()).loadAd();
                }
            }
        });
    }

    public final void yandex(AbstractC0958l abstractC0958l) {
        InterfaceC14029l interfaceC14029l;
        Object next;
        AbstractC6896l abstractC6896l;
        if (AbstractC5088l.firebase("CXCP")) {
            Log.d("CXCP", "Unavailable " + abstractC0958l + ", notify SessionConfig invalid");
        }
        Iterator it = this.yandex.iterator();
        do {
            interfaceC14029l = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                abstractC6896l = (AbstractC6896l) next;
            }
        } while (!(this.loadAd ? abstractC6896l.adcel : abstractC6896l.ads).loadAd().contains(abstractC0958l));
        AbstractC6896l abstractC6896l2 = (AbstractC6896l) next;
        C10814l c10814l = abstractC6896l2 != null ? abstractC6896l2.adcel : null;
        C16552l c16552l = AbstractC11463l.yandex;
        AbstractC10999l.mopub(AbstractC11990l.yandex(AbstractC17278l.yandex.f6462l), null, 0, new C14019l(c10814l, interfaceC14029l, 12), 3);
    }
}
