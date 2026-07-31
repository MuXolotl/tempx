package defpackage;

import android.view.View;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؚؔۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7016l {
    public static final C15578l yandex = new C15578l(-232446787, false, new C10272l(5));
    public static final C15578l loadAd = new C15578l(-1709790445, false, new C13881l(16));

    public static int amazon(InputStream inputStream, byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i + i3, i2 - i3);
            if (i4 < 0) {
                break;
            }
            i3 += i4;
        }
        return i3;
    }

    public static byte[] crashlytics(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr, 0, 4096);
            if (i < 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static C17209l loadAd(String str) {
        Cfor cforM190private;
        Cfor cforBilling = AbstractC11696l.billing(str);
        C7100l c7100lAmazon = cforBilling == null ? null : AbstractC11696l.amazon(cforBilling);
        if (c7100lAmazon == null && (cforM190private = Cfor.m190private(str)) != null) {
            c7100lAmazon = AbstractC11696l.amazon(cforM190private);
        }
        if (c7100lAmazon == null) {
            return null;
        }
        return new C17209l(str, c7100lAmazon.f14871l.f6465l, c7100lAmazon.f14870l.vip(), c7100lAmazon.f14874l, c7100lAmazon.f14873l, c7100lAmazon.metrica());
    }

    public static final void yandex(final Function0 function0, long j, final C15721l c15721l, C15578l c15578l, C6956l c6956l, int i) {
        int i2;
        C15721l c15721l2;
        final EnumC9931l enumC9931l;
        boolean z;
        boolean z2;
        int i3;
        long j2 = j;
        c6956l.m2133new(-85756322);
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.purchase(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            c15721l2 = c15721l;
            i2 |= c6956l.billing(c15721l2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        } else {
            c15721l2 = c15721l;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.admob(c15578l) ? 2048 : 1024;
        }
        int i4 = i2;
        if (c6956l.m2127for(i4 & 1, (i4 & 1171) != 1170)) {
            c6956l.m2141switch();
            if ((i & 1) != 0 && !c6956l.ad()) {
                c6956l.m2124else();
            }
            c6956l.adcel();
            View view = (View) c6956l.isPro(AbstractC1242l.billing);
            InterfaceC13490l interfaceC13490l = (InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob);
            EnumC9931l enumC9931l2 = (EnumC9931l) c6956l.isPro(AbstractC4751l.vip);
            C14112l c14112lMopub = AbstractC8238l.mopub(c6956l);
            InterfaceC8714l interfaceC8714lVip = AbstractC8020l.vip(c15578l, c6956l);
            Object[] objArr = new Object[0];
            Object objM2132native = c6956l.m2132native();
            Object obj = C1867l.yandex;
            if (objM2132native == obj) {
                objM2132native = new C6573l(14);
                c6956l.m2147try(objM2132native);
            }
            UUID uuid = (UUID) AbstractC0825l.firebase(objArr, (Function0) objM2132native, c6956l);
            boolean zBilling = c6956l.billing(view) | c6956l.billing(interfaceC13490l);
            Object objM2132native2 = c6956l.m2132native();
            if (zBilling || objM2132native2 == obj) {
                enumC9931l = enumC9931l2;
                z = true;
                z2 = false;
                DialogC0608l dialogC0608l = new DialogC0608l(function0, c15721l2, j2, view, enumC9931l, interfaceC13490l, uuid);
                j2 = j2;
                C15578l c15578l2 = new C15578l(1379699857, true, new C7605l(interfaceC8714lVip, 7));
                C2999l c2999l = dialogC0608l.f2061l;
                c2999l.setParentCompositionContext(c14112lMopub);
                c2999l.f6505l.setValue(c15578l2);
                c2999l.f6506l = true;
                c2999l.amazon();
                c6956l.m2147try(dialogC0608l);
                objM2132native2 = dialogC0608l;
            } else {
                enumC9931l = enumC9931l2;
                z = true;
                z2 = false;
            }
            final DialogC0608l dialogC0608l2 = (DialogC0608l) objM2132native2;
            boolean zAdmob = c6956l.admob(dialogC0608l2);
            Object objM2132native3 = c6956l.m2132native();
            if (zAdmob || objM2132native3 == obj) {
                i3 = 4;
                objM2132native3 = new C8250l(i3, dialogC0608l2);
                c6956l.m2147try(objM2132native3);
            } else {
                i3 = 4;
            }
            AbstractC12311l.loadAd(dialogC0608l2, (Function1) objM2132native3, c6956l);
            boolean zAdmob2 = ((i4 & 14) == i3 ? z : z2) | c6956l.admob(dialogC0608l2) | ((i4 & 896) == 256 ? z : z2);
            if ((((i4 & 112) ^ 48) <= 32 || !c6956l.purchase(j2)) && (i4 & 48) != 32) {
                z = z2;
            }
            boolean zAmazon = zAdmob2 | z | c6956l.amazon(enumC9931l.ordinal());
            Object objM2132native4 = c6956l.m2132native();
            if (zAmazon || objM2132native4 == obj) {
                final long j3 = j2;
                Object obj2 = new Function0() { // from class: lٌْٔ
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        dialogC0608l2.billing(function0, c15721l, j3, enumC9931l);
                        return Unit.INSTANCE;
                    }
                };
                c6956l.m2147try(obj2);
                objM2132native4 = obj2;
            }
            AbstractC12311l.billing((Function0) objM2132native4, c6956l);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3409l(function0, j, c15721l, c15578l, i);
        }
    }
}
