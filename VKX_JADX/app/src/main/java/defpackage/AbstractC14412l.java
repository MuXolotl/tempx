package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٓۛؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14412l {
    public static final C15578l yandex = new C15578l(-933697239, false, new C5407l(5));
    public static final C15578l loadAd = new C15578l(-1001408544, false, new C5407l(6));

    public static C1024l crashlytics(C11012l c11012l, boolean z) {
        List list = c11012l.f22192l;
        C1024l c1024l = new C1024l(c11012l, null, 1, z);
        C7073l c7073lMo2892l = c11012l.mo2892l();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((InterfaceC16902l) obj).mo2182l() != 2) {
                break;
            }
            arrayList.add(obj);
        }
        C14297l c14297lM4228l = AbstractC16901l.m4228l(arrayList);
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(c14297lM4228l, 10));
        Iterator it = c14297lM4228l.iterator();
        while (true) {
            C14596l c14596l = (C14596l) it;
            if (!c14596l.f28578l.hasNext()) {
                AbstractC15211l abstractC15211lAd = ((InterfaceC16902l) AbstractC16901l.m4214continue(list)).ad();
                C6561l c6561l = AbstractC6004l.purchase;
                C2580l c2580l = C2580l.f5619l;
                c1024l.mo2896l(null, c7073lMo2892l, c2580l, c2580l, arrayList2, abstractC15211lAd, 4, c6561l);
                C1024l c1024l2 = c1024l;
                c1024l2.f20717l = true;
                return c1024l2;
            }
            C1143l c1143l = (C1143l) c14596l.next();
            int i = c1143l.yandex;
            InterfaceC16902l interfaceC16902l = (InterfaceC16902l) c1143l.loadAd;
            String strLoadAd = interfaceC16902l.getName().loadAd();
            C1024l c1024l3 = c1024l;
            arrayList2.add(new C17538l(c1024l3, null, i, C2782l.f6058l, C3498l.purchase(strLoadAd.equals("T") ? "instance" : strLoadAd.equals("E") ? "receiver" : strLoadAd.toLowerCase(Locale.ROOT)), interfaceC16902l.ad(), false, false, false, null, InterfaceC5706l.f12087l));
            c1024l = c1024l3;
        }
    }

    public static final int isPro(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        int i = config == null ? -1 : AbstractC12436l.yandex[config.ordinal()];
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 1;
        }
        C8339l.metrica("RenderScript Toolkit. Only ARGB_8888 and ALPHA_8 Bitmap are supported.");
        return 0;
    }

    public static final void loadAd(C13242l c13242l, Function1 function1, Function1 function2, Function1 function3, C6956l c6956l, int i) {
        c6956l.m2133new(411348303);
        int i2 = i | (c6956l.billing(c13242l) ? 4 : 2) | (c6956l.admob(function1) ? 32 : 16) | (c6956l.admob(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.admob(function3) ? 2048 : 1024);
        int i3 = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 1171) != 1170)) {
            InterfaceC8714l interfaceC8714lPurchase = AbstractC9637l.purchase(c13242l.admob, c6956l, 0);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(-1442000621, new C7885l(c13242l, i3), c6956l), null, null, null, 0, 0L, 0L, AbstractC10439l.yandex, AbstractC14566l.amazon(-1874838242, new C11237l(AbstractC9637l.purchase(c13242l.isPro, c6956l, 0), function1, function2, function3, AbstractC9637l.purchase(c13242l.subs, c6956l, 0), c13242l, interfaceC8714lPurchase), c6956l), c6956l, 905969712, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2104l(c13242l, function1, function2, function3, i, 12);
        }
    }

    public static void subs(String str, Bitmap bitmap) {
        if (bitmap.getConfig() != Bitmap.Config.ARGB_8888 && bitmap.getConfig() != Bitmap.Config.ALPHA_8) {
            C1759l.startapp(AbstractC5020l.isVip("RenderScript Toolkit. ", str, " supports only ARGB_8888 and ALPHA_8 bitmaps. "), bitmap.getConfig(), " provided.");
            return;
        }
        if (isPro(bitmap) * bitmap.getWidth() == bitmap.getRowBytes()) {
            return;
        }
        StringBuilder sbIsVip = AbstractC5020l.isVip("RenderScript Toolkit ", str, ". Only bitmaps with rowSize equal to the width * vectorSize are currently supported. Provided were rowBytes=");
        sbIsVip.append(bitmap.getRowBytes());
        sbIsVip.append(", width={");
        sbIsVip.append(bitmap.getWidth());
        sbIsVip.append(", and vectorSize=");
        sbIsVip.append(isPro(bitmap));
        sbIsVip.append('.');
        throw new IllegalArgumentException(sbIsVip.toString().toString());
    }

    public abstract void admob(int i);

    public abstract View amazon(Context context, ViewGroup viewGroup);

    public abstract View purchase();

    public void billing() {
    }

    public void mopub(String str) {
    }
}
