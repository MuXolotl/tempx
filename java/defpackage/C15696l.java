package defpackage;

import android.util.Size;
import android.view.View;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lْٕٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15696l implements Comparator {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ C15696l f30833l = new C15696l(29);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30834l;

    public /* synthetic */ C15696l(int i) {
        this.f30834l = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f30834l) {
            case 0:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 1:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return AbstractC2920l.crashlytics(Long.valueOf(((long) size.getWidth()) * ((long) size.getHeight())), Long.valueOf(((long) size2.getWidth()) * ((long) size2.getHeight())));
            case 2:
                return AbstractC2920l.crashlytics(Integer.valueOf(((C10217l) obj).crashlytics), Integer.valueOf(((C10217l) obj2).crashlytics));
            case 3:
                return AbstractC2920l.crashlytics(Integer.valueOf(((C6001l) obj).admob), Integer.valueOf(((C6001l) obj2).admob));
            case 4:
                return AbstractC2920l.crashlytics(((C8643l) obj).crashlytics, ((C8643l) obj2).crashlytics);
            case 5:
                return AbstractC2920l.crashlytics(((C8643l) obj).amazon, ((C8643l) obj2).amazon);
            case 6:
                return AbstractC2920l.crashlytics(((C8643l) obj2).crashlytics, ((C8643l) obj).crashlytics);
            case 7:
                return AbstractC2920l.crashlytics(((C8643l) obj2).amazon, ((C8643l) obj).amazon);
            case 8:
                return AbstractC2920l.crashlytics(Integer.valueOf(((C0876l) obj2).yandex), Integer.valueOf(((C0876l) obj).yandex));
            case 9:
                return ((C4657l) obj).f9477l - ((C4657l) obj2).f9477l;
            case 10:
                ((C9980l) obj2).getClass();
                ((C9980l) obj).getClass();
                return AbstractC2920l.crashlytics(2, 2);
            case 11:
                ((InterfaceC17714l) obj2).getClass();
                ((InterfaceC17714l) obj).getClass();
                return AbstractC2920l.crashlytics(0, 0);
            case 12:
                return AbstractC2920l.crashlytics((C10821l) ((C8195l) obj2).f17097l, (C10821l) ((C8195l) obj).f17097l);
            case 13:
                return AbstractC2920l.crashlytics(Double.valueOf(((C15524l) obj2).loadAd), Double.valueOf(((C15524l) obj).loadAd));
            case 14:
                return AbstractC2920l.crashlytics((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 15:
                return AbstractC2920l.crashlytics((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 16:
                return AbstractC2920l.crashlytics(((CachedTrack) obj).advert(), ((CachedTrack) obj2).advert());
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return AbstractC2920l.crashlytics(((CachedTrack) obj).loadAd(), ((CachedTrack) obj2).loadAd());
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return AbstractC2920l.crashlytics(((CachedTrack) obj2).advert(), ((CachedTrack) obj).advert());
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return AbstractC2920l.crashlytics(((CachedTrack) obj2).loadAd(), ((CachedTrack) obj).loadAd());
            case 20:
                Iterator it = ((C9494l) obj).loadAd.iterator();
                if (it.hasNext()) {
                    Integer numValueOf = Integer.valueOf(C5664l.f12035l.indexOf(((C16853l) it.next()).admob));
                    while (it.hasNext()) {
                        Integer numValueOf2 = Integer.valueOf(C5664l.f12035l.indexOf(((C16853l) it.next()).admob));
                        if (numValueOf.compareTo(numValueOf2) < 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                    Iterator it2 = ((C9494l) obj2).loadAd.iterator();
                    if (it2.hasNext()) {
                        Integer numValueOf3 = Integer.valueOf(C5664l.f12035l.indexOf(((C16853l) it2.next()).admob));
                        while (it2.hasNext()) {
                            Integer numValueOf4 = Integer.valueOf(C5664l.f12035l.indexOf(((C16853l) it2.next()).admob));
                            if (numValueOf3.compareTo(numValueOf4) < 0) {
                                numValueOf3 = numValueOf4;
                            }
                        }
                        return AbstractC2920l.crashlytics(numValueOf, numValueOf3);
                    }
                }
                C4875l.firebase();
                return 0;
            case 21:
                Iterator it3 = ((C9494l) obj).loadAd.iterator();
                if (it3.hasNext()) {
                    Integer numValueOf5 = Integer.valueOf(C5664l.f12028l.indexOf(new C10134l(((C16853l) it3.next()).crashlytics)));
                    while (it3.hasNext()) {
                        Integer numValueOf6 = Integer.valueOf(C5664l.f12028l.indexOf(new C10134l(((C16853l) it3.next()).crashlytics)));
                        if (numValueOf5.compareTo(numValueOf6) < 0) {
                            numValueOf5 = numValueOf6;
                        }
                    }
                    Iterator it4 = ((C9494l) obj2).loadAd.iterator();
                    if (it4.hasNext()) {
                        Integer numValueOf7 = Integer.valueOf(C5664l.f12028l.indexOf(new C10134l(((C16853l) it4.next()).crashlytics)));
                        while (it4.hasNext()) {
                            Integer numValueOf8 = Integer.valueOf(C5664l.f12028l.indexOf(new C10134l(((C16853l) it4.next()).crashlytics)));
                            if (numValueOf7.compareTo(numValueOf8) < 0) {
                                numValueOf7 = numValueOf8;
                            }
                        }
                        return AbstractC2920l.crashlytics(numValueOf5, numValueOf7);
                    }
                }
                C4875l.firebase();
                return 0;
            case 22:
                return AbstractC2920l.crashlytics(((C7057l) obj).yandex, ((C7057l) obj2).yandex);
            case 23:
                return AbstractC2920l.crashlytics(((C14337l) obj).yandex, ((C14337l) obj2).yandex);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return AbstractC2920l.crashlytics(Integer.valueOf(((C8108l) obj).yandex), Integer.valueOf(((C8108l) obj2).yandex));
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C10570l) obj).loadAd - ((C10570l) obj2).loadAd;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                EnumC1375l enumC1375lYandex = EnumC1375l.yandex(EnumC17969l.valueOf(((InterfaceC4656l) obj).getId()));
                EnumC1375l enumC1375lYandex2 = EnumC1375l.yandex(EnumC17969l.valueOf(((InterfaceC4656l) obj2).getId()));
                int i = Alert.DURATION_SHOW_INDEFINITELY;
                int i2 = enumC1375lYandex != null ? enumC1375lYandex.f3503l : Integer.MAX_VALUE;
                if (enumC1375lYandex2 != null) {
                    i = enumC1375lYandex2.f3503l;
                }
                return i2 - i;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return AbstractC2920l.crashlytics(((C11018l) obj).yandex, ((C11018l) obj2).yandex);
            default:
                C9138l c9138l = (C9138l) obj2;
                C9138l c9138l2 = (C9138l) obj;
                return !c9138l2.f18789l.equals(c9138l.f18789l) ? c9138l2.f18789l.compareTo(c9138l.f18789l) : Long.compare(c9138l2.billing(), c9138l.billing());
        }
    }
}
