package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: lؔؓٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2351l implements Comparator {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f5112l;

    public /* synthetic */ C2351l(int i) {
        this.f5112l = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f5112l) {
            case 0:
                return AbstractC8576l.subs(((C12403l) obj2).yandex, ((C12403l) obj).yandex);
            case 1:
                return Integer.bitCount(((Integer) obj2).intValue()) - Integer.bitCount(((Integer) obj).intValue());
            case 2:
                return ((C5978l) obj2).isPro - ((C5978l) obj).isPro;
            case 3:
                return Integer.compare(((C15588l) obj2).loadAd, ((C15588l) obj).loadAd);
            case 4:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 5:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 6:
                String name = ((File) obj).getName();
                int i = C17093l.billing;
                return name.substring(0, i).compareTo(((File) obj2).getName().substring(0, i));
            case 7:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 8:
                return Integer.compare(((C11782l) ((List) obj).get(0)).f23591l, ((C11782l) ((List) obj2).get(0)).f23591l);
            case 9:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i2 = 12;
                int i3 = 13;
                return C9645l.billing(C12120l.crashlytics((C12120l) Collections.max(list, new C2351l(i2)), (C12120l) Collections.max(list2, new C2351l(i2)))).yandex(list.size(), list2.size()).loadAd((C12120l) Collections.max(list, new C2351l(i3)), (C12120l) Collections.max(list2, new C2351l(i3)), new C2351l(i3)).purchase();
            case 10:
                return ((C3121l) Collections.max((List) obj)).compareTo((C3121l) Collections.max((List) obj2));
            case 11:
                return ((C6949l) ((List) obj).get(0)).compareTo((C6949l) ((List) obj2).get(0));
            case 12:
                return C12120l.crashlytics((C12120l) obj, (C12120l) obj2);
            case 13:
                C12120l c12120l = (C12120l) obj;
                C12120l c12120l2 = (C12120l) obj2;
                boolean z = c12120l.f24114l;
                int i4 = c12120l.f24112l;
                AbstractC9743l abstractC9743lYandex = (z && c12120l.f24106l) ? C16717l.firebase : C16717l.firebase.yandex();
                boolean z2 = c12120l.f24118l.f10157throws;
                AbstractC12716l abstractC12716lLoadAd = AbstractC12716l.yandex;
                if (z2) {
                    abstractC12716lLoadAd = abstractC12716lLoadAd.loadAd(Integer.valueOf(i4), Integer.valueOf(c12120l2.f24112l), C16717l.firebase.yandex());
                }
                AbstractC12716l abstractC12716lLoadAd2 = abstractC12716lLoadAd.crashlytics(c12120l.f24111l, c12120l2.f24111l).loadAd(Integer.valueOf(c12120l.f24119l), Integer.valueOf(c12120l2.f24119l), abstractC9743lYandex);
                if (c12120l.f24104l && c12120l.f24122l) {
                    abstractC12716lLoadAd2 = abstractC12716lLoadAd2.yandex(c12120l.f24108l, c12120l2.f24108l);
                }
                return abstractC12716lLoadAd2.crashlytics(c12120l.f24101l, c12120l2.f24101l).loadAd(Integer.valueOf(i4), Integer.valueOf(c12120l2.f24112l), abstractC9743lYandex).purchase();
            case 14:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i5 = 0; i5 < bArr.length; i5++) {
                    byte b = bArr[i5];
                    byte b2 = bArr2[i5];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 15:
                return AbstractC8576l.subs(((C4503l) obj).loadAd, ((C4503l) obj2).loadAd);
            case 16:
                return ((C0682l) obj).yandex.compareTo(((C0682l) obj2).yandex);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C8934l c8934l = (C8934l) obj;
                C8934l c8934l2 = (C8934l) obj2;
                return (c8934l.f15487l - c8934l.f15488l) - (c8934l2.f15487l - c8934l2.f15488l);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C3654l c3654l = (C3654l) obj;
                C3654l c3654l2 = (C3654l) obj2;
                float f = c3654l.f7667l.startapp.f29330l;
                float f2 = c3654l2.f7667l.startapp.f29330l;
                return f == f2 ? AbstractC8576l.subs(c3654l.pro(), c3654l2.pro()) : Float.compare(f, f2);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return AbstractC8576l.subs(((InterfaceC9146l) obj).getIndex(), ((InterfaceC9146l) obj2).getIndex());
            case 20:
                C0812l c0812l = (C0812l) obj;
                C0812l c0812l2 = (C0812l) obj2;
                long j = c0812l.f2440l;
                long j2 = c0812l2.f2440l;
                if (j - j2 == 0) {
                    return c0812l.compareTo(c0812l2);
                }
                return j < j2 ? -1 : 1;
            case 21:
                C12245l c12245l = (C12245l) obj;
                C12245l c12245l2 = (C12245l) obj2;
                int i6 = c12245l.crashlytics;
                int i7 = c12245l2.crashlytics;
                if (i6 < i7) {
                    return -1;
                }
                if (i6 > i7) {
                    return 1;
                }
                return Integer.compare(c12245l2.amazon, c12245l.amazon);
            case 22:
                return ((C6916l) obj).yandex.compareTo(((C6916l) obj2).yandex);
            case 23:
                return ((C15474l) ((AbstractC12911l) obj)).yandex.compareTo(((C15474l) ((AbstractC12911l) obj2)).yandex);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C7334l) obj).yandex - ((C7334l) obj2).yandex;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return Float.compare(((C7334l) obj).crashlytics, ((C7334l) obj2).crashlytics);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return Integer.compare(((C10864l) obj).yandex.loadAd, ((C10864l) obj2).yandex.loadAd);
            default:
                return Long.compare(((C10619l) obj).loadAd, ((C10619l) obj2).loadAd);
        }
    }
}
