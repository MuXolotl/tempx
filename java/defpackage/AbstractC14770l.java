package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;

/* JADX INFO: renamed from: lٌٔٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14770l {
    public static final C15578l yandex = new C15578l(-1913223407, false, new C3817l(28));
    public static final C15578l loadAd = new C15578l(804128533, false, new C3817l(29));

    public static final boolean admob(AudioPlaylist audioPlaylist) {
        long j = audioPlaylist.amazon;
        C16287l.yandex.getClass();
        return j == C16287l.crashlytics() && audioPlaylist.subscription == null;
    }

    public static final String amazon(AudioPlaylist audioPlaylist) {
        List list = audioPlaylist.license;
        if (!list.isEmpty()) {
            String str = ((AlbumThumb) list.get(0)).purchase;
            return str == null ? ((AlbumThumb) list.get(0)).amazon : str;
        }
        AlbumThumb albumThumb = audioPlaylist.Signature;
        if (albumThumb == null) {
            return null;
        }
        String str2 = albumThumb.purchase;
        return str2 == null ? albumThumb.amazon : str2;
    }

    public static final boolean billing(AudioPlaylist audioPlaylist) {
        return !audioPlaylist.isVip.isEmpty();
    }

    public static final MainArtist crashlytics(AudioPlaylist audioPlaylist) {
        if (billing(audioPlaylist)) {
            return (MainArtist) audioPlaylist.isVip.get(0);
        }
        return null;
    }

    public static C5884l firebase(C3844l... c3844lArr) {
        if (c3844lArr.length == 0) {
            return new C5884l(new C3844l[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(new C14743l(c3844lArr, false));
        AbstractC3826l.tapsense(arrayList);
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(-1);
        }
        int length = c3844lArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList2.set(AbstractC14055l.amazon(arrayList, c3844lArr[i2]), Integer.valueOf(i3));
            i2++;
            i3++;
        }
        if (((C3844l) arrayList.get(0)).purchase() <= 0) {
            C8339l.metrica("the empty byte string is not a supported option");
            return null;
        }
        int i4 = 0;
        while (i4 < arrayList.size()) {
            C3844l c3844l = (C3844l) arrayList.get(i4);
            int i5 = i4 + 1;
            int i6 = i5;
            while (i6 < arrayList.size()) {
                C3844l c3844l2 = (C3844l) arrayList.get(i6);
                c3844l2.getClass();
                if (!c3844l2.remoteconfig(0, c3844l.purchase(), c3844l)) {
                    break;
                }
                if (c3844l2.purchase() == c3844l.purchase()) {
                    C8936l.smaato(c3844l2, "duplicate option: ");
                    return null;
                }
                if (((Number) arrayList2.get(i6)).intValue() > ((Number) arrayList2.get(i4)).intValue()) {
                    arrayList.remove(i6);
                    ((Number) arrayList2.remove(i6)).intValue();
                } else {
                    i6++;
                }
            }
            i4 = i5;
        }
        C0869l c0869l = new C0869l();
        yandex(0L, c0869l, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i7 = (int) (c0869l.f2526l / 4);
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            iArr[i8] = c0869l.readInt();
        }
        return new C5884l((C3844l[]) Arrays.copyOf(c3844lArr, c3844lArr.length), iArr);
    }

    public static final boolean isPro(AudioPlaylist audioPlaylist) {
        return audioPlaylist.crashlytics < 0;
    }

    public static final C7620l loadAd(Context context) {
        C14965l c14965l = new C14965l();
        c14965l.f29441l = context.getApplicationContext();
        return new C7620l(c14965l, new C14482l(Build.VERSION.SDK_INT >= 31 ? C6585l.yandex.yandex(context) : 0));
    }

    public static String metrica(int i) {
        if (i == 0) {
            return "Clamp";
        }
        if (i == 1) {
            return "Repeated";
        }
        if (i == 2) {
            return "Mirror";
        }
        return i == 3 ? "Decal" : "Unknown";
    }

    public static final boolean mopub(AudioPlaylist audioPlaylist) {
        String str = audioPlaylist.purchase;
        return (AbstractC8576l.yandex(str, "ugc") || AbstractC8576l.yandex(str, "generated") || AbstractC8576l.yandex(str, "playlist")) ? false : true;
    }

    public static final Uri purchase(AudioPlaylist audioPlaylist) {
        String str;
        List list = audioPlaylist.license;
        if (audioPlaylist.f36624volatile) {
            return Uri.parse(AbstractC0825l.admob(audioPlaylist.f36619native ? 1 : 5, vip(audioPlaylist)).f27331l.tapsense());
        }
        if (list.isEmpty()) {
            AlbumThumb albumThumb = audioPlaylist.Signature;
            if (albumThumb != null) {
                String str2 = albumThumb.purchase;
                if (str2 == null) {
                    str2 = albumThumb.amazon;
                }
                if (str2 != null) {
                    return Uri.parse(str2);
                }
            }
        } else {
            AlbumThumb albumThumb2 = (AlbumThumb) AbstractC16901l.m4217extends(list);
            if (albumThumb2 == null || (str = albumThumb2.purchase) == null) {
                AlbumThumb albumThumb3 = (AlbumThumb) AbstractC16901l.m4217extends(list);
                str = albumThumb3 != null ? albumThumb3.amazon : null;
            }
            if (str != null) {
                return Uri.parse(str);
            }
        }
        return null;
    }

    public static final String remoteconfig(AudioPlaylist audioPlaylist) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(audioPlaylist.amazon);
        sb.append('_');
        sb.append(audioPlaylist.crashlytics);
        String str2 = audioPlaylist.pro;
        if (str2 == null || str2.length() == 0) {
            str = "";
        } else {
            str = "_" + str2;
        }
        sb.append(str);
        return sb.toString();
    }

    public static final String smaato(AudioPlaylist audioPlaylist) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(audioPlaylist.amazon);
        sb.append('_');
        sb.append(audioPlaylist.crashlytics);
        String str2 = audioPlaylist.pro;
        if (str2 == null || str2.length() == 0) {
            str = "";
        } else {
            str = "/" + str2;
        }
        sb.append(str);
        return sb.toString();
    }

    public static final boolean subs(AudioPlaylist audioPlaylist) {
        if (audioPlaylist.subscription != null && AbstractC8576l.yandex(audioPlaylist.metrica, Boolean.TRUE)) {
            return true;
        }
        long j = audioPlaylist.amazon;
        C16287l.yandex.getClass();
        return j == C16287l.crashlytics();
    }

    public static final String vip(AudioPlaylist audioPlaylist) {
        StringBuilder sb = new StringBuilder();
        sb.append(audioPlaylist.amazon);
        sb.append('_');
        sb.append(audioPlaylist.crashlytics);
        return sb.toString();
    }

    public static void yandex(long j, C0869l c0869l, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            C8339l.metrica("Failed requirement.");
            return;
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((C3844l) arrayList4.get(i8)).purchase() < i7) {
                C8339l.metrica("Failed requirement.");
                return;
            }
        }
        C3844l c3844l = (C3844l) arrayList.get(i2);
        C3844l c3844l2 = (C3844l) arrayList4.get(i3 - 1);
        if (i7 == c3844l.purchase()) {
            int iIntValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            C3844l c3844l3 = (C3844l) arrayList4.get(i9);
            i4 = i9;
            i5 = iIntValue;
            c3844l = c3844l3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (c3844l.isPro(i7) == c3844l2.isPro(i7)) {
            int iMin = Math.min(c3844l.purchase(), c3844l2.purchase());
            int i10 = 0;
            for (int i11 = i7; i11 < iMin && c3844l.isPro(i11) == c3844l2.isPro(i11); i11++) {
                i10++;
            }
            long j3 = (c0869l.f2526l / 4) + j + 2 + ((long) i10) + 1;
            c0869l.m714l(-i10);
            c0869l.m714l(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                c0869l.m714l(c3844l.isPro(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 == ((C3844l) arrayList4.get(i4)).purchase()) {
                    c0869l.m714l(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    C8339l.smaato("Check failed.");
                    return;
                }
            }
            C0869l c0869l2 = new C0869l();
            c0869l.m714l(((int) ((c0869l2.f2526l / 4) + j3)) * (-1));
            yandex(j3, c0869l2, i12, arrayList4, i4, i3, arrayList5);
            c0869l.mo736volatile(c0869l2);
            return;
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((C3844l) arrayList4.get(i14 - 1)).isPro(i7) != ((C3844l) arrayList4.get(i14)).isPro(i7)) {
                i13++;
            }
        }
        long j4 = (c0869l.f2526l / 4) + j + 2 + ((long) (i13 * 2));
        c0869l.m714l(i13);
        c0869l.m714l(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int iIsPro = ((C3844l) arrayList4.get(i15)).isPro(i7);
            if (i15 == i4 || iIsPro != ((C3844l) arrayList4.get(i15 - 1)).isPro(i7)) {
                c0869l.m714l(iIsPro & 255);
            }
        }
        C0869l c0869l3 = new C0869l();
        int i16 = i4;
        while (i16 < i3) {
            byte bIsPro = ((C3844l) arrayList4.get(i16)).isPro(i7);
            int i17 = i16 + 1;
            int i18 = i17;
            while (true) {
                if (i18 >= i3) {
                    i18 = i3;
                    break;
                } else if (bIsPro != ((C3844l) arrayList4.get(i18)).isPro(i7)) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i17 == i18 && i7 + 1 == ((C3844l) arrayList4.get(i16)).purchase()) {
                c0869l.m714l(((Number) arrayList5.get(i16)).intValue());
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
            } else {
                c0869l.m714l(((int) ((c0869l3.f2526l / 4) + j4)) * (-1));
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
                yandex(j2, c0869l3, i7 + 1, arrayList, i16, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j4 = j2;
            i16 = i6;
            arrayList5 = arrayList3;
        }
        c0869l.mo736volatile(c0869l3);
    }
}
