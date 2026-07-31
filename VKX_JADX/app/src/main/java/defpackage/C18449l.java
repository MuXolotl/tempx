package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import android.util.Size;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.KeyEvent;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٜۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18449l implements InterfaceC1541l, InterfaceC4902l, InterfaceC11695l, InterfaceC11795l, InterfaceC10466l, InterfaceC7456l, InterfaceC10367l, InterfaceC15853l, InterfaceC13919l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C8128l f36004l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C8128l f36005l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C8128l f36007l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f36009l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f36010l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f36011l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f36012l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C3781l f36006l = new C3781l(0);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C2351l f36008l = new C2351l(4);

    static {
        long j = -9223372036854775807L;
        f36004l = new C8128l(0, j, false);
        f36005l = new C8128l(2, j, 0 == true ? 1 : 0);
        f36007l = new C8128l(3, j, 0 == true ? 1 : 0);
    }

    public C18449l(int i) {
        this.f36011l = i;
        switch (i) {
            case 14:
                this.f36010l = new C7972l(9);
                this.f36009l = new C7972l(9);
                this.f36012l = new C7972l(9);
                break;
            case 15:
                this.f36010l = new C0540l();
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                this.f36010l = new C13660l();
                break;
            case 22:
                this.f36010l = new C13716l();
                this.f36009l = new HashMap();
                break;
            default:
                this.f36010l = new Object();
                break;
        }
    }

    public static C17339l applovin(C14227l c14227l) {
        C5601l c5601l = new C5601l(4);
        Uri uri = c14227l.loadAd;
        C11919l c11919l = new C11919l(uri == null ? null : uri.toString(), c14227l.billing, c5601l);
        AbstractC13675l abstractC13675l = c14227l.crashlytics;
        AbstractC8481l abstractC8481lCrashlytics = abstractC13675l.f26705l;
        if (abstractC8481lCrashlytics == null) {
            abstractC8481lCrashlytics = abstractC13675l.crashlytics();
            abstractC13675l.f26705l = abstractC8481lCrashlytics;
        }
        AbstractC10199l abstractC10199lRemoteconfig = abstractC8481lCrashlytics.iterator();
        while (abstractC10199lRemoteconfig.hasNext()) {
            Map.Entry entry = (Map.Entry) abstractC10199lRemoteconfig.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) c11919l.f23766l)) {
                ((HashMap) c11919l.f23766l).put(str, str2);
            }
        }
        HashMap map = new HashMap();
        int i = AbstractC17252l.yandex;
        C14513l c14513l = new C14513l(-1, 6, (byte) 0);
        UUID uuid = c14227l.yandex;
        uuid.getClass();
        boolean z = c14227l.amazon;
        boolean z2 = c14227l.purchase;
        int[] iArrSubscription = AbstractC9966l.subscription(c14227l.mopub);
        for (int i2 : iArrSubscription) {
            boolean z3 = true;
            if (i2 != 2 && i2 != 1) {
                z3 = false;
            }
            AbstractC12442l.admob(z3);
        }
        C17339l c17339l = new C17339l(uuid, c11919l, map, z, (int[]) iArrSubscription.clone(), z2, c14513l);
        byte[] bArr = c14227l.admob;
        byte[] bArrCopyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        AbstractC12442l.subscription(c17339l.f33693l.isEmpty());
        c17339l.f33681l = bArrCopyOf;
        return c17339l;
    }

    public static String appmetrica(String str, HashMap map) {
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        sb.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            sb.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String string = sb.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return AbstractC9361l.pro(str, "?", string);
        }
        if (!str.endsWith("&")) {
            string = "&".concat(string);
        }
        return str.concat(string);
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public static int m4531final(C18449l c18449l, int i, int i2, byte[] bArr, int i3) {
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int i6 = i5 + 3;
            if (i6 > i3) {
                break;
            }
            int i7 = (((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255)) & 8388607;
            if (i7 < 8380417) {
                ((int[]) c18449l.f36010l)[i + i4] = i7;
                i4++;
            }
            i5 = i6;
        }
        return i4;
    }

    public static boolean inmobi(Editable editable, KeyEvent keyEvent, boolean z) {
        C2085l[] c2085lArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (c2085lArr = (C2085l[]) editable.getSpans(selectionStart, selectionEnd, C2085l.class)) != null && c2085lArr.length > 0) {
                for (C2085l c2085l : c2085lArr) {
                    int spanStart = editable.getSpanStart(c2085l);
                    int spanEnd = editable.getSpanEnd(c2085l);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public static int m4532static(C18449l c18449l, int i, int i2, byte[] bArr, int i3, int i4) {
        int i5 = 0;
        int i6 = 0;
        while (i5 < i2 && i6 < i3) {
            byte b = bArr[i6];
            int i7 = b & 15;
            i6++;
            int i8 = (b & 255) >> 4;
            if (i4 == 2) {
                if (i7 < 15) {
                    ((int[]) c18449l.f36010l)[i + i5] = 2 - (i7 - (((i7 * 205) >> 10) * 5));
                    i5++;
                }
                if (i8 < 15 && i5 < i2) {
                    ((int[]) c18449l.f36010l)[i + i5] = 2 - (i8 - (((i8 * 205) >> 10) * 5));
                    i5++;
                }
            } else if (i4 == 4) {
                if (i7 < 9) {
                    ((int[]) c18449l.f36010l)[i + i5] = 4 - i7;
                    i5++;
                }
                if (i8 < 9 && i5 < i2) {
                    ((int[]) c18449l.f36010l)[i + i5] = 4 - i8;
                    i5++;
                }
            }
        }
        return i5;
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public static void m4533switch(C12714l c12714l, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            c12714l.admob(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e);
        }
    }

    public void Signature(Object obj, String str) {
        C10111l c10111l = new C10111l(25, false);
        ((C10111l) this.f36012l).f20589l = c10111l;
        this.f36012l = c10111l;
        c10111l.f20586l = obj;
        c10111l.f20587l = str;
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public void m4534abstract(long j) {
        ((C13601l) this.f36012l).f26630l.amazon = j;
    }

    public C14917l ad() throws GeneralSecurityException {
        C7972l c7972l;
        C0346l c0346lLoadAd;
        C3281l c3281l = (C3281l) this.f36010l;
        if (c3281l == null || (c7972l = (C7972l) this.f36009l) == null) {
            C18262l.ads("Cannot build without parameters and/or key material");
            return null;
        }
        if (c3281l.yandex != ((C0346l) c7972l.f16631l).yandex.length) {
            C18262l.ads("Key size mismatch");
            return null;
        }
        if (c3281l.yandex() && ((Integer) this.f36012l) == null) {
            C18262l.ads("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((C3281l) this.f36010l).yandex() && ((Integer) this.f36012l) != null) {
            C18262l.ads("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        C17927l c17927l = ((C3281l) this.f36010l).amazon;
        if (c17927l == C17927l.purchase) {
            c0346lLoadAd = AbstractC17168l.yandex;
        } else if (c17927l == C17927l.amazon) {
            c0346lLoadAd = AbstractC17168l.yandex(((Integer) this.f36012l).intValue());
        } else {
            if (c17927l != C17927l.crashlytics) {
                C8339l.smaato("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(c17927l)));
                return null;
            }
            c0346lLoadAd = AbstractC17168l.loadAd(((Integer) this.f36012l).intValue());
        }
        return new C14917l((C3281l) this.f36010l, (C7972l) this.f36009l, c0346lLoadAd, (Integer) this.f36012l);
    }

    public void adcel(C12606l c12606l, C6956l c6956l, int i) {
        c6956l.m2133new(647974620);
        int i2 = (c6956l.billing(c12606l) ? 4 : 2) | i | (c6956l.admob(this) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            AbstractC3383l.amazon(AbstractC0080l.amazon(AbstractC3605l.smaato(C4346l.f8873l, 16.0f), 1.0f), null, AbstractC13880l.purchase(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.f2320throws, 0L, c6956l, 0, 14), new C7224l(1.0f, 1.0f, 1.0f, 3.0f, 8.0f, 1.0f), null, AbstractC14566l.amazon(-1271886512, new C7442l(c12606l, this, 25), c6956l), c6956l, 196614, 18);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9772l(this, c12606l, i, 17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    @Override // defpackage.InterfaceC11795l
    public boolean admob(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        BigInteger bigInteger3;
        AbstractC2426l abstractC2426lIsPro;
        C7838l c7838l = ((AbstractC2017l) this.f36009l).f4542l;
        BigInteger bigInteger4 = c7838l.f16362l;
        int iBitLength = bigInteger4.bitLength();
        int length = bArr.length * 8;
        BigInteger bigInteger5 = new BigInteger(1, bArr);
        if (iBitLength < length) {
            bigInteger5 = bigInteger5.shiftRight(length - iBitLength);
        }
        BigInteger bigInteger6 = InterfaceC11695l.startapp;
        if (bigInteger.compareTo(bigInteger6) < 0 || bigInteger.compareTo(bigInteger4) >= 0 || bigInteger2.compareTo(bigInteger6) < 0 || bigInteger2.compareTo(bigInteger4) >= 0) {
            return false;
        }
        BigInteger bigIntegerIsPro = AbstractC16784l.isPro(bigInteger4, bigInteger2);
        AbstractC8859l abstractC8859lAds = AbstractC6974l.ads(c7838l.f16358l, bigInteger5.multiply(bigIntegerIsPro).mod(bigInteger4), ((C4148l) ((AbstractC2017l) this.f36009l)).f8515l, bigInteger.multiply(bigIntegerIsPro).mod(bigInteger4));
        if (abstractC8859lAds.smaato()) {
            return false;
        }
        AbstractC11918l abstractC11918l = abstractC8859lAds.yandex;
        if (abstractC11918l != null && (bigInteger3 = abstractC11918l.purchase) != null && bigInteger3.compareTo(InterfaceC11695l.tapsense) <= 0) {
            int i = abstractC11918l.billing;
            if (i == 1) {
                abstractC2426lIsPro = abstractC8859lAds.isPro();
            } else if (i == 2 || i == 3 || i == 4) {
                abstractC2426lIsPro = abstractC8859lAds.isPro().license();
            } else if (i == 6 || i == 7) {
                abstractC2426lIsPro = abstractC8859lAds.isPro();
            } else {
                abstractC2426lIsPro = null;
            }
            if (abstractC2426lIsPro != null && !abstractC2426lIsPro.metrica()) {
                AbstractC2426l abstractC2426l = abstractC8859lAds.loadAd;
                while (abstractC11918l.metrica(bigInteger)) {
                    if (abstractC11918l.isPro(bigInteger).startapp(abstractC2426lIsPro).equals(abstractC2426l)) {
                        return true;
                    }
                    bigInteger = bigInteger.add(bigInteger4);
                }
                return false;
            }
        }
        AbstractC8859l abstractC8859lStartapp = abstractC8859lAds.startapp();
        abstractC8859lStartapp.loadAd();
        return abstractC8859lStartapp.loadAd.signatures().mod(bigInteger4).equals(bigInteger);
    }

    public void ads(int i, C3654l c3654l) {
        C7972l c7972l = (C7972l) this.f36010l;
        C7972l c7972l2 = (C7972l) this.f36009l;
        C7972l c7972l3 = (C7972l) this.f36012l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            c7972l.appmetrica(c3654l);
            c7972l3.appmetrica(c3654l);
            return;
        }
        if (iInmobi == 1) {
            c7972l2.appmetrica(c3654l);
            c7972l3.appmetrica(c3654l);
            return;
        }
        if (iInmobi == 2) {
            if (c3654l.f7693l != null) {
                c7972l3.appmetrica(c3654l);
                return;
            } else {
                c7972l.appmetrica(c3654l);
                return;
            }
        }
        if (iInmobi != 3) {
            C18725l.billing();
        } else if (c3654l.f7693l != null) {
            c7972l3.appmetrica(c3654l);
        } else {
            c7972l2.appmetrica(c3654l);
        }
    }

    public C5925l advert() throws GeneralSecurityException {
        C7972l c7972l;
        C0346l c0346lLoadAd;
        C18563l c18563l = (C18563l) this.f36010l;
        if (c18563l == null || (c7972l = (C7972l) this.f36009l) == null) {
            C8339l.metrica("Cannot build without parameters and/or key material");
            return null;
        }
        if (c18563l.yandex != ((C0346l) c7972l.f16631l).yandex.length) {
            C18262l.ads("Key size mismatch");
            return null;
        }
        if (c18563l.yandex() && ((Integer) this.f36012l) == null) {
            C18262l.ads("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((C18563l) this.f36010l).yandex() && ((Integer) this.f36012l) != null) {
            C18262l.ads("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        C17162l c17162l = ((C18563l) this.f36010l).loadAd;
        if (c17162l == C17162l.purchase) {
            c0346lLoadAd = AbstractC17168l.yandex;
        } else if (c17162l == C17162l.amazon) {
            c0346lLoadAd = AbstractC17168l.yandex(((Integer) this.f36012l).intValue());
        } else {
            if (c17162l != C17162l.crashlytics) {
                C8339l.smaato("Unknown AesSivParameters.Variant: ".concat(String.valueOf(c17162l)));
                return null;
            }
            c0346lLoadAd = AbstractC17168l.loadAd(((Integer) this.f36012l).intValue());
        }
        return new C5925l((C18563l) this.f36010l, (C7972l) this.f36009l, c0346lLoadAd, (Integer) this.f36012l);
    }

    @Override // defpackage.InterfaceC10367l
    public void amazon(Executor executor, InterfaceC15984l interfaceC15984l) {
        synchronized (((HashMap) this.f36009l)) {
            boolean zIsEmpty = ((HashMap) this.f36009l).isEmpty();
            ((HashMap) this.f36009l).put(interfaceC15984l, executor);
            if (zIsEmpty) {
                AbstractC12272l.admob().execute(new RunnableC17625l(this, 1));
            } else {
                executor.execute(new RunnableC12388l(this, interfaceC15984l, 3));
            }
        }
    }

    @Override // defpackage.InterfaceC4902l
    public float billing() {
        return 1.0f;
    }

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public void m4535break(C10664l c10664l) {
        ArrayList arrayList = (ArrayList) this.f36010l;
        arrayList.clear();
        int size = c10664l.f21654return.size();
        for (int i = 0; i < size; i++) {
            C11338l c11338l = (C11338l) c10664l.f21654return.get(i);
            int[] iArr = c11338l.f22844const;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c11338l);
            }
        }
        c10664l.f21641l.f11538l = true;
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public boolean m4536case(int i, C16827l c16827l, C11338l c11338l) {
        C9379l c9379l = (C9379l) this.f36009l;
        int[] iArr = c11338l.f22844const;
        int[] iArr2 = c11338l.tapsense;
        c9379l.yandex = iArr[0];
        c9379l.loadAd = iArr[1];
        c9379l.crashlytics = c11338l.metrica();
        c9379l.amazon = c11338l.subs();
        c9379l.subs = false;
        c9379l.isPro = i;
        boolean z = c9379l.yandex == 3;
        boolean z2 = c9379l.loadAd == 3;
        boolean z3 = z && c11338l.f22856interface > 0.0f;
        boolean z4 = z2 && c11338l.f22856interface > 0.0f;
        if (z3 && iArr2[0] == 4) {
            c9379l.yandex = 1;
        }
        if (z4 && iArr2[1] == 4) {
            c9379l.loadAd = 1;
        }
        c16827l.loadAd(c11338l, c9379l);
        c11338l.m3059native(c9379l.purchase);
        c11338l.m3062synchronized(c9379l.billing);
        c11338l.inmobi = c9379l.admob;
        int i2 = c9379l.mopub;
        c11338l.f22858new = i2;
        c11338l.inmobi = i2 > 0;
        c9379l.isPro = 0;
        return c9379l.subs;
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public boolean m4537catch() {
        return ((HandlerC9564l) this.f36009l) != null;
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public void m4538class(int i, byte[] bArr) {
        int i2 = ((C16827l) this.f36009l).amazon;
        int i3 = 0;
        if (i2 != 2) {
            if (i2 == 4) {
                while (i3 < 128) {
                    int i4 = i3 * 2;
                    byte b = bArr[i + i3];
                    int[] iArr = (int[]) this.f36010l;
                    iArr[i4] = b & 15;
                    int i5 = i4 + 1;
                    iArr[i5] = (b & 255) >> 4;
                    iArr[i4] = i2 - iArr[i4];
                    iArr[i5] = i2 - iArr[i5];
                    i3++;
                }
                return;
            }
            return;
        }
        while (i3 < 32) {
            int i6 = (i3 * 3) + i;
            int i7 = i3 * 8;
            byte b2 = bArr[i6];
            int[] iArr2 = (int[]) this.f36010l;
            iArr2[i7] = b2 & 7;
            int i8 = i7 + 1;
            int i9 = b2 & 255;
            iArr2[i8] = (i9 >> 3) & 7;
            int i10 = i7 + 2;
            int i11 = bArr[i6 + 1] & 255;
            iArr2[i10] = (i9 >> 6) | ((i11 << 2) & 7);
            int i12 = i7 + 3;
            iArr2[i12] = (i11 >> 1) & 7;
            int i13 = i7 + 4;
            iArr2[i13] = (i11 >> 4) & 7;
            int i14 = i7 + 5;
            int i15 = bArr[i6 + 2] & 255;
            iArr2[i14] = (i11 >> 7) | ((i15 << 1) & 7);
            int i16 = i7 + 6;
            iArr2[i16] = (i15 >> 2) & 7;
            int i17 = i7 + 7;
            iArr2[i17] = (i15 >> 5) & 7;
            iArr2[i7] = i2 - iArr2[i7];
            iArr2[i8] = i2 - iArr2[i8];
            iArr2[i10] = i2 - iArr2[i10];
            iArr2[i12] = i2 - iArr2[i12];
            iArr2[i13] = i2 - iArr2[i13];
            iArr2[i14] = i2 - iArr2[i14];
            iArr2[i16] = i2 - iArr2[i16];
            iArr2[i17] = i2 - iArr2[i17];
            i3++;
        }
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public void m4539continue(int i, byte[] bArr) {
        byte[] bArr2 = new byte[8];
        int i2 = ((C16827l) this.f36009l).amazon;
        if (i2 != 2) {
            if (i2 != 4) {
                C18073l.license("Eta needs to be 2 or 4!");
                return;
            }
            for (int i3 = 0; i3 < 128; i3++) {
                int i4 = i3 * 2;
                int[] iArr = (int[]) this.f36010l;
                byte b = (byte) (i2 - iArr[i4]);
                bArr2[0] = b;
                byte b2 = (byte) (i2 - iArr[i4 + 1]);
                bArr2[1] = b2;
                bArr[i + i3] = (byte) ((b2 << 4) | b);
            }
            return;
        }
        for (int i5 = 0; i5 < 32; i5++) {
            int i6 = i5 * 8;
            int[] iArr2 = (int[]) this.f36010l;
            byte b3 = (byte) (i2 - iArr2[i6]);
            bArr2[0] = b3;
            byte b4 = (byte) (i2 - iArr2[i6 + 1]);
            bArr2[1] = b4;
            byte b5 = (byte) (i2 - iArr2[i6 + 2]);
            bArr2[2] = b5;
            bArr2[3] = (byte) (i2 - iArr2[i6 + 3]);
            bArr2[4] = (byte) (i2 - iArr2[i6 + 4]);
            bArr2[5] = (byte) (i2 - iArr2[i6 + 5]);
            bArr2[6] = (byte) (i2 - iArr2[i6 + 6]);
            bArr2[7] = (byte) (i2 - iArr2[i6 + 7]);
            int i7 = (i5 * 3) + i;
            bArr[i7] = (byte) ((b4 << 3) | b3 | (b5 << 6));
            bArr[i7 + 1] = (byte) ((bArr2[2] >> 2) | (bArr2[3] << 1) | (bArr2[4] << 4) | (bArr2[5] << 7));
            bArr[i7 + 2] = (byte) ((bArr2[5] >> 1) | (bArr2[6] << 2) | (bArr2[7] << 5));
        }
    }

    @Override // defpackage.InterfaceC11795l
    public BigInteger[] crashlytics(byte[] bArr) {
        C7838l c7838l = ((AbstractC2017l) this.f36009l).f4542l;
        BigInteger bigInteger = c7838l.f16362l;
        int iBitLength = bigInteger.bitLength();
        int length = bArr.length * 8;
        BigInteger bigInteger2 = new BigInteger(1, bArr);
        if (iBitLength < length) {
            bigInteger2 = bigInteger2.shiftRight(length - iBitLength);
        }
        BigInteger bigInteger3 = ((C8374l) ((AbstractC2017l) this.f36009l)).f17335l;
        InterfaceC7373l interfaceC7373l = (InterfaceC7373l) this.f36010l;
        if (interfaceC7373l.crashlytics()) {
            interfaceC7373l.purchase(bigInteger, bigInteger3, bArr);
        } else {
            interfaceC7373l.amazon(bigInteger, (SecureRandom) this.f36012l);
        }
        C16732l c16732l = new C16732l(0);
        while (true) {
            BigInteger bigIntegerLoadAd = interfaceC7373l.loadAd();
            AbstractC8859l abstractC8859lStartapp = c16732l.loadAd(c7838l.f16358l, bigIntegerLoadAd).startapp();
            abstractC8859lStartapp.loadAd();
            BigInteger bigIntegerMod = abstractC8859lStartapp.loadAd.signatures().mod(bigInteger);
            BigInteger bigInteger4 = InterfaceC11695l.metrica;
            if (!bigIntegerMod.equals(bigInteger4)) {
                BigInteger bigIntegerMod2 = AbstractC16784l.subs(bigInteger, bigIntegerLoadAd).multiply(bigInteger2.add(bigInteger3.multiply(bigIntegerMod))).mod(bigInteger);
                if (!bigIntegerMod2.equals(bigInteger4)) {
                    return new BigInteger[]{bigIntegerMod, bigIntegerMod2};
                }
            }
        }
    }

    @Override // defpackage.InterfaceC7456l
    /* JADX INFO: renamed from: default */
    public Object mo672default(C5807l c5807l) {
        c5807l.yandex(new RunnableC5360l(11, this), AbstractC12272l.yandex());
        ((RunnableScheduledFutureC10932l) this.f36012l).f22055l.set(c5807l);
        return "HandlerScheduledFuture-" + ((Callable) this.f36009l).toString();
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public boolean m4540else() {
        return !(((C10127l) ((C7972l) this.f36010l).f16631l).isEmpty() && ((C10127l) ((C7972l) this.f36012l).f16631l).isEmpty() && ((C10127l) ((C7972l) this.f36009l).f16631l).isEmpty());
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public boolean m4541extends(CharSequence charSequence, int i, int i2, C2049l c2049l) {
        if ((c2049l.crashlytics & 3) == 0) {
            C10201l c10201l = (C10201l) this.f36012l;
            C0680l c0680lLoadAd = c2049l.loadAd();
            int iYandex = c0680lLoadAd.yandex(8);
            if (iYandex != 0) {
                ((ByteBuffer) c0680lLoadAd.f31320l).getShort(iYandex + c0680lLoadAd.f31319l);
            }
            c10201l.getClass();
            ThreadLocal threadLocal = C10201l.loadAd;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean zHasGlyph = c10201l.yandex.hasGlyph(sb.toString());
            int i3 = c2049l.crashlytics & 4;
            c2049l.crashlytics = zHasGlyph ? i3 | 2 : i3 | 1;
        }
        return (c2049l.crashlytics & 3) == 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public AbstractC14318l m4542finally(C12681l c12681l, C9188l c9188l, boolean z) {
        EnumC15893l enumC15893lCrashlytics;
        C10038l c10038l = (C10038l) this.f36010l;
        C7757l c7757l = (C7757l) c10038l.f20463l;
        boolean z2 = c9188l.amazon;
        AbstractC11072l abstractC11072l = c12681l.loadAd;
        C13064l c13064l = abstractC11072l instanceof C13064l ? (C13064l) abstractC11072l : null;
        if (c13064l != null) {
            Class cls = c13064l.yandex;
            if (cls.equals(Void.TYPE)) {
                enumC15893lCrashlytics = null;
            } else {
                enumC15893lCrashlytics = EnumC17708l.loadAd(cls.getName()).crashlytics();
            }
        } else {
            enumC15893lCrashlytics = null;
        }
        C12544l c12544l = new C12544l(c10038l, c12681l, true);
        if (enumC15893lCrashlytics != null) {
            AbstractC15211l abstractC15211lAdcel = c7757l.metrica.subs().adcel(enumC15893lCrashlytics);
            AbstractC15211l abstractC15211l = (AbstractC15211l) AbstractC12300l.isPro(abstractC15211lAdcel, new C2172l(new InterfaceC3841l[]{abstractC15211lAdcel.getAnnotations(), c12544l}));
            return z2 ? abstractC15211l : AbstractC3605l.subs(abstractC15211l, abstractC15211l.mo8static(true));
        }
        AbstractC18041l abstractC18041lM4556this = m4556this(abstractC11072l, AbstractC1135l.purchase(2, z2, null, 6));
        if (z2) {
            return c7757l.metrica.subs().admob(z ? 3 : 1, abstractC18041lM4556this, c12544l);
        }
        return AbstractC3605l.subs(c7757l.metrica.subs().admob(1, abstractC18041lM4556this, c12544l), c7757l.metrica.subs().admob(3, abstractC18041lM4556this, c12544l).mo8static(true));
    }

    @Override // defpackage.InterfaceC4902l
    public InterfaceC1142l firebase(InterfaceC16983l interfaceC16983l) {
        return interfaceC16983l.mopub(Collections.singletonList(CaptureRequest.SCALER_CROP_REGION));
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public void m4543for(String str, String str2) {
        ((HashMap) this.f36012l).put(str, str2);
    }

    @Override // defpackage.InterfaceC15897l
    public Object get() {
        Context context = (Context) ((C14461l) this.f36010l).f28328l;
        InterfaceC12932l interfaceC12932l = (InterfaceC12932l) ((InterfaceC15897l) this.f36009l).get();
        C11835l c11835l = (C11835l) ((InterfaceC2661l) this.f36012l).get();
        return C15593l.yandex(c11835l, new C7972l(23, new C15079l(24, c11835l)), AbstractC11990l.yandex(interfaceC12932l), new C9871l(context, 2));
    }

    @Override // defpackage.InterfaceC1541l
    public C11911l getKey() {
        return (C11911l) this.f36012l;
    }

    @Override // defpackage.InterfaceC11795l
    public BigInteger getOrder() {
        return ((AbstractC2017l) this.f36009l).f4542l.f16362l;
    }

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public void m4544goto(InterfaceC14859l interfaceC14859l) {
        ((C13601l) this.f36012l).f26630l.crashlytics = interfaceC14859l;
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public void m4545import(EnumC9931l enumC9931l) {
        ((C13601l) this.f36012l).f26630l.loadAd = enumC9931l;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    @Override // defpackage.InterfaceC11795l
    public void init(boolean z, InterfaceC9719l interfaceC9719l) {
        Object obj;
        SecureRandom secureRandom;
        SecureRandom secureRandomLoadAd = null;
        if (z) {
            if (interfaceC9719l instanceof C6114l) {
                C6114l c6114l = (C6114l) interfaceC9719l;
                this.f36009l = (C8374l) c6114l.f12903l;
                secureRandom = c6114l.f12904l;
            } else {
                obj = (C8374l) interfaceC9719l;
            }
            AbstractC1497l.amazon("ECDSA", (AbstractC2017l) this.f36009l, z);
            AbstractC8776l.yandex();
            if (z && !((InterfaceC7373l) this.f36010l).crashlytics()) {
                if (secureRandom == null) {
                    secureRandomLoadAd = AbstractC8776l.loadAd();
                } else {
                    secureRandomLoadAd = secureRandom;
                }
            }
            this.f36012l = secureRandomLoadAd;
        }
        obj = (C4148l) interfaceC9719l;
        this.f36009l = obj;
        secureRandom = null;
        AbstractC1497l.amazon("ECDSA", (AbstractC2017l) this.f36009l, z);
        AbstractC8776l.yandex();
        if (z) {
            if (secureRandom == null) {
                secureRandomLoadAd = AbstractC8776l.loadAd();
            } else {
                secureRandomLoadAd = secureRandom;
            }
        }
        this.f36012l = secureRandomLoadAd;
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public void m4546instanceof(C10664l c10664l, int i, int i2, int i3) {
        c10664l.getClass();
        int i4 = c10664l.f22852goto;
        int i5 = c10664l.f22865super;
        c10664l.f22852goto = 0;
        c10664l.f22865super = 0;
        c10664l.m3059native(i2);
        c10664l.m3062synchronized(i3);
        if (i4 < 0) {
            c10664l.f22852goto = 0;
        } else {
            c10664l.f22852goto = i4;
        }
        if (i5 < 0) {
            c10664l.f22865super = 0;
        } else {
            c10664l.f22865super = i5;
        }
        C10664l c10664l2 = (C10664l) this.f36012l;
        c10664l2.f21652l = i;
        c10664l2.m2938else();
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public Object m4547interface(CharSequence charSequence, int i, int i2, int i3, boolean z, InterfaceC13232l interfaceC13232l) {
        int i4;
        char c;
        C2934l c2934l = new C2934l((C11886l) ((C12014l) this.f36009l).f23944l);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zMopub = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (true) {
                if (iCharCount < i2 && i5 < i3 && zMopub) {
                    SparseArray sparseArray = ((C11886l) c2934l.f6390l).yandex;
                    C11886l c11886l = sparseArray == null ? null : (C11886l) sparseArray.get(iCodePointAt);
                    if (c2934l.f6386l == 2) {
                        if (c11886l != null) {
                            c2934l.f6390l = c11886l;
                            c2934l.f6389l++;
                        } else {
                            if (iCodePointAt == 65038) {
                                c2934l.reset();
                            } else if (iCodePointAt != 65039) {
                                C11886l c11886l2 = (C11886l) c2934l.f6390l;
                                if (c11886l2.loadAd != null) {
                                    if (c2934l.f6389l != 1) {
                                        c2934l.f6385l = c11886l2;
                                        c2934l.reset();
                                    } else if (c2934l.billing()) {
                                        c2934l.f6385l = (C11886l) c2934l.f6390l;
                                        c2934l.reset();
                                    } else {
                                        c2934l.reset();
                                    }
                                    c = 3;
                                } else {
                                    c2934l.reset();
                                }
                            }
                            c = 1;
                        }
                        c = 2;
                    } else if (c11886l == null) {
                        c2934l.reset();
                        c = 1;
                    } else {
                        c2934l.f6386l = 2;
                        c2934l.f6390l = c11886l;
                        c2934l.f6389l = 1;
                        c = 2;
                    }
                    c2934l.f6384l = iCodePointAt;
                    if (c == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                        if (iCharCount >= i2) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c == 3) {
                        if (!z && m4541extends(charSequence, i4, iCharCount, ((C11886l) c2934l.f6385l).loadAd)) {
                            break;
                        }
                        zMopub = interfaceC13232l.mopub(charSequence, i4, iCharCount, ((C11886l) c2934l.f6385l).loadAd);
                        i5++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (c2934l.f6386l == 2 && ((C11886l) c2934l.f6390l).loadAd != null && ((c2934l.f6389l > 1 || c2934l.billing()) && i5 < i3 && zMopub && (z || !m4541extends(charSequence, i4, iCharCount, ((C11886l) c2934l.f6390l).loadAd)))) {
            interfaceC13232l.mopub(charSequence, i4, iCharCount, ((C11886l) c2934l.f6390l).loadAd);
        }
        return interfaceC13232l.loadAd();
    }

    @Override // defpackage.InterfaceC4902l
    public Rect isPro() {
        Rect rect = (Rect) this.f36009l;
        return rect == null ? (Rect) this.f36012l : rect;
    }

    public void isVip() {
        HandlerC9564l handlerC9564l = (HandlerC9564l) this.f36009l;
        handlerC9564l.getClass();
        handlerC9564l.yandex(false);
    }

    public void license(String str, String str2) {
        C9143l c9143l = new C9143l(25, false);
        ((C10111l) this.f36012l).f20589l = c9143l;
        this.f36012l = c9143l;
        c9143l.f20586l = str2;
        c9143l.f20587l = str;
    }

    @Override // defpackage.InterfaceC4902l
    public float loadAd() {
        InterfaceC5389l interfaceC5389l = ((C15736l) this.f36010l).loadAd;
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM;
        Object objValueOf = Float.valueOf(1.0f);
        Object objCrashlytics = ((C10861l) interfaceC5389l).crashlytics(key);
        if (objCrashlytics != null) {
            objValueOf = objCrashlytics;
        }
        Float f = (Float) objValueOf;
        float fFloatValue = f.floatValue();
        if (Math.abs(fFloatValue) >= ((double) Math.ulp(Math.abs(fFloatValue))) * 2.0d) {
            return f.floatValue();
        }
        if (AbstractC5088l.metrica()) {
            Log.w("CXCP", "Invalid max zoom ratio of " + f + " detected, defaulting to 1.0f");
        }
        return 1.0f;
    }

    @Override // defpackage.InterfaceC15853l
    public Size metrica(C18680l c18680l, C15421l c15421l) {
        C8688l c8688l = (C8688l) this.f36012l;
        if (AbstractC3352l.yandex(c15421l, ((C14444l) c8688l.getValue()).yandex)) {
            return (Size) ((C14444l) c8688l.getValue()).loadAd.get(c18680l);
        }
        return null;
    }

    @Override // defpackage.InterfaceC10367l
    public ListenableFuture mopub() {
        return AbstractC11064l.purchase(new C6536l(11, this));
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public EnumC9931l m4548native() {
        return ((C13601l) this.f36012l).f26630l.loadAd;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public void m4549new(InterfaceC16681l interfaceC16681l) {
        ExecutorC13021l executorC13021l = (ExecutorC13021l) this.f36010l;
        HandlerC9564l handlerC9564l = (HandlerC9564l) this.f36009l;
        if (handlerC9564l != null) {
            handlerC9564l.yandex(true);
        }
        if (interfaceC16681l != null) {
            executorC13021l.execute(new RunnableC5360l(15, interfaceC16681l));
        }
        ((C4875l) executorC13021l.f25501l).accept(executorC13021l.f25502l);
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public InterfaceC0729l m4550package(C2427l c2427l) {
        C17339l c17339l;
        c2427l.loadAd.getClass();
        C14227l c14227l = c2427l.loadAd.crashlytics;
        if (c14227l == null) {
            return InterfaceC0729l.vip;
        }
        synchronized (this.f36010l) {
            try {
                if (!c14227l.equals((C14227l) this.f36009l)) {
                    this.f36009l = c14227l;
                    this.f36012l = applovin(c14227l);
                }
                c17339l = (C17339l) this.f36012l;
                c17339l.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return c17339l;
    }

    public boolean premium(C3654l c3654l) {
        return !(c3654l.f7693l == null) && (((C10127l) ((C7972l) this.f36010l).f16631l).contains(c3654l) || ((C10127l) ((C7972l) this.f36009l).f16631l).contains(c3654l));
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public long m4551private() {
        return ((C13601l) this.f36012l).f26630l.amazon;
    }

    @Override // defpackage.InterfaceC15853l
    public List pro(C15421l c15421l) {
        C8688l c8688l = (C8688l) this.f36012l;
        return AbstractC3352l.yandex(c15421l, ((C14444l) c8688l.getValue()).yandex) ? AbstractC16901l.m4213const(((C14444l) c8688l.getValue()).loadAd.keySet()) : C2580l.f5619l;
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public void m4552public(InterfaceC13131l interfaceC13131l, InterfaceC7548l interfaceC7548l, int i) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.f36012l = null;
        HandlerC9564l handlerC9564l = new HandlerC9564l(this, looperMyLooper, interfaceC13131l, interfaceC7548l, i, SystemClock.elapsedRealtime());
        AbstractC12442l.subscription(((HandlerC9564l) this.f36009l) == null);
        this.f36009l = handlerC9564l;
        handlerC9564l.loadAd();
    }

    @Override // defpackage.InterfaceC13919l
    public void purchase(C13143l c13143l) {
        long jAmazon;
        ((C16391l) this.f36009l).getClass();
        String str = AbstractC15323l.yandex;
        C16391l c16391l = (C16391l) this.f36009l;
        synchronized (c16391l) {
            try {
                long j = c16391l.crashlytics;
                jAmazon = j != -9223372036854775807L ? j + c16391l.loadAd : c16391l.amazon();
            } catch (Throwable th) {
                throw th;
            }
        }
        long jPurchase = ((C16391l) this.f36009l).purchase();
        if (jAmazon == -9223372036854775807L || jPurchase == -9223372036854775807L) {
            return;
        }
        C5978l c5978l = (C5978l) this.f36010l;
        if (jPurchase != c5978l.tapsense) {
            C12984l c12984lYandex = c5978l.yandex();
            c12984lYandex.subscription = jPurchase;
            C5978l c5978l2 = new C5978l(c12984lYandex);
            this.f36010l = c5978l2;
            ((InterfaceC8979l) this.f36012l).mopub(c5978l2);
        }
        int iYandex = c13143l.yandex();
        ((InterfaceC8979l) this.f36012l).purchase(iYandex, c13143l);
        ((InterfaceC8979l) this.f36012l).yandex(jAmazon, 1, iYandex, 0, null);
    }

    @Override // defpackage.InterfaceC10367l
    public void remoteconfig(InterfaceC15984l interfaceC15984l) {
        synchronized (((HashMap) this.f36009l)) {
            ((HashMap) this.f36009l).remove(interfaceC15984l);
            if (((HashMap) this.f36009l).isEmpty()) {
                AbstractC12272l.admob().execute(new RunnableC17625l(this, 0));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x014d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0156  */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC15211l signatures(C5637l c5637l, C9188l c9188l, AbstractC15211l abstractC15211l) {
        C16017l c16017lTapsense;
        boolean z;
        C16017l c16017l;
        InterfaceC1925l interfaceC1925lMetrica;
        InterfaceC1925l interfaceC1925l;
        Iterator it;
        int i;
        InterfaceC0218l c10636l;
        Object next;
        List listM4213const;
        InterfaceC1925l interfaceC1925l2;
        AbstractC4946l abstractC4946lAdmob;
        InterfaceC17477l interfaceC17477lIsPro;
        int iMo2182l;
        C5501l c5501l;
        C18449l c18449l = this;
        C9188l c9188l2 = c9188l;
        int i2 = c9188l2.yandex;
        int i3 = c9188l2.loadAd;
        boolean z2 = c9188l2.amazon;
        C10038l c10038l = (C10038l) c18449l.f36010l;
        C7757l c7757l = (C7757l) c10038l.f20463l;
        if (abstractC15211l == null || (c16017lTapsense = abstractC15211l.mo1340package()) == null) {
            c16017lTapsense = AbstractC3058l.tapsense(new C12544l(c10038l, c5637l, false));
        }
        InterfaceC0845l interfaceC0845l = c5637l.loadAd;
        Type type = c5637l.yandex;
        if (interfaceC0845l == null) {
            C1759l.adcel(type, "Type not found: ");
            return null;
        }
        int i4 = 0;
        InterfaceC1925l interfaceC1925l3 = null;
        if (interfaceC0845l instanceof C12875l) {
            C12875l c12875l = (C12875l) interfaceC0845l;
            C2312l c2312lCrashlytics = c12875l.crashlytics();
            if (c2312lCrashlytics == null) {
                C11983l.license(interfaceC0845l, "Class type should have a FQ name: ");
                return null;
            }
            if (z2 && c2312lCrashlytics.equals(AbstractC11022l.yandex)) {
                C3182l c3182l = c7757l.startapp;
                C12899l c12899l = c3182l.crashlytics;
                InterfaceC13922l interfaceC13922l = C3182l.purchase[0];
                c12899l.getClass();
                C3498l c3498lPurchase = C3498l.purchase(AbstractC15901l.yandex(interfaceC13922l.getName()));
                z = z2;
                InterfaceC15234l interfaceC15234lPurchase = ((InterfaceC7637l) c3182l.loadAd.getValue()).purchase(c3498lPurchase, EnumC11300l.f22776l);
                interfaceC17477lIsPro = interfaceC15234lPurchase instanceof InterfaceC17477l ? (InterfaceC17477l) interfaceC15234lPurchase : null;
                if (interfaceC17477lIsPro == null) {
                    interfaceC17477lIsPro = c3182l.yandex.tapsense(new C3624l(AbstractC3974l.subs, c3498lPurchase), Collections.singletonList(1));
                }
            } else {
                z = z2;
                AbstractC16860l abstractC16860lSubs = c7757l.metrica.subs();
                C3624l c3624lMopub = C4632l.mopub(c2312lCrashlytics);
                interfaceC17477lIsPro = c3624lMopub != null ? abstractC16860lSubs.isPro(c3624lMopub.yandex()) : null;
                if (interfaceC17477lIsPro == null) {
                    c16017l = c16017lTapsense;
                    interfaceC17477lIsPro = null;
                } else if (C4632l.firebase.containsKey(AbstractC11125l.billing(interfaceC17477lIsPro))) {
                    if (i3 == 3 || i2 == 1) {
                        c16017l = c16017lTapsense;
                    } else {
                        InterfaceC8657l interfaceC8657l = (InterfaceC8657l) AbstractC16901l.m4212class(c5637l.crashlytics());
                        c16017l = c16017lTapsense;
                        C6962l c6962l = interfaceC8657l instanceof C6962l ? (C6962l) interfaceC8657l : null;
                        if (c6962l != null && c6962l.crashlytics() != null && AbstractC8576l.yandex(AbstractC8669l.m2412private(c6962l.yandex.getUpperBounds()), Object.class)) {
                            C16781l c16781lBilling = AbstractC11125l.billing(interfaceC17477lIsPro);
                            String str = C4632l.yandex;
                            C2312l c2312lSubs = C4632l.subs(c16781lBilling);
                            if (c2312lSubs == null) {
                                C10754l.startapp(interfaceC17477lIsPro, " is not a read-only collection", "Given class ");
                                return null;
                            }
                            InterfaceC16902l interfaceC16902l = (InterfaceC16902l) AbstractC16901l.m4212class(AbstractC3759l.purchase(interfaceC17477lIsPro).isPro(c2312lSubs).metrica().getParameters());
                            if (interfaceC16902l != null && (iMo2182l = interfaceC16902l.mo2182l()) != 0 && iMo2182l != 3) {
                            }
                        }
                    }
                    C2312l c2312lSubs2 = C4632l.subs(AbstractC11125l.billing(interfaceC17477lIsPro));
                    if (c2312lSubs2 == null) {
                        C10754l.startapp(interfaceC17477lIsPro, " is not a read-only collection", "Given class ");
                        return null;
                    }
                    interfaceC17477lIsPro = AbstractC3759l.purchase(interfaceC17477lIsPro).isPro(c2312lSubs2);
                }
                if (interfaceC17477lIsPro == null) {
                    c5501l = (C5501l) c7757l.firebase.f21690l;
                    if (c5501l == null) {
                        c5501l = null;
                    }
                    interfaceC17477lIsPro = c5501l.m1813l(c12875l);
                }
                if (interfaceC17477lIsPro != null || (interfaceC1925lMetrica = interfaceC17477lIsPro.metrica()) == null) {
                    C1759l.adcel(type, "Type not found: ");
                    return null;
                }
            }
            c16017l = c16017lTapsense;
            if (interfaceC17477lIsPro == null) {
                c5501l = (C5501l) c7757l.firebase.f21690l;
                if (c5501l == null) {
                    c5501l = null;
                }
                interfaceC17477lIsPro = c5501l.m1813l(c12875l);
            }
            if (interfaceC17477lIsPro != null) {
            }
            C1759l.adcel(type, "Type not found: ");
            return null;
        }
        z = z2;
        c16017l = c16017lTapsense;
        if (!(interfaceC0845l instanceof C16765l)) {
            C11983l.ad(interfaceC0845l, "Unknown classifier kind: ");
            return null;
        }
        InterfaceC16902l interfaceC16902lStartapp = ((InterfaceC7483l) c18449l.f36009l).startapp((C16765l) interfaceC0845l);
        interfaceC1925lMetrica = interfaceC16902lStartapp != null ? interfaceC16902lStartapp.metrica() : null;
        if (interfaceC1925lMetrica == null) {
            return null;
        }
        int i5 = 3;
        boolean z3 = (i3 == 3 || z || i2 == 1) ? false : true;
        if (AbstractC8576l.yandex(abstractC15211l != null ? abstractC15211l.mo1339native() : null, interfaceC1925lMetrica) && !c5637l.amazon() && z3) {
            return abstractC15211l.mo8static(true);
        }
        boolean z4 = c5637l.amazon() || (c5637l.crashlytics().isEmpty() && !interfaceC1925lMetrica.getParameters().isEmpty());
        List<InterfaceC16902l> parameters = interfaceC1925lMetrica.getParameters();
        if (!z4) {
            interfaceC1925l = interfaceC1925lMetrica;
            if (parameters.size() == c5637l.crashlytics().size()) {
                C14297l c14297lM4228l = AbstractC16901l.m4228l(c5637l.crashlytics());
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(c14297lM4228l, 10));
                Iterator it2 = c14297lM4228l.iterator();
                while (true) {
                    C14596l c14596l = (C14596l) it2;
                    if (!c14596l.f28578l.hasNext()) {
                        listM4213const = AbstractC16901l.m4213const(arrayList);
                        break;
                    }
                    C1143l c1143l = (C1143l) c14596l.next();
                    int i6 = c1143l.yandex;
                    InterfaceC8657l interfaceC8657l2 = (InterfaceC8657l) c1143l.loadAd;
                    parameters.size();
                    InterfaceC16902l interfaceC16902l2 = (InterfaceC16902l) parameters.get(i6);
                    C9188l c9188lPurchase = AbstractC1135l.purchase(2, i4, null, 7);
                    if (interfaceC8657l2 instanceof C6962l) {
                        C6962l c6962l2 = (C6962l) interfaceC8657l2;
                        AbstractC11072l abstractC11072lCrashlytics = c6962l2.crashlytics();
                        int i7 = !AbstractC8576l.yandex(AbstractC8669l.m2412private(c6962l2.yandex.getUpperBounds()), Object.class) ? i5 : 2;
                        if (abstractC11072lCrashlytics == null || !(interfaceC16902l2.mo2182l() == 1 || i7 == interfaceC16902l2.mo2182l())) {
                            it = it2;
                            i = 0;
                            c10636l = AbstractC12008l.firebase(interfaceC16902l2, c9188lPurchase);
                        } else {
                            if (c6962l2.crashlytics() == null) {
                                C8339l.metrica("Nullability annotations on unbounded wildcards aren't supported");
                                return null;
                            }
                            Iterator it3 = new C12544l(c10038l, c6962l2, false).iterator();
                            while (true) {
                                C12588l c12588l = (C12588l) it3;
                                if (!c12588l.hasNext()) {
                                    it = it2;
                                    next = null;
                                    break;
                                }
                                next = c12588l.next();
                                InterfaceC1910l interfaceC1910l = (InterfaceC1910l) next;
                                C2312l[] c2312lArr = AbstractC4753l.loadAd;
                                int length = c2312lArr.length;
                                it = it2;
                                int i8 = 0;
                                while (i8 < length) {
                                    int i9 = i8;
                                    Iterator it4 = it3;
                                    if (AbstractC8576l.yandex(interfaceC1910l.mopub(), c2312lArr[i9])) {
                                        break;
                                    }
                                    i8 = i9 + 1;
                                    it3 = it4;
                                }
                                it2 = it;
                            }
                            InterfaceC1910l interfaceC1910l2 = (InterfaceC1910l) next;
                            i = 0;
                            AbstractC18041l abstractC18041lM4556this = c18449l.m4556this(abstractC11072lCrashlytics, AbstractC1135l.purchase(2, false, null, 7));
                            if (interfaceC1910l2 != null) {
                                ArrayList arrayListM4215default = AbstractC16901l.m4215default(abstractC18041lM4556this.getAnnotations(), interfaceC1910l2);
                                abstractC18041lM4556this = AbstractC12300l.isPro(abstractC18041lM4556this, arrayListM4215default.isEmpty() ? C2782l.f6058l : new C2172l(i, arrayListM4215default));
                            }
                            c10636l = AbstractC12300l.amazon(abstractC18041lM4556this, i7, interfaceC16902l2);
                        }
                    } else {
                        it = it2;
                        i = 0;
                        c10636l = new C10636l(1, c18449l.m4556this(interfaceC8657l2, c9188lPurchase));
                    }
                    arrayList.add(c10636l);
                    it2 = it;
                    i4 = i;
                    i5 = 3;
                }
            } else {
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(parameters, 10));
                Iterator it5 = parameters.iterator();
                while (it5.hasNext()) {
                    arrayList2.add(new C10636l(1, C8741l.loadAd(EnumC5123l.f11132l, ((InterfaceC16902l) it5.next()).getName().loadAd())));
                }
                listM4213const = AbstractC16901l.m4213const(arrayList2);
            }
        } else {
            ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(parameters, 10));
            for (InterfaceC16902l interfaceC16902l3 : parameters) {
                if (AbstractC12300l.admob(interfaceC16902l3, interfaceC1925l3, c9188l2.purchase)) {
                    abstractC4946lAdmob = AbstractC12008l.firebase(interfaceC16902l3, c9188l2);
                    interfaceC1925l2 = interfaceC1925lMetrica;
                } else {
                    InterfaceC1925l interfaceC1925l4 = interfaceC1925lMetrica;
                    interfaceC1925l2 = interfaceC1925l4;
                    abstractC4946lAdmob = C9912l.admob(interfaceC16902l3, C9188l.yandex(c9188l, 0, c5637l.amazon(), null, null, 59), new C15013l(c7757l.yandex, new C14066l(c18449l, interfaceC16902l3, c9188l, interfaceC1925l4, c5637l)));
                }
                arrayList3.add(abstractC4946lAdmob);
                c9188l2 = c9188l;
                c18449l = c18449l;
                interfaceC1925lMetrica = interfaceC1925l2;
                interfaceC1925l3 = null;
            }
            interfaceC1925l = interfaceC1925lMetrica;
            listM4213const = arrayList3;
        }
        return AbstractC3605l.ads(c16017l, interfaceC1925l, listM4213const, z3);
    }

    @Override // defpackage.InterfaceC4902l
    public InterfaceC1142l smaato(float f, InterfaceC16983l interfaceC16983l) {
        Rect rect = (Rect) this.f36012l;
        if (Math.abs(f) < ((double) Math.ulp(Math.abs(f))) * 2.0d) {
            if (AbstractC5088l.metrica()) {
                Log.w("CXCP", "ZoomCompat: Invalid zoom ratio of 0.0f passed in, defaulting to 1.0f");
            }
            f = 1.0f;
        }
        float fWidth = rect.width() / f;
        float fHeight = rect.height() / f;
        float fWidth2 = (rect.width() - fWidth) / 2.0f;
        float fHeight2 = (rect.height() - fHeight) / 2.0f;
        Rect rect2 = new Rect((int) fWidth2, (int) fHeight2, (int) (fWidth2 + fWidth), (int) (fHeight2 + fHeight));
        this.f36009l = rect2;
        return interfaceC16983l.isPro(Collections.singletonMap(CaptureRequest.SCALER_CROP_REGION, rect2), AbstractC3222l.loadAd);
    }

    public void startapp(Function0 function0, String str, int i, C13412l c13412l, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i2) {
        c6956l.m2133new(902187916);
        int i3 = i2 | (c6956l.admob(function0) ? 4 : 2) | (c6956l.billing(str) ? 32 : 16) | (c6956l.amazon(i) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.billing(c13412l) ? 2048 : 1024) | (c6956l.billing(interfaceC17242l) ? 16384 : 8192) | (c6956l.admob(this) ? 131072 : 65536);
        if (c6956l.m2127for(i3 & 1, (74899 & i3) != 74898)) {
            boolean zAdmob = c6956l.admob(this) | ((i3 & 14) == 4);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C12242l(function0, this, 6);
                c6956l.m2147try(objM2132native);
            }
            AbstractC17457l.mopub((Function0) objM2132native, interfaceC17242l, false, AbstractC16837l.yandex, c13412l, null, AbstractC14566l.amazon(-1976720567, new C6668l(i, str), c6956l), c6956l, ((i3 >> 9) & 112) | 805309440 | ((i3 << 3) & 57344), 484);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C5418l(this, function0, str, i, c13412l, interfaceC17242l, i2);
        }
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public long m4553strictfp() {
        C11826l c11826l = (C11826l) this.f36012l;
        if (c11826l != null) {
            return c11826l.f23659l;
        }
        return -1L;
    }

    @Override // defpackage.InterfaceC13919l
    public void subs(C16391l c16391l, InterfaceC2053l interfaceC2053l, Cstatic cstatic) {
        this.f36009l = c16391l;
        cstatic.yandex();
        cstatic.amazon();
        InterfaceC8979l interfaceC8979lStartapp = interfaceC2053l.startapp(cstatic.crashlytics, 5);
        this.f36012l = interfaceC8979lStartapp;
        interfaceC8979lStartapp.mopub((C5978l) this.f36010l);
    }

    public void subscription(int i, String str) {
        license(str, String.valueOf(i));
    }

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public void m4554super(InterfaceC13490l interfaceC13490l) {
        ((C13601l) this.f36012l).f26630l.yandex = interfaceC13490l;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public InterfaceC14859l m4555synchronized() {
        return ((C13601l) this.f36012l).f26630l.crashlytics;
    }

    public void tapsense(long j, String str) {
        license(str, String.valueOf(j));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX INFO: renamed from: this, reason: not valid java name */
    public AbstractC18041l m4556this(InterfaceC8657l interfaceC8657l, C9188l c9188l) {
        AbstractC18041l abstractC18041lM4556this;
        boolean z;
        C7757l c7757l = (C7757l) ((C10038l) this.f36010l).f20463l;
        if (interfaceC8657l instanceof C13064l) {
            Class cls = ((C13064l) interfaceC8657l).yandex;
            EnumC15893l enumC15893lCrashlytics = cls.equals(Void.TYPE) ? null : EnumC17708l.loadAd(cls.getName()).crashlytics();
            return enumC15893lCrashlytics != null ? c7757l.metrica.subs().subscription(enumC15893lCrashlytics) : c7757l.metrica.subs().pro();
        }
        if (!(interfaceC8657l instanceof C5637l)) {
            if (interfaceC8657l instanceof C12681l) {
                return m4542finally((C12681l) interfaceC8657l, c9188l, false);
            }
            if (interfaceC8657l instanceof C6962l) {
                AbstractC11072l abstractC11072lCrashlytics = ((C6962l) interfaceC8657l).crashlytics();
                return (abstractC11072lCrashlytics == null || (abstractC18041lM4556this = m4556this(abstractC11072lCrashlytics, c9188l)) == null) ? c7757l.metrica.subs().metrica() : abstractC18041lM4556this;
            }
            if (interfaceC8657l == null) {
                return c7757l.metrica.subs().metrica();
            }
            C1759l.adcel(interfaceC8657l, "Unsupported type: ");
            return null;
        }
        C5637l c5637l = (C5637l) interfaceC8657l;
        if (!c9188l.amazon) {
            z = c9188l.yandex != 1;
        }
        Type type = c5637l.yandex;
        boolean zAmazon = c5637l.amazon();
        EnumC5123l enumC5123l = EnumC5123l.f11125l;
        if (!zAmazon && !z) {
            AbstractC15211l abstractC15211lSignatures = signatures(c5637l, c9188l, null);
            return abstractC15211lSignatures != null ? abstractC15211lSignatures : C8741l.loadAd(enumC5123l, type.toString());
        }
        AbstractC15211l abstractC15211lSignatures2 = signatures(c5637l, c9188l.loadAd(3), null);
        if (abstractC15211lSignatures2 == null) {
            return C8741l.loadAd(enumC5123l, type.toString());
        }
        AbstractC15211l abstractC15211lSignatures3 = signatures(c5637l, c9188l.loadAd(2), abstractC15211lSignatures2);
        if (abstractC15211lSignatures3 == null) {
            return C8741l.loadAd(enumC5123l, type.toString());
        }
        return zAmazon ? new C6530l(abstractC15211lSignatures2, abstractC15211lSignatures3, 0) : AbstractC3605l.subs(abstractC15211lSignatures2, abstractC15211lSignatures3);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public void m4557throw(InterfaceC14090l interfaceC14090l, Uri uri, Map map, long j, long j2, C9159l c9159l) throws C7050l {
        C11826l c11826l = new C11826l(interfaceC14090l, j, j2);
        this.f36012l = c11826l;
        if (((InterfaceC14833l) this.f36009l) != null) {
            return;
        }
        InterfaceC14833l[] interfaceC14833lArrVip = ((InterfaceC6384l) this.f36010l).vip(uri, map);
        C16971l c16971lAds = AbstractC1186l.ads(interfaceC14833lArrVip.length);
        boolean z = true;
        int i = 0;
        if (interfaceC14833lArrVip.length == 1) {
            this.f36009l = interfaceC14833lArrVip[0];
        } else {
            for (InterfaceC14833l interfaceC14833l : interfaceC14833lArrVip) {
                try {
                    if (interfaceC14833l.crashlytics(c11826l)) {
                        this.f36009l = interfaceC14833l;
                        c11826l.f23660l = 0;
                        break;
                    }
                    c16971lAds.amazon(interfaceC14833l.purchase());
                    boolean z2 = ((InterfaceC14833l) this.f36009l) != null || c11826l.f23659l == j;
                    AbstractC12442l.subscription(z2);
                    c11826l.f23660l = 0;
                } catch (EOFException unused) {
                    if (((InterfaceC14833l) this.f36009l) != null || c11826l.f23659l == j) {
                    }
                } catch (Throwable th) {
                    if (((InterfaceC14833l) this.f36009l) == null && c11826l.f23659l != j) {
                        z = false;
                    }
                    AbstractC12442l.subscription(z);
                    c11826l.f23660l = 0;
                    throw th;
                }
                AbstractC12442l.subscription(z2);
                c11826l.f23660l = 0;
            }
            if (((InterfaceC14833l) this.f36009l) == null) {
                String str = "None of the available extractors (" + new C1693l(", ").billing(AbstractC7280l.isPro(new C2922l(i), AbstractC1186l.pro(interfaceC14833lArrVip))) + ") could read the stream.";
                uri.getClass();
                throw new C7050l(str, c16971lAds.mopub());
            }
        }
        ((InterfaceC14833l) this.f36009l).billing(c9159l);
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public C3185l m4558throws() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        C0554l.ad();
        InputStream inputStream = null;
        String string = null;
        inputStream = null;
        try {
            String strAppmetrica = appmetrica((String) this.f36010l, (HashMap) this.f36009l);
            String strConcat = "GET Request URL: ".concat(strAppmetrica);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strConcat, null);
            }
            httpsURLConnection = (HttpsURLConnection) new URL(strAppmetrica).openConnection();
            try {
                httpsURLConnection.setReadTimeout(ModuleDescriptor.MODULE_VERSION);
                httpsURLConnection.setConnectTimeout(ModuleDescriptor.MODULE_VERSION);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : ((HashMap) this.f36012l).entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                        char[] cArr = new char[8192];
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            int i = bufferedReader.read(cArr);
                            if (i == -1) {
                                break;
                            }
                            sb.append(cArr, 0, i);
                        }
                        string = sb.toString();
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new C3185l(responseCode, string);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public String toString() {
        int i = 0;
        switch (this.f36011l) {
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return "MimeMatchedVideoCapabilities(mime=" + ((String) this.f36010l) + ", cameraInfo=" + ((InterfaceC15879l) this.f36009l) + ')';
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f36010l);
                sb.append('{');
                C10111l c10111l = (C10111l) ((C10111l) this.f36009l).f20589l;
                String str = "";
                while (c10111l != null) {
                    Object obj = c10111l.f20586l;
                    sb.append(str);
                    String str2 = (String) c10111l.f20587l;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    c10111l = (C10111l) c10111l.f20589l;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                StringBuilder sb2 = new StringBuilder("[");
                while (true) {
                    int[] iArr = (int[]) this.f36010l;
                    if (i >= iArr.length) {
                        sb2.append("]");
                        return sb2.toString();
                    }
                    sb2.append(iArr[i]);
                    if (i != ((int[]) this.f36010l).length - 1) {
                        sb2.append(", ");
                    }
                    i++;
                }
                break;
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public void m4559try(byte[] bArr, short s) {
        int i;
        C2494l c2494l = (C2494l) this.f36012l;
        int i2 = ((C16827l) this.f36009l).amazon;
        if (i2 == 2) {
            c2494l.getClass();
            i = 1;
        } else if (i2 != 4) {
            C18073l.license("Wrong Dilithium Eta!");
            return;
        } else {
            c2494l.getClass();
            i = 2;
        }
        c2494l.getClass();
        C17951l c17951l = (C17951l) c2494l.f5290l;
        int i3 = i * 136;
        byte[] bArr2 = new byte[i3];
        c17951l.reset();
        c17951l.billing(0, bArr.length, bArr);
        c17951l.billing(0, 2, new byte[]{(byte) s, (byte) (s >> 8)});
        c17951l.remoteconfig(0, i3, bArr2);
        int iM4532static = m4532static(this, 0, PSKKeyManager.MAX_KEY_LENGTH_BYTES, bArr2, i3, i2);
        while (iM4532static < 256) {
            c17951l.remoteconfig(0, 136, bArr2);
            iM4532static += m4532static(this, iM4532static, 256 - iM4532static, bArr2, 136, i2);
        }
    }

    @Override // defpackage.InterfaceC1541l
    public Object vip(Function1 function1) {
        Object objInvoke = ((Function0) this.f36010l).invoke();
        function1.invoke(objInvoke);
        return new C10349l((C11911l) this.f36012l, objInvoke, (Function1) this.f36009l);
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public InterfaceC13490l m4560volatile() {
        return ((C13601l) this.f36012l).f26630l.yandex;
    }

    @Override // defpackage.InterfaceC1541l
    public void yandex(C16864l c16864l, Object obj) {
        C10349l c10349l = (C10349l) obj;
        C12825l c12825l = new C12825l(c16864l, c10349l.f21143l);
        c10349l.f21142l.invoke(c12825l);
        c10349l.f21141l = c12825l.amazon;
        for (C7805l c7805l : c12825l.crashlytics) {
            c7805l.yandex.mo804continue(c16864l, c7805l.loadAd);
        }
    }

    public /* synthetic */ C18449l(int i, boolean z) {
        this.f36011l = i;
    }

    public C18449l(C16827l c16827l) {
        this.f36011l = 29;
        this.f36010l = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        this.f36009l = c16827l;
        C2494l c2494l = (C2494l) c16827l.admob;
        this.f36012l = c2494l;
        c2494l.getClass();
    }

    public /* synthetic */ C18449l(Object obj, Object obj2, Object obj3, int i) {
        this.f36011l = i;
        this.f36010l = obj;
        this.f36009l = obj2;
        this.f36012l = obj3;
    }

    public C18449l(C17367l c17367l, C15053l c15053l) {
        this.f36011l = 27;
        this.f36010l = c17367l;
        this.f36009l = c15053l;
        this.f36012l = new ConcurrentHashMap();
    }

    public C18449l(C12689l c12689l) {
        this.f36011l = 26;
        this.f36010l = new C12633l(0);
        this.f36009l = new C11644l(5);
        this.f36012l = new C9810l(this, c12689l, 19);
    }

    public C18449l(String str, InterfaceC15879l interfaceC15879l, C4835l c4835l) {
        this.f36011l = 24;
        this.f36010l = str;
        this.f36009l = interfaceC15879l;
        this.f36012l = new C8688l(new C9810l(c4835l, this, 11));
    }

    public C18449l(String str, HashMap map) {
        this.f36011l = 20;
        this.f36010l = str;
        this.f36009l = map;
        this.f36012l = new HashMap();
    }

    public C18449l(C10038l c10038l, InterfaceC7483l interfaceC7483l) {
        this.f36011l = 21;
        this.f36010l = c10038l;
        this.f36009l = interfaceC7483l;
        this.f36012l = new C2494l(new C9912l(8));
    }

    public /* synthetic */ C18449l(int i, Object obj) {
        this.f36011l = i;
        this.f36010l = obj;
    }

    public C18449l(C12714l c12714l) {
        this.f36011l = 1;
        this.f36009l = null;
        this.f36012l = null;
        this.f36010l = c12714l;
    }

    public C18449l(String str, Function0 function0, Function1 function1) {
        InterfaceC13012l interfaceC13012lLoadAd;
        this.f36011l = 0;
        this.f36010l = function0;
        this.f36009l = function1;
        C2336l c2336l = AbstractC18202l.yandex;
        InterfaceC1388l interfaceC1388lLoadAd = c2336l.loadAd(C10349l.class);
        try {
            C0861l c0861l = C0861l.crashlytics;
            AbstractC11726l abstractC11726lVip = c2336l.vip(c2336l.loadAd(C18449l.class));
            c2336l.smaato(abstractC11726lVip, Collections.singletonList(AbstractC18202l.yandex(Object.class)));
            interfaceC13012lLoadAd = AbstractC18202l.loadAd(C10349l.class, AbstractC12953l.smaato(c2336l.remoteconfig(abstractC11726lVip, Collections.EMPTY_LIST, false)));
        } catch (Throwable unused) {
            interfaceC13012lLoadAd = null;
        }
        this.f36012l = new C11911l(str, new C11310l(interfaceC1388lLoadAd, interfaceC13012lLoadAd));
    }

    public C18449l(AppActivity appActivity, C12606l c12606l) {
        this.f36011l = 11;
        this.f36010l = appActivity;
        this.f36009l = c12606l;
    }

    public C18449l(C13601l c13601l) {
        this.f36011l = 9;
        this.f36012l = c13601l;
        this.f36010l = new C16543l(6, this);
    }

    public C18449l(C10664l c10664l) {
        this.f36011l = 7;
        this.f36010l = new ArrayList();
        this.f36009l = new C9379l();
        this.f36012l = c10664l;
    }

    public C18449l(C15736l c15736l) {
        this.f36011l = 12;
        this.f36010l = c15736l;
        this.f36012l = (Rect) ((C10861l) c15736l.loadAd).crashlytics(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
    }

    public C18449l(C12014l c12014l, C14529l c14529l, C10201l c10201l, Set set) {
        this.f36011l = 16;
        this.f36010l = c14529l;
        this.f36009l = c12014l;
        this.f36012l = c10201l;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m4547interface(str, 0, str.length(), 1, true, new C7396l(str, 1));
        }
    }

    public C18449l(RunnableScheduledFutureC10932l runnableScheduledFutureC10932l, Handler handler, Callable callable) {
        this.f36011l = 19;
        this.f36012l = runnableScheduledFutureC10932l;
        this.f36010l = handler;
        this.f36009l = callable;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C18449l(String str, int i) {
        this.f36011l = i;
        switch (i) {
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C10111l c10111l = new C10111l(25, false);
                this.f36009l = c10111l;
                this.f36012l = c10111l;
                this.f36010l = str;
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C12984l c12984l = new C12984l();
                c12984l.remoteconfig = AbstractC3825l.vip("video/mp2t");
                c12984l.vip = AbstractC3825l.vip(str);
                this.f36010l = new C5978l(c12984l);
                break;
            default:
                String strConcat = "ExoPlayer:Loader:".concat(str);
                String str2 = AbstractC15323l.yandex;
                int i2 = 2;
                this(i2, new ExecutorC13021l(Executors.newSingleThreadExecutor(new ThreadFactoryC17493l(strConcat, i2)), new C4875l(4), 1));
                break;
        }
    }

    public C18449l(C10975l c10975l) {
        this.f36011l = 6;
        this.f36010l = c10975l;
        this.f36009l = Choreographer.getInstance();
        this.f36012l = new ChoreographerFrameCallbackC17929l(1, this);
    }

    public C18449l(C0188l c0188l) {
        this.f36011l = 23;
        this.f36012l = c0188l;
        this.f36010l = new C16227l(1, this);
    }
}
