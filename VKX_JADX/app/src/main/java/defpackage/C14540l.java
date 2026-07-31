package defpackage;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.os.Build;
import android.text.TextUtils;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: lٓۥْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14540l implements InterfaceC6553l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C18262l f28478l = new C18262l(7);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f28479l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final MediaDrm f28480l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final UUID f28481l;

    public C14540l(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = AbstractC17252l.crashlytics;
        AbstractC12442l.subs(!uuid2.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f28481l = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(AbstractC17252l.amazon)) ? uuid : uuid2);
        this.f28480l = mediaDrm;
        this.f28479l = 1;
        if (AbstractC17252l.purchase.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // defpackage.InterfaceC6553l
    public final int adcel() {
        return 2;
    }

    @Override // defpackage.InterfaceC6553l
    public final byte[] admob() {
        return this.f28480l.openSession();
    }

    @Override // defpackage.InterfaceC6553l
    public final void ads(byte[] bArr, C17849l c17849l) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                AbstractC12148l.m3363package(this.f28480l, bArr, c17849l);
            } catch (UnsupportedOperationException unused) {
                AbstractC6427l.vip("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // defpackage.InterfaceC6553l
    public final C11102l amazon(byte[] bArr) {
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.f28481l;
        if (i < 27 && Objects.equals(uuid, AbstractC17252l.amazon)) {
            uuid = AbstractC17252l.crashlytics;
        }
        return new C11102l(uuid, bArr);
    }

    @Override // defpackage.InterfaceC6553l
    public final C1441l crashlytics() {
        MediaDrm.ProvisionRequest provisionRequest = this.f28480l.getProvisionRequest();
        return new C1441l(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // defpackage.InterfaceC6553l
    public final void firebase(byte[] bArr, byte[] bArr2) {
        this.f28480l.restoreKeys(bArr, bArr2);
    }

    @Override // defpackage.InterfaceC6553l
    public final void loadAd(final C7972l c7972l) {
        this.f28480l.setOnEventListener(new MediaDrm.OnEventListener(this) { // from class: lؘٕٕ
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                HandlerC8616l handlerC8616l = ((C17339l) c7972l.f16631l).f33699l;
                handlerC8616l.getClass();
                handlerC8616l.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    @Override // defpackage.InterfaceC6553l
    public final void metrica(byte[] bArr) throws DeniedByServerException {
        this.f28480l.provideProvisionResponse(bArr);
    }

    @Override // defpackage.InterfaceC6553l
    public final synchronized void release() {
        int i = this.f28479l - 1;
        this.f28479l = i;
        if (i == 0) {
            this.f28480l.release();
        }
    }

    @Override // defpackage.InterfaceC6553l
    public final void smaato(byte[] bArr) {
        this.f28480l.closeSession(bArr);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x021f  */
    /* JADX WARN: Code duplicated, block: B:124:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ab A[LOOP:2: B:27:0x008c->B:35:0x00ab, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x01ae  */
    @Override // defpackage.InterfaceC6553l
    public final C3584l startapp(byte[] bArr, List list, int i, HashMap map) throws NotProvisionedException {
        byte[] bArr2;
        String str;
        int i2;
        C12687l c12687l;
        C12687l c12687l2;
        C17219l c17219lBilling;
        int i3;
        byte[] bArrMopub;
        C17219l c17219lBilling2;
        UUID uuid = this.f28481l;
        C12687l c12687l3 = null;
        if (list != null) {
            boolean z = false;
            if (!AbstractC17252l.purchase.equals(uuid)) {
                c12687l = (C12687l) list.get(0);
            } else if (Build.VERSION.SDK_INT < 28 || list.size() <= 1) {
                i2 = 0;
                while (true) {
                    if (i2 < list.size()) {
                        c12687l = (C12687l) list.get(0);
                        break;
                    }
                    c12687l2 = (C12687l) list.get(i2);
                    byte[] bArr3 = c12687l2.f25010l;
                    bArr3.getClass();
                    c17219lBilling = AbstractC14231l.billing(bArr3);
                    if (c17219lBilling == null) {
                        i3 = -1;
                    } else {
                        i3 = c17219lBilling.f33424l;
                    }
                    if (i3 == 1) {
                        c12687l = c12687l2;
                        break;
                    }
                    i2++;
                }
            } else {
                C12687l c12687l4 = (C12687l) list.get(0);
                int i4 = 0;
                int length = 0;
                while (true) {
                    if (i4 < list.size()) {
                        C12687l c12687l5 = (C12687l) list.get(i4);
                        byte[] bArr4 = c12687l5.f25010l;
                        bArr4.getClass();
                        if (Objects.equals(c12687l5.f25011l, c12687l4.f25011l) && Objects.equals(c12687l5.f25007l, c12687l4.f25007l) && AbstractC14231l.billing(bArr4) != null) {
                            length += bArr4.length;
                            i4++;
                        } else {
                            i2 = 0;
                            while (true) {
                                if (i2 < list.size()) {
                                    c12687l = (C12687l) list.get(0);
                                    break;
                                }
                                c12687l2 = (C12687l) list.get(i2);
                                byte[] bArr5 = c12687l2.f25010l;
                                bArr5.getClass();
                                c17219lBilling = AbstractC14231l.billing(bArr5);
                                if (c17219lBilling == null) {
                                    i3 = -1;
                                } else {
                                    i3 = c17219lBilling.f33424l;
                                }
                                if (i3 == 1) {
                                    c12687l = c12687l2;
                                    break;
                                }
                                i2++;
                            }
                        }
                    } else {
                        byte[] bArr6 = new byte[length];
                        int i5 = 0;
                        for (int i6 = 0; i6 < list.size(); i6++) {
                            byte[] bArr7 = ((C12687l) list.get(i6)).f25010l;
                            bArr7.getClass();
                            int length2 = bArr7.length;
                            System.arraycopy(bArr7, 0, bArr6, i5, length2);
                            i5 += length2;
                        }
                        c12687l = new C12687l(c12687l4.f25008l, c12687l4.f25007l, c12687l4.f25011l, bArr6);
                    }
                }
            }
            byte[] bArrCrashlytics = c12687l.f25010l;
            bArrCrashlytics.getClass();
            UUID uuid2 = AbstractC17252l.billing;
            if (uuid2.equals(uuid)) {
                byte[] bArrMopub2 = AbstractC14231l.mopub(uuid, bArrCrashlytics);
                if (bArrMopub2 != null) {
                    bArrCrashlytics = bArrMopub2;
                }
                C13143l c13143l = new C13143l(bArrCrashlytics);
                int iMetrica = c13143l.metrica();
                short sAdcel = c13143l.adcel();
                short sAdcel2 = c13143l.adcel();
                if (sAdcel == 1 && sAdcel2 == 1) {
                    short sAdcel3 = c13143l.adcel();
                    Charset charset = StandardCharsets.UTF_16LE;
                    String strAdvert = c13143l.advert(sAdcel3, charset);
                    if (!strAdvert.contains("<LA_URL>")) {
                        int iIndexOf = strAdvert.indexOf("</DATA>");
                        if (iIndexOf == -1) {
                            AbstractC6427l.vip("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        String str2 = strAdvert.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strAdvert.substring(iIndexOf);
                        int i7 = iMetrica + 52;
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i7);
                        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                        byteBufferAllocate.putInt(i7);
                        byteBufferAllocate.putShort(sAdcel);
                        byteBufferAllocate.putShort(sAdcel2);
                        byteBufferAllocate.putShort((short) (str2.length() * 2));
                        byteBufferAllocate.put(str2.getBytes(charset));
                        bArrCrashlytics = byteBufferAllocate.array();
                    }
                } else {
                    AbstractC6427l.firebase("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArrCrashlytics = AbstractC14231l.crashlytics(uuid2, null, bArrCrashlytics);
            }
            int i8 = Build.VERSION.SDK_INT;
            if (i8 < 27 && Objects.equals(uuid, AbstractC17252l.amazon)) {
                z = true;
            }
            if (z && (c17219lBilling2 = AbstractC14231l.billing(bArrCrashlytics)) != null) {
                bArrCrashlytics = AbstractC14231l.crashlytics(AbstractC17252l.crashlytics, (UUID[]) c17219lBilling2.f33426l, (byte[]) c17219lBilling2.f33427l);
            }
            if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
                String str3 = Build.MODEL;
                if ((!"AFTB".equals(str3) && !"AFTS".equals(str3) && !"AFTM".equals(str3) && !"AFTT".equals(str3)) || (bArrMopub = AbstractC14231l.mopub(uuid, bArrCrashlytics)) == null) {
                    bArrMopub = bArrCrashlytics;
                }
            } else {
                bArrMopub = bArrCrashlytics;
            }
            String str4 = c12687l.f25011l;
            str = (i8 < 26 && AbstractC17252l.amazon.equals(uuid) && ("video/mp4".equals(str4) || "audio/mp4".equals(str4))) ? "cenc" : str4;
            bArr2 = bArrMopub;
            c12687l3 = c12687l;
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f28480l.getKeyRequest(bArr, bArr2, str, i, map);
        byte[] data = keyRequest.getData();
        if (AbstractC17252l.amazon.equals(uuid) && Build.VERSION.SDK_INT < 27) {
            String str5 = AbstractC15323l.yandex;
            Charset charset2 = StandardCharsets.UTF_8;
            data = new String(data, charset2).replace('+', '-').replace('/', '_').getBytes(charset2);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("<LA_URL>https://x</LA_URL>".equals(defaultUrl)) {
            defaultUrl = "";
        } else if (Build.VERSION.SDK_INT >= 33 && "https://default.url".equals(defaultUrl)) {
            String propertyString = this.f28480l.getPropertyString("version");
            if (Objects.equals(propertyString, "1.2") || Objects.equals(propertyString, "aidl-1")) {
                defaultUrl = "";
            }
        }
        if (TextUtils.isEmpty(defaultUrl) && c12687l3 != null) {
            String str6 = c12687l3.f25007l;
            if (!TextUtils.isEmpty(str6)) {
                defaultUrl = str6;
            }
        }
        keyRequest.getRequestType();
        return new C3584l(defaultUrl, data);
    }

    @Override // defpackage.InterfaceC6553l
    public final boolean subscription(String str, byte[] bArr) throws Throwable {
        boolean zEquals;
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.f28481l;
        if (i >= 31) {
            boolean zEquals2 = uuid.equals(AbstractC17252l.purchase);
            MediaDrm mediaDrm = this.f28480l;
            if (zEquals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                zEquals = (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
            } else {
                zEquals = uuid.equals(AbstractC17252l.amazon);
            }
            if (zEquals) {
                return AbstractC12148l.appmetrica(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto = null;
        try {
            try {
                MediaCrypto mediaCrypto2 = new MediaCrypto((i >= 27 || !Objects.equals(uuid, AbstractC17252l.amazon)) ? uuid : AbstractC17252l.crashlytics, bArr);
                try {
                    boolean zRequiresSecureDecoderComponent = mediaCrypto2.requiresSecureDecoderComponent(str);
                    mediaCrypto2.release();
                    return zRequiresSecureDecoderComponent;
                } catch (MediaCryptoException unused) {
                    mediaCrypto = mediaCrypto2;
                    boolean z = !uuid.equals(AbstractC17252l.amazon);
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    return z;
                } catch (Throwable th) {
                    th = th;
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    throw th;
                }
            } catch (MediaCryptoException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.InterfaceC6553l
    public final byte[] vip(byte[] bArr, byte[] bArr2) {
        if (AbstractC17252l.amazon.equals(this.f28481l) && Build.VERSION.SDK_INT < 27) {
            try {
                String str = AbstractC15323l.yandex;
                JSONObject jSONObject = new JSONObject(new String(bArr2, StandardCharsets.UTF_8));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(StandardCharsets.UTF_8);
            } catch (JSONException e) {
                String str2 = AbstractC15323l.yandex;
                AbstractC6427l.subs("ClearKeyUtil", "Failed to adjust response data: ".concat(new String(bArr2, StandardCharsets.UTF_8)), e);
            }
        }
        return this.f28480l.provideKeyResponse(bArr, bArr2);
    }

    @Override // defpackage.InterfaceC6553l
    public final Map yandex(byte[] bArr) {
        return this.f28480l.queryKeyStatus(bArr);
    }
}
