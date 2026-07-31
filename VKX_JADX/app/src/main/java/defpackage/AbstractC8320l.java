package defpackage;

import java.io.EOFException;
import java.util.Iterator;
import java.util.List;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItemPhoto;

/* JADX INFO: renamed from: lًۡٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8320l {
    public static final C13850l yandex = new C13850l(5);
    public static final C13635l loadAd = new C13635l(1);
    public static final C13635l crashlytics = new C13635l(2);
    public static final C13635l amazon = new C13635l(3);
    public static final C13635l purchase = new C13635l(4);
    public static final C13635l billing = new C13635l(5);
    public static final C13635l mopub = new C13635l(6);
    public static final C13635l admob = new C13635l(7);
    public static final C13635l subs = new C13635l(8);
    public static final C13635l isPro = new C13635l(0);

    public static int amazon(C0396l c0396l, String str, int i, int i2) throws C8413l, EOFException {
        int iM509throw = c0396l.m509throw();
        if (iM509throw >= i && iM509throw <= i2) {
            return iM509throw;
        }
        throw new C6451l("Expected " + str + " but was " + iM509throw + " at path " + c0396l.inmobi(), 8, (byte) 0);
    }

    public static final String crashlytics(List list) {
        Object next;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int i = ((CustomCatalogBlockItemPhoto) next).crashlytics;
                do {
                    Object next2 = it.next();
                    int i2 = ((CustomCatalogBlockItemPhoto) next2).crashlytics;
                    if (i < i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        CustomCatalogBlockItemPhoto customCatalogBlockItemPhoto = (CustomCatalogBlockItemPhoto) next;
        String str = customCatalogBlockItemPhoto != null ? customCatalogBlockItemPhoto.loadAd : null;
        return str == null ? "" : str;
    }

    public static final String loadAd(int i, List list) {
        Object next;
        String str;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((CustomCatalogBlockItemPhoto) next).crashlytics < i);
        CustomCatalogBlockItemPhoto customCatalogBlockItemPhoto = (CustomCatalogBlockItemPhoto) next;
        if (customCatalogBlockItemPhoto != null && (str = customCatalogBlockItemPhoto.loadAd) != null) {
            return str;
        }
        CustomCatalogBlockItemPhoto customCatalogBlockItemPhoto2 = (CustomCatalogBlockItemPhoto) AbstractC16901l.m4217extends(list);
        String str2 = customCatalogBlockItemPhoto2 != null ? customCatalogBlockItemPhoto2.loadAd : null;
        return str2 == null ? "" : str2;
    }

    public static String purchase(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0064 A[LOOP:0: B:4:0x000d->B:35:0x0064, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0067 A[EDGE_INSN: B:43:0x0067->B:36:0x0067 BREAK  A[LOOP:0: B:4:0x000d->B:35:0x0064], SYNTHETIC] */
    public static final C18666l yandex(C3654l c3654l, boolean z) {
        AbstractC14971l abstractC14971l = (AbstractC14971l) c3654l.f7703l.mopub;
        Object obj = null;
        if ((abstractC14971l.f29457l & 8) != 0) {
            loop0: while (abstractC14971l != null) {
                if ((abstractC14971l.f29450l & 8) == 0) {
                    if ((abstractC14971l.f29457l & 8) != 0) {
                        break;
                        break;
                    }
                    abstractC14971l = abstractC14971l.f29460l;
                } else {
                    AbstractC14971l abstractC14971lLoadAd = abstractC14971l;
                    C17893l c17893l = null;
                    while (abstractC14971lLoadAd != null) {
                        if (abstractC14971lLoadAd instanceof InterfaceC3703l) {
                            obj = abstractC14971lLoadAd;
                            break loop0;
                        }
                        if ((abstractC14971lLoadAd.f29450l & 8) != 0 && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                            int i = 0;
                            for (AbstractC14971l abstractC14971l2 = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l2 != null; abstractC14971l2 = abstractC14971l2.f29460l) {
                                if ((abstractC14971l2.f29450l & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        abstractC14971lLoadAd = abstractC14971l2;
                                    } else {
                                        if (c17893l == null) {
                                            c17893l = new C17893l(0, new AbstractC14971l[16]);
                                        }
                                        if (abstractC14971lLoadAd != null) {
                                            c17893l.crashlytics(abstractC14971lLoadAd);
                                            abstractC14971lLoadAd = null;
                                        }
                                        c17893l.crashlytics(abstractC14971l2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l);
                    }
                    if ((abstractC14971l.f29457l & 8) != 0) {
                        break;
                    }
                    abstractC14971l = abstractC14971l.f29460l;
                }
            }
        }
        AbstractC14971l abstractC14971l3 = ((AbstractC14971l) ((InterfaceC3703l) obj)).f29454l;
        C6264l c6264lAdvert = c3654l.advert();
        if (c6264lAdvert == null) {
            c6264lAdvert = new C6264l();
        }
        return new C18666l(abstractC14971l3, z, c3654l, c6264lAdvert);
    }
}
