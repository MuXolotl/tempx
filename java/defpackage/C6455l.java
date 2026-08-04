package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lؙٔؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6455l implements InterfaceC14185l {
    public final InterfaceC18528l amazon;
    public final HashMap crashlytics;
    public final HashMap loadAd;
    public final C13128l purchase = new C13128l(this, 2);
    public OutputStream yandex;
    public static final Charset billing = Charset.forName("UTF-8");
    public static final C3537l mopub = new C3537l("key", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(1))));
    public static final C3537l admob = new C3537l("value", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(2))));
    public static final C4267l subs = new C4267l(2);

    public C6455l(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, InterfaceC18528l interfaceC18528l) {
        this.yandex = byteArrayOutputStream;
        this.loadAd = map;
        this.crashlytics = map2;
        this.amazon = interfaceC18528l;
    }

    public static int isPro(C3537l c3537l) {
        InterfaceC16073l interfaceC16073l = (InterfaceC16073l) c3537l.loadAd(InterfaceC16073l.class);
        if (interfaceC16073l != null) {
            return interfaceC16073l.zza();
        }
        throw new C4726l("Field has no @Protobuf config");
    }

    public final void admob(C3537l c3537l, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        InterfaceC16073l interfaceC16073l = (InterfaceC16073l) c3537l.loadAd(InterfaceC16073l.class);
        if (interfaceC16073l == null) {
            throw new C4726l("Field has no @Protobuf config");
        }
        int iOrdinal = interfaceC16073l.zzb().ordinal();
        if (iOrdinal == 0) {
            smaato(interfaceC16073l.zza() << 3);
            smaato(i);
        } else if (iOrdinal == 1) {
            smaato(interfaceC16073l.zza() << 3);
            smaato((i + i) ^ (i >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            smaato((interfaceC16073l.zza() << 3) | 5);
            this.yandex.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
        }
    }

    @Override // defpackage.InterfaceC14185l
    public final /* synthetic */ InterfaceC14185l amazon(C3537l c3537l, boolean z) {
        admob(c3537l, z ? 1 : 0, true);
        return this;
    }

    @Override // defpackage.InterfaceC14185l
    public final InterfaceC14185l billing(C3537l c3537l, double d) throws IOException {
        loadAd(c3537l, d, true);
        return this;
    }

    public final void crashlytics(C3537l c3537l, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            smaato((isPro(c3537l) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(billing);
            smaato(bytes.length);
            this.yandex.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                crashlytics(c3537l, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                firebase(subs, c3537l, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            loadAd(c3537l, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            smaato((isPro(c3537l) << 3) | 5);
            this.yandex.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            subs(c3537l, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            admob(c3537l, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            smaato((isPro(c3537l) << 3) | 2);
            smaato(bArr.length);
            this.yandex.write(bArr);
            return;
        }
        InterfaceC18528l interfaceC18528l = (InterfaceC18528l) this.loadAd.get(obj.getClass());
        if (interfaceC18528l != null) {
            firebase(interfaceC18528l, c3537l, obj, z);
            return;
        }
        InterfaceC3484l interfaceC3484l = (InterfaceC3484l) this.crashlytics.get(obj.getClass());
        if (interfaceC3484l != null) {
            C13128l c13128l = this.purchase;
            c13128l.loadAd = false;
            c13128l.amazon = c3537l;
            c13128l.crashlytics = z;
            interfaceC3484l.yandex(obj, c13128l);
            return;
        }
        if (obj instanceof InterfaceC10660l) {
            admob(c3537l, ((InterfaceC10660l) obj).zza(), true);
        } else if (obj instanceof Enum) {
            admob(c3537l, ((Enum) obj).ordinal(), true);
        } else {
            firebase(this.amazon, c3537l, obj, z);
        }
    }

    public final void firebase(InterfaceC18528l interfaceC18528l, C3537l c3537l, Object obj, boolean z) throws IOException {
        C18500l c18500l = new C18500l(2);
        c18500l.f36126l = 0L;
        try {
            OutputStream outputStream = this.yandex;
            this.yandex = c18500l;
            try {
                interfaceC18528l.yandex(obj, this);
                this.yandex = outputStream;
                long j = c18500l.f36126l;
                c18500l.close();
                if (z && j == 0) {
                    return;
                }
                smaato((isPro(c3537l) << 3) | 2);
                remoteconfig(j);
                interfaceC18528l.yandex(obj, this);
            } catch (Throwable th) {
                this.yandex = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c18500l.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void loadAd(C3537l c3537l, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return;
        }
        smaato((isPro(c3537l) << 3) | 1);
        this.yandex.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    @Override // defpackage.InterfaceC14185l
    public final /* synthetic */ InterfaceC14185l mopub(C3537l c3537l, long j) throws IOException {
        subs(c3537l, j, true);
        return this;
    }

    @Override // defpackage.InterfaceC14185l
    public final /* synthetic */ InterfaceC14185l purchase(C3537l c3537l, int i) {
        admob(c3537l, i, true);
        return this;
    }

    public final void remoteconfig(long j) throws IOException {
        while (true) {
            long j2 = (-128) & j;
            int i = ((int) j) & 127;
            OutputStream outputStream = this.yandex;
            if (j2 == 0) {
                outputStream.write(i);
                return;
            } else {
                outputStream.write(i | 128);
                j >>>= 7;
            }
        }
    }

    public final void smaato(int i) throws IOException {
        while (true) {
            long j = i & (-128);
            int i2 = i & 127;
            OutputStream outputStream = this.yandex;
            if (j == 0) {
                outputStream.write(i2);
                return;
            } else {
                outputStream.write(i2 | 128);
                i >>>= 7;
            }
        }
    }

    public final void subs(C3537l c3537l, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        InterfaceC16073l interfaceC16073l = (InterfaceC16073l) c3537l.loadAd(InterfaceC16073l.class);
        if (interfaceC16073l == null) {
            throw new C4726l("Field has no @Protobuf config");
        }
        int iOrdinal = interfaceC16073l.zzb().ordinal();
        if (iOrdinal == 0) {
            smaato(interfaceC16073l.zza() << 3);
            remoteconfig(j);
        } else if (iOrdinal == 1) {
            smaato(interfaceC16073l.zza() << 3);
            remoteconfig((j >> 63) ^ (j + j));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            smaato((interfaceC16073l.zza() << 3) | 1);
            this.yandex.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    @Override // defpackage.InterfaceC14185l
    public final InterfaceC14185l yandex(C3537l c3537l, Object obj) {
        crashlytics(c3537l, obj, true);
        return this;
    }
}
