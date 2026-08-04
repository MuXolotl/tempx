package defpackage;

import android.util.Rational;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: lٌ۟ؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9075l implements InterfaceC2360l {
    public final Object billing;
    public final InterfaceC2360l purchase;
    public final /* synthetic */ int crashlytics = 1;
    public final HashMap amazon = new HashMap();

    public C9075l(InterfaceC2360l interfaceC2360l, C15421l c15421l) {
        this.purchase = interfaceC2360l;
        this.billing = c15421l;
    }

    public InterfaceC15313l amazon(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.amazon;
        if (map.containsKey(numValueOf)) {
            return (InterfaceC15313l) map.get(Integer.valueOf(i));
        }
        InterfaceC2360l interfaceC2360l = this.purchase;
        C9550l c9550lPurchase = null;
        if (interfaceC2360l.yandex(i)) {
            InterfaceC15313l interfaceC15313lLoadAd = interfaceC2360l.loadAd(i);
            C15421l c15421l = (C15421l) this.billing;
            if (interfaceC15313lLoadAd != null) {
                ArrayList arrayList = new ArrayList();
                for (C6410l c6410l : interfaceC15313lLoadAd.amazon()) {
                    if (AbstractC12637l.yandex(c6410l, c15421l)) {
                        arrayList.add(c6410l);
                    }
                }
                if (!arrayList.isEmpty()) {
                    c9550lPurchase = C9550l.purchase(interfaceC15313lLoadAd.yandex(), interfaceC15313lLoadAd.loadAd(), interfaceC15313lLoadAd.crashlytics(), arrayList);
                }
            }
            map.put(Integer.valueOf(i), c9550lPurchase);
        }
        return c9550lPurchase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, lٔۦٕ] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    public InterfaceC15313l crashlytics(int i) {
        C6410l c6410l;
        int i2;
        int i3;
        C6410l c6410l2;
        int i4;
        C6410l c6410l3;
        InterfaceC13662l interfaceC13662lYandex;
        ?? Purchase;
        C9075l c9075l = (C9075l) this.purchase;
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.amazon;
        if (map.containsKey(numValueOf)) {
            return (InterfaceC15313l) map.get(Integer.valueOf(i));
        }
        if (!c9075l.yandex(i)) {
            return null;
        }
        InterfaceC15313l interfaceC15313lPurchase = c9075l.purchase(i);
        if (interfaceC15313lPurchase == null) {
            Purchase = 0;
        } else {
            ArrayList arrayList = new ArrayList(interfaceC15313lPurchase.amazon());
            Iterator it = interfaceC15313lPurchase.amazon().iterator();
            do {
                if (!it.hasNext()) {
                    c6410l = null;
                    break;
                }
                c6410l = (C6410l) it.next();
            } while (c6410l.isPro != 0);
            if (c6410l == null) {
                c6410l3 = null;
                c6410l2 = null;
            } else {
                int i5 = c6410l.yandex;
                String str = c6410l.loadAd;
                int i6 = c6410l.mopub;
                if (1 != c6410l.isPro) {
                    i5 = 5;
                    str = "video/hevc";
                    i2 = 2;
                } else {
                    i2 = i6;
                }
                int i7 = i5;
                String str2 = str;
                int i8 = c6410l.crashlytics;
                int i9 = c6410l.admob;
                if (10 == i9) {
                    i4 = i8;
                    i3 = 10;
                    c6410l2 = null;
                } else {
                    i3 = 10;
                    int iDoubleValue = (int) (((double) i8) * new Rational(10, i9).doubleValue());
                    if (AbstractC5088l.firebase("BackupHdrProfileEncoderProfilesProvider")) {
                        c6410l2 = null;
                        AbstractC5088l.yandex("BackupHdrProfileEncoderProfilesProvider", String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d", Integer.valueOf(i8), 10, Integer.valueOf(i9), Integer.valueOf(iDoubleValue)));
                    } else {
                        c6410l2 = null;
                    }
                    i4 = iDoubleValue;
                }
                c6410l3 = new C6410l(i7, str2, i4, c6410l.amazon, c6410l.purchase, c6410l.billing, i2, i3, c6410l.subs, 1);
            }
            C4835l c4835l = (C4835l) this.billing;
            if (c6410l3 == null || (interfaceC13662lYandex = c4835l.yandex(c6410l3.loadAd)) == null || !interfaceC13662lYandex.inmobi(c6410l3.purchase, c6410l3.billing)) {
                c6410l3 = c6410l2;
            } else {
                int i10 = c6410l3.crashlytics;
                int iIntValue = ((Integer) interfaceC13662lYandex.mo1977throw().clamp(Integer.valueOf(i10))).intValue();
                if (iIntValue != i10) {
                    c6410l3 = new C6410l(c6410l3.yandex, c6410l3.loadAd, iIntValue, c6410l3.amazon, c6410l3.purchase, c6410l3.billing, c6410l3.mopub, c6410l3.admob, c6410l3.subs, c6410l3.isPro);
                }
            }
            if (c6410l3 != null) {
                arrayList.add(c6410l3);
            }
            Purchase = arrayList.isEmpty() ? c6410l2 : C9550l.purchase(interfaceC15313lPurchase.yandex(), interfaceC15313lPurchase.loadAd(), interfaceC15313lPurchase.crashlytics(), arrayList);
        }
        map.put(Integer.valueOf(i), Purchase);
        return Purchase;
    }

    @Override // defpackage.InterfaceC2360l
    public final InterfaceC15313l loadAd(int i) {
        switch (this.crashlytics) {
            case 0:
                return crashlytics(i);
            case 1:
                return amazon(i);
            default:
                return purchase(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ca  */
    public InterfaceC15313l purchase(int i) {
        InterfaceC15313l interfaceC15313lPurchase;
        Size size;
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.amazon;
        if (map.containsKey(numValueOf)) {
            return (InterfaceC15313l) map.get(Integer.valueOf(i));
        }
        InterfaceC2360l interfaceC2360l = this.purchase;
        if (interfaceC2360l.yandex(i)) {
            InterfaceC15313l interfaceC15313lLoadAd = interfaceC2360l.loadAd(i);
            Objects.requireNonNull(interfaceC15313lLoadAd);
            Iterator it = ((C17735l) this.billing).crashlytics(StretchedVideoResolutionQuirk.class).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((StretchedVideoResolutionQuirk) it.next()) != null) {
                        if (i == 4) {
                            size = new Size(640, 480);
                            break;
                        }
                        if (i == 5) {
                            size = new Size(960, 720);
                            break;
                        }
                        if (i == 6) {
                            size = new Size(1440, 1080);
                            break;
                        }
                        break;
                    }
                }
                size = null;
                break;
            }
            if (size == null) {
                interfaceC15313lPurchase = interfaceC15313lLoadAd;
            } else {
                ArrayList arrayList = new ArrayList();
                for (C6410l c6410l : interfaceC15313lLoadAd.amazon()) {
                    arrayList.add(new C6410l(c6410l.yandex, c6410l.loadAd, c6410l.crashlytics, c6410l.amazon, size.getWidth(), size.getHeight(), c6410l.mopub, c6410l.admob, c6410l.subs, c6410l.isPro));
                }
                if (arrayList.isEmpty()) {
                    interfaceC15313lPurchase = null;
                } else {
                    interfaceC15313lPurchase = C9550l.purchase(interfaceC15313lLoadAd.yandex(), interfaceC15313lLoadAd.loadAd(), interfaceC15313lLoadAd.crashlytics(), arrayList);
                }
            }
        } else {
            interfaceC15313lPurchase = null;
        }
        map.put(Integer.valueOf(i), interfaceC15313lPurchase);
        return interfaceC15313lPurchase;
    }

    @Override // defpackage.InterfaceC2360l
    public final boolean yandex(int i) {
        switch (this.crashlytics) {
            case 0:
                return ((C9075l) this.purchase).yandex(i) && crashlytics(i) != null;
            case 1:
                return this.purchase.yandex(i) && amazon(i) != null;
            default:
                return this.purchase.yandex(i) && purchase(i) != null;
        }
    }

    public C9075l(InterfaceC2360l interfaceC2360l, C17735l c17735l) {
        this.purchase = interfaceC2360l;
        this.billing = c17735l;
    }

    public C9075l(C9075l c9075l, C4835l c4835l) {
        this.purchase = c9075l;
        this.billing = c4835l;
    }
}
