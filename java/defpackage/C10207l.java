package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylistLibrary;

/* JADX INFO: renamed from: lََٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10207l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f20800l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f20801l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20802l;

    public /* synthetic */ C10207l(C4487l c4487l, C15012l c15012l, C15806l c15806l) {
        this.f20802l = 23;
        this.f20801l = c15012l;
        this.f20800l = c15806l;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00be  */
    /* JADX WARN: Code duplicated, block: B:222:0x06fd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v14 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zAmazon;
        C3242l c3242l;
        C14264l c14264lCrashlytics;
        C14264l c14264lCrashlytics2;
        C11244l c11244lLoadAd;
        C14264l c14264l;
        C11244l c11244lLoadAd2;
        C14264l c14264l2;
        C11244l c11244lLoadAd3;
        C14264l c14264l3;
        C0327l c0327l;
        C9902l c9902lFirebase;
        int i = 22;
        int i2 = 27;
        int i3 = 6;
        int i4 = 5;
        int i5 = 10;
        int i6 = 9;
        final int i7 = 2;
        int i8 = 8;
        C14264l c14264lCrashlytics3 = 0;
        c14264lCrashlytics3 = 0;
        int i9 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        final int i10 = 1;
        switch (this.f20802l) {
            case 0:
                ((C16721l) this.f20801l).yandex.setValue(new C18268l((InterfaceC10137l) this.f20800l, (InterfaceC10137l) obj));
                return Unit.INSTANCE;
            case 1:
                C7883l c7883l = (C7883l) this.f20801l;
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) this.f20800l;
                C8130l c8130l = (C8130l) obj;
                EnumC3909l enumC3909l = EnumC3909l.f8050l;
                EnumC3909l enumC3909l2 = EnumC3909l.f8053l;
                EnumC3909l enumC3909l3 = EnumC3909l.f8052l;
                EnumC3909l enumC3909l4 = EnumC3909l.f8049l;
                if (c8130l != null) {
                    Rect rect = c8130l.loadAd;
                    if (rect != null) {
                        interfaceC8714l.setValue(AbstractC5833l.smaato(rect));
                    }
                    String strCrashlytics = c8130l.yandex.crashlytics();
                    if (strCrashlytics == null) {
                        strCrashlytics = "";
                    }
                    if (c7883l.inmobi() != enumC3909l3) {
                        if (c7883l.inmobi() == enumC3909l2) {
                            C7504l c7504l = c7883l.f16443l;
                            if (c7504l != null) {
                                c7504l.ads(null);
                            }
                            c7883l.f16443l = null;
                        } else if (c7883l.inmobi() == enumC3909l) {
                            c7883l.f16444l = true;
                            C7504l c7504l2 = c7883l.f16443l;
                            if (c7504l2 != null) {
                                c7504l2.ads(null);
                            }
                            c7883l.f16443l = null;
                        } else if (c7883l.inmobi() == EnumC3909l.f8051l || c7883l.inmobi() == enumC3909l4) {
                            int iInmobi = AbstractC5020l.inmobi(c7883l.f16445l);
                            if (iInmobi == 0) {
                                zAmazon = AbstractC8725l.crashlytics.amazon(strCrashlytics);
                            } else {
                                if (iInmobi != 1) {
                                    C18725l.billing();
                                    return null;
                                }
                                if (AbstractC8725l.loadAd.amazon(strCrashlytics)) {
                                    zAmazon = true;
                                } else {
                                    C2540l c2540lYandex = AbstractC10433l.yandex(strCrashlytics);
                                    if ((AbstractC8576l.yandex(c2540lYandex.f5529l, "open.vkx.app") && !c2540lYandex.yandex().isEmpty() && AbstractC8576l.yandex(AbstractC16901l.m4214continue(c2540lYandex.yandex()), "iac") && c2540lYandex.f5524l.contains("a")) || AbstractC8725l.yandex.amazon(strCrashlytics)) {
                                        zAmazon = true;
                                    } else {
                                        zAmazon = false;
                                    }
                                }
                            }
                            if (!zAmazon) {
                                enumC3909l = enumC3909l4;
                            }
                            c7883l.m2211package(enumC3909l);
                            c7883l.f16444l = true;
                            C7504l c7504l3 = c7883l.f16443l;
                            if (c7504l3 != null) {
                                c7504l3.ads(null);
                            }
                            c7883l.f16443l = null;
                            C7504l c7504l4 = c7883l.f16441l;
                            if (!zAmazon) {
                                if (c7504l4 != null) {
                                    c7504l4.ads(null);
                                }
                                c7883l.f16441l = null;
                                c7883l.f16443l = AbstractC10999l.mopub(AbstractC11990l.firebase(c7883l), null, 0, new C4670l(c7883l, c14264lCrashlytics3, z ? 1 : 0), 3);
                            } else if (c7504l4 == null) {
                                c7883l.f16441l = AbstractC10999l.mopub(AbstractC11990l.firebase(c7883l), null, 0, new C7226l(c7883l, strCrashlytics, c14264lCrashlytics3, 16), 3);
                            }
                        }
                    }
                } else if (c7883l.inmobi() != enumC3909l3) {
                    if (c7883l.inmobi() == enumC3909l || c7883l.inmobi() == enumC3909l4) {
                        c7883l.f16444l = false;
                    } else if (c7883l.inmobi() == enumC3909l2 && c7883l.f16443l == null) {
                        c7883l.f16443l = AbstractC10999l.mopub(AbstractC11990l.firebase(c7883l), null, 0, new C4670l(c7883l, c14264lCrashlytics3, i10), 3);
                    }
                }
                return Unit.INSTANCE;
            case 2:
                String str = (String) this.f20801l;
                Function0 function0 = (Function0) this.f20800l;
                InterfaceC17593l interfaceC17593l = (InterfaceC17593l) obj;
                InterfaceC13922l[] interfaceC13922lArr = AbstractC3668l.yandex;
                C4707l c4707l = AbstractC0424l.Signature;
                InterfaceC13922l interfaceC13922l = AbstractC3668l.yandex[11];
                interfaceC17593l.amazon(c4707l, Float.valueOf(1.0f));
                if (str != null) {
                    AbstractC3668l.mopub(interfaceC17593l, str);
                }
                AbstractC3668l.crashlytics(interfaceC17593l, new C5583l(i6, function0));
                return Unit.INSTANCE;
            case 3:
                C15222l c15222l = (C15222l) this.f20801l;
                C4154l c4154l = (C4154l) this.f20800l;
                C3995l c3995l = (C3995l) obj;
                float f = c3995l.loadAd ? -1.0f : 1.0f;
                long j = c3995l.yandex;
                c15222l.yandex(1, C1187l.isPro(f, c4154l.amazon == EnumC7283l.f15125l ? C1187l.yandex(0.0f, 1, j) : C1187l.yandex(0.0f, 2, j)));
                return Unit.INSTANCE;
            case 4:
                AbstractC10999l.mopub((InterfaceC2262l) this.f20801l, null, 4, new C7226l((InterfaceC7948l) this.f20800l, (C3625l) obj, c14264lCrashlytics3, i), 1);
                return Unit.INSTANCE;
            case 5:
                C0205l c0205l = (C0205l) this.f20801l;
                Function1 function1 = (Function1) this.f20800l;
                C3242l c3242l2 = (C3242l) obj;
                c0205l.metrica(c3242l2);
                function1.invoke(c3242l2);
                return Unit.INSTANCE;
            case 6:
                C0205l c0205l2 = (C0205l) this.f20801l;
                Context context = (Context) this.f20800l;
                C18624l c18624l = (C18624l) obj;
                c18624l.yandex();
                C12463l c12463l = c18624l.yandex;
                EnumC11323l enumC11323l = EnumC11323l.Autofill;
                boolean zFirebase = c0205l2.firebase();
                C1120l c1120l = new C1120l(c0205l2, i4);
                Resources resources = context.getResources();
                C10261l c10261l = new C10261l(c1120l, null, 0);
                if (zFirebase) {
                    c12463l.yandex(new C5249l(AbstractC0135l.loadAd, resources.getString(R.string.copy), R.attr.actionModeCopyDrawable, c10261l));
                }
                EnumC11323l enumC11323l2 = EnumC11323l.Autofill;
                C11611l c11611l = c0205l2.f1163l;
                ArrayList arrayListPurchase = c11611l.purchase(c0205l2.remoteconfig());
                if (!arrayListPurchase.isEmpty()) {
                    int size = arrayListPurchase.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        C18329l c18329l = (C18329l) arrayListPurchase.get(i11);
                        C3625l c3625lPurchase = c18329l.purchase();
                        if (c3625lPurchase.f7563l.length() != 0 && ((c3242l = (C3242l) c11611l.yandex().purchase(c18329l.yandex)) == null || Math.abs(c3242l.yandex.loadAd - c3242l.loadAd.loadAd) != c3625lPurchase.f7563l.length())) {
                            i10 = 0;
                        }
                    }
                }
                C1120l c1120l2 = new C1120l(c0205l2, i3);
                C1120l c1120l3 = new C1120l(c0205l2, 7);
                Resources resources2 = context.getResources();
                C10261l c10261l2 = new C10261l(c1120l3, c1120l2, 0);
                if (i10 == 0) {
                    c12463l.yandex(new C5249l(AbstractC0135l.amazon, resources2.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, c10261l2));
                }
                c18624l.yandex();
                return Unit.INSTANCE;
            case 7:
                AbstractC14968l abstractC14968l = (AbstractC14968l) this.f20801l;
                InterfaceC12244l interfaceC12244l = (InterfaceC12244l) this.f20800l;
                List list = (List) abstractC14968l.f29442l.getValue();
                ((C1336l) obj).firebase(list.size(), null, new C13512l(list, i, z2 ? 1 : 0), new C15578l(2039820996, true, new C3127l(list, interfaceC12244l, abstractC14968l, i8)));
                return Unit.INSTANCE;
            case 8:
                InterfaceC13643l interfaceC13643l = (InterfaceC13643l) this.f20801l;
                C17517l c17517l = (C17517l) this.f20800l;
                List list2 = ((C4921l) interfaceC13643l).yandex.yandex.crashlytics;
                ((C1336l) obj).firebase(list2.size(), null, new C13512l(list2, 25, z3 ? 1 : 0), new C15578l(802480018, true, new C6780l(list2, c17517l, i2)));
                return Unit.INSTANCE;
            case 9:
                C13046l c13046l = (C13046l) this.f20801l;
                C13802l c13802l = (C13802l) this.f20800l;
                boolean z11 = AbstractC12227l.yandex;
                C12889l c12889l = new C12889l(c13802l);
                c13046l.loadAd.subscription(AbstractC2749l.mopub, new C16931l(24, c12889l));
                Runtime.getRuntime().addShutdownHook(c12889l);
                return Unit.INSTANCE;
            case 10:
                InterfaceC12244l interfaceC12244l2 = (InterfaceC12244l) this.f20801l;
                C6111l c6111l = (C6111l) this.f20800l;
                InterfaceC13238l interfaceC13238l = (InterfaceC13238l) interfaceC12244l2.getValue();
                ((C1336l) obj).firebase(((AbstractC7095l) interfaceC13238l).pro(), null, new C5640l(interfaceC13238l, 21, z4 ? 1 : 0), new C15578l(802480018, true, new C6090l(interfaceC13238l, c6111l, i10)));
                return Unit.INSTANCE;
            case 11:
                C15237l c15237l = (C15237l) this.f20801l;
                C15237l c15237l2 = (C15237l) this.f20800l;
                CachedPlaylistLibrary cachedPlaylistLibrary = (CachedPlaylistLibrary) ((C3918l) obj).m1449l(AbstractC18202l.yandex.loadAd(CachedPlaylistLibrary.class), "TRUEPREDICATE", Arrays.copyOf(new Object[0], 0)).purchase().yandex();
                if (cachedPlaylistLibrary != null) {
                    cachedPlaylistLibrary.yandex().add(c15237l.yandex, cachedPlaylistLibrary.yandex().remove(c15237l2.yandex));
                }
                return Unit.INSTANCE;
            case 12:
                InterfaceC12244l interfaceC12244l3 = (InterfaceC12244l) this.f20801l;
                final C8748l c8748l = (C8748l) this.f20800l;
                C1336l c1336l = (C1336l) obj;
                if (!((C16187l) interfaceC12244l3.getValue()).crashlytics.isEmpty()) {
                    final boolean z12 = z8 ? 1 : 0;
                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(385111525, true, new Function3() { // from class: lؗؐ۟
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i12 = z12;
                            C6956l c6956l = (C6956l) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            switch (i12) {
                                case 0:
                                    if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c8748l.m2424finally(AbstractC11999l.purchase(c6956l, ua.itaysonlab.vkx.R.string.fake_catalog_playlists), null, c6956l, 0, 2);
                                    } else {
                                        c6956l.m2124else();
                                    }
                                    break;
                                case 1:
                                    if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c8748l.m2424finally(AbstractC11999l.purchase(c6956l, ua.itaysonlab.vkx.R.string.fake_catalog_tracks), AbstractC11999l.purchase(c6956l, ua.itaysonlab.vkx.R.string.cache_v2_sort_title), c6956l, 0, 0);
                                    } else {
                                        c6956l.m2124else();
                                    }
                                    break;
                                default:
                                    if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c8748l.m2424finally(AbstractC11999l.purchase(c6956l, ua.itaysonlab.vkx.R.string.fake_catalog_tracks), AbstractC11999l.purchase(c6956l, ua.itaysonlab.vkx.R.string.cache_v2_sort_artist), c6956l, 0, 0);
                                    } else {
                                        c6956l.m2124else();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }), 3);
                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-702630564, true, new C0673l(c8748l, interfaceC12244l3, i10)), 3);
                }
                if (!((C16187l) interfaceC12244l3.getValue()).yandex.isEmpty()) {
                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-819977380, true, new Function3() { // from class: lؗؐ۟
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i12 = i10;
                            C6956l c6956l = (C6956l) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            switch (i12) {
                                case 0:
                                    if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c8748l.m2424finally(AbstractC11999l.purchase(c6956l, ua.itaysonlab.vkx.R.string.fake_catalog_playlists), null, c6956l, 0, 2);
                                    } else {
                                        c6956l.m2124else();
                                    }
                                    break;
                                case 1:
                                    if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c8748l.m2424finally(AbstractC11999l.purchase(c6956l, ua.itaysonlab.vkx.R.string.fake_catalog_tracks), AbstractC11999l.purchase(c6956l, ua.itaysonlab.vkx.R.string.cache_v2_sort_title), c6956l, 0, 0);
                                    } else {
                                        c6956l.m2124else();
                                    }
                                    break;
                                default:
                                    if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c8748l.m2424finally(AbstractC11999l.purchase(c6956l, ua.itaysonlab.vkx.R.string.fake_catalog_tracks), AbstractC11999l.purchase(c6956l, ua.itaysonlab.vkx.R.string.cache_v2_sort_artist), c6956l, 0, 0);
                                    } else {
                                        c6956l.m2124else();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }), 3);
                    InterfaceC13238l interfaceC13238l2 = ((C16187l) interfaceC12244l3.getValue()).yandex;
                    c1336l.firebase(((AbstractC7095l) interfaceC13238l2).pro(), null, new C13512l(interfaceC13238l2, i2, z7 ? 1 : 0), new C15578l(802480018, true, new C17618l(interfaceC13238l2, c8748l, interfaceC12244l3, z6 ? 1 : 0)));
                }
                if (!((C16187l) interfaceC12244l3.getValue()).loadAd.isEmpty()) {
                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(1759391325, true, new Function3() { // from class: lؗؐ۟
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i12 = i7;
                            C6956l c6956l = (C6956l) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            switch (i12) {
                                case 0:
                                    if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c8748l.m2424finally(AbstractC11999l.purchase(c6956l, ua.itaysonlab.vkx.R.string.fake_catalog_playlists), null, c6956l, 0, 2);
                                    } else {
                                        c6956l.m2124else();
                                    }
                                    break;
                                case 1:
                                    if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c8748l.m2424finally(AbstractC11999l.purchase(c6956l, ua.itaysonlab.vkx.R.string.fake_catalog_tracks), AbstractC11999l.purchase(c6956l, ua.itaysonlab.vkx.R.string.cache_v2_sort_title), c6956l, 0, 0);
                                    } else {
                                        c6956l.m2124else();
                                    }
                                    break;
                                default:
                                    if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c8748l.m2424finally(AbstractC11999l.purchase(c6956l, ua.itaysonlab.vkx.R.string.fake_catalog_tracks), AbstractC11999l.purchase(c6956l, ua.itaysonlab.vkx.R.string.cache_v2_sort_artist), c6956l, 0, 0);
                                    } else {
                                        c6956l.m2124else();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }), 3);
                    InterfaceC13238l interfaceC13238l3 = ((C16187l) interfaceC12244l3.getValue()).loadAd;
                    c1336l.firebase(((AbstractC7095l) interfaceC13238l3).pro(), null, new C13512l(interfaceC13238l3, 28, z5 ? 1 : 0), new C15578l(802480018, true, new C17618l(interfaceC13238l3, c8748l, interfaceC12244l3, i10)));
                }
                return Unit.INSTANCE;
            case 13:
                InterfaceC13238l interfaceC13238l4 = (InterfaceC13238l) this.f20801l;
                ((C1336l) obj).firebase(((AbstractC7095l) interfaceC13238l4).pro(), null, new C13512l(interfaceC13238l4, 29, z10 ? 1 : 0), new C15578l(802480018, true, new C11074l(interfaceC13238l4, (C8748l) this.f20800l, z9 ? 1 : 0)));
                return Unit.INSTANCE;
            case 14:
                C12469l c12469l = (C12469l) this.f20801l;
                C13250l c13250l = (C13250l) this.f20800l;
                C5616l c5616l = (C5616l) obj;
                c12469l.yandex(((Number) c5616l.amazon()).floatValue() - c13250l.f26029l);
                c13250l.f26029l = ((Number) c5616l.amazon()).floatValue();
                return Unit.INSTANCE;
            case 15:
                List list3 = (List) this.f20801l;
                C15161l c15161l = (C15161l) this.f20800l;
                Throwable th = (Throwable) obj;
                if (th != null) {
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        ((C9426l) it.next()).m2649l(th);
                    }
                } else {
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        ((C9426l) it2.next()).m3885new(Unit.INSTANCE);
                    }
                }
                synchronized (c15161l.amazon) {
                    c15161l.billing.removeAll(list3);
                }
                return Unit.INSTANCE;
            case 16:
                HashMap map = (HashMap) this.f20801l;
                InterfaceC15879l interfaceC15879l = (InterfaceC15879l) this.f20800l;
                AbstractC6896l abstractC6896l = (AbstractC6896l) obj;
                Object obj2 = map.get(abstractC6896l);
                if (obj2 != null) {
                    C9807l c9807l = (C9807l) obj2;
                    return abstractC6896l.metrica(interfaceC15879l, c9807l.yandex, c9807l.loadAd);
                }
                C8339l.metrica("Required value was null.");
                return null;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C9582l(17, ((C11919l) this.f20801l).license(new C17660l((InterfaceC8714l) this.f20800l, 1)));
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C7392l) this.f20801l).loadAd.subs((InterfaceC0684l) obj, (C11059l) this.f20800l);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C3366l c3366l = (C3366l) obj;
                return c3366l.yandex(new C4693l(i9, new C10207l(((InterfaceC6347l) this.f20801l).yandex(c3366l.f7169l.admob(), c3366l.f7169l.getLayoutDirection(), c3366l), (C10768l) this.f20800l, 20)));
            case 20:
                AbstractC10851l.purchase((InterfaceC13349l) obj, (AbstractC15342l) this.f20801l, ((C10768l) this.f20800l).yandex());
                return Unit.INSTANCE;
            case 21:
                Function0 function2 = (Function0) this.f20801l;
                InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) this.f20800l;
                C14174l c14174l = (C14174l) obj;
                float fFloatValue = ((Number) function2.invoke()).floatValue();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (c14174l.yandex >> 32)) * fFloatValue;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c14174l.yandex & 4294967295L)) * fFloatValue;
                if (Float.intBitsToFloat((int) (((C14174l) interfaceC8714l2.getValue()).yandex >> 32)) != fIntBitsToFloat || Float.intBitsToFloat((int) (((C14174l) interfaceC8714l2.getValue()).yandex & 4294967295L)) != fIntBitsToFloat2) {
                    interfaceC8714l2.setValue(new C14174l((((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32)));
                }
                return Unit.INSTANCE;
            case 22:
                return new C18616l((InterfaceC8714l) this.f20801l, (C2403l) this.f20800l, i3);
            case 23:
                C15012l c15012l = (C15012l) this.f20801l;
                C15308l c15308l = ((C15806l) this.f20800l).loadAd;
                C0293l c0293l = (C0293l) obj;
                AbstractC12494l abstractC12494l = (AbstractC12494l) c15012l.yandex;
                C11244l c11244lLoadAd4 = abstractC12494l.loadAd();
                C14264l c14264l4 = c11244lLoadAd4 != null ? c11244lLoadAd4.yandex : null;
                if ((c15308l.admob() & 1) == 0 || (c11244lLoadAd3 = abstractC12494l.loadAd()) == null) {
                    c14264lCrashlytics = null;
                } else {
                    c14264l3 = c11244lLoadAd3.loadAd;
                }
                if (c14264l4 != null) {
                    c14264lCrashlytics = c14264l3;
                    c14264lCrashlytics = c14264l4.crashlytics(c14264lCrashlytics);
                }
                c14264lCrashlytics = c14264l3;
                if ((c15308l.admob() & 2) == 0 || (c11244lLoadAd2 = abstractC12494l.loadAd()) == null) {
                    c14264lCrashlytics2 = null;
                } else {
                    c14264l2 = c11244lLoadAd2.crashlytics;
                }
                if (c14264lCrashlytics != null) {
                    c14264lCrashlytics2 = c14264l2;
                    c14264lCrashlytics2 = c14264lCrashlytics.crashlytics(c14264lCrashlytics2);
                }
                c14264lCrashlytics2 = c14264l2;
                if ((c15308l.admob() & 4) != 0 && (c11244lLoadAd = abstractC12494l.loadAd()) != null) {
                    c14264l = c11244lLoadAd.amazon;
                }
                if (c14264lCrashlytics2 != null) {
                    c14264lCrashlytics3 = c14264l;
                    c14264lCrashlytics3 = c14264lCrashlytics2.crashlytics(c14264lCrashlytics3);
                }
                c14264lCrashlytics3 = c14264l;
                c0293l.loadAd = c0293l.yandex.loadAd(new C6411l(new C9122l(), c15012l, c14264lCrashlytics3, i5));
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C4487l c4487l = (C4487l) this.f20801l;
                C15012l c15012l2 = (C15012l) this.f20800l;
                C6148l c6148l = (C6148l) obj;
                C3625l c3625l = c4487l.loadAd;
                C10086l c10086l = c4487l.yandex;
                C0327l c0327l2 = (C0327l) c10086l.getValue();
                if (AbstractC8576l.yandex(c3625l, c0327l2 != null ? c0327l2.yandex.yandex : null) && (c0327l = (C0327l) c10086l.getValue()) != null) {
                    C6222l c6222l = c0327l.loadAd;
                    C15012l c15012lCrashlytics = C4487l.crashlytics(c15012l2, c0327l);
                    if (c15012lCrashlytics == null) {
                        c9902lFirebase = null;
                    } else {
                        int i12 = c15012lCrashlytics.crashlytics;
                        int i13 = c15012lCrashlytics.loadAd;
                        c9902lFirebase = c0327l.firebase(i13, i12);
                        C8896l c8896lLoadAd = c0327l.loadAd(i13);
                        int i14 = i12 - 1;
                        c9902lFirebase.smaato(((((long) Float.floatToRawIntBits(c8896lLoadAd.loadAd)) & 4294967295L) | (((long) Float.floatToRawIntBits(c6222l.amazon(i13) == c6222l.amazon(i14) ? Math.min(c0327l.loadAd(i14).yandex, c8896lLoadAd.yandex) : 0.0f)) << 32)) ^ (-9223372034707292160L));
                    }
                } else {
                    c9902lFirebase = null;
                }
                C15949l c15949l = c9902lFirebase != null ? new C15949l(c9902lFirebase) : null;
                if (c15949l != null) {
                    c6148l.startapp(c15949l);
                    c6148l.purchase(true);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                AbstractC10999l.mopub((InterfaceC2262l) this.f20801l, null, 0, new C10291l(((Boolean) obj).booleanValue(), (C0072l) this.f20800l, (InterfaceC14029l) c14264lCrashlytics3, i8), 3);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                AbstractC10999l.mopub((InterfaceC2262l) this.f20801l, null, 4, new C14319l((C18656l) this.f20800l, null), 1);
                return new C2714l(5);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C18656l c18656l = (C18656l) this.f20801l;
                C9459l c9459l = (C9459l) this.f20800l;
                c18656l.isPro.add(c9459l);
                return new C18616l(c18656l, c9459l, i5);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C18656l c18656l2 = (C18656l) this.f20801l;
                C18656l c18656l3 = (C18656l) this.f20800l;
                c18656l2.firebase.add(c18656l3);
                return new C18616l(c18656l2, c18656l3, i8);
            default:
                return new C18616l((C18656l) this.f20801l, (C15738l) this.f20800l, i6);
        }
    }

    public /* synthetic */ C10207l(Object obj, Object obj2, int i) {
        this.f20802l = i;
        this.f20801l = obj;
        this.f20800l = obj2;
    }
}
