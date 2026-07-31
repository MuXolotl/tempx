package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.Log;
import android.util.Xml;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؘُٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5601l implements InterfaceC9751l, InterfaceC0587l, InterfaceC3770l, InterfaceC12145l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f11896l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f11897l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11898l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f11899l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final byte[] f11894l = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final byte[] f11895l = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final long[] f11893l = {128, 64, 32, 16, 8, 4, 2, 1};

    public C5601l(int i, int i2, int i3) {
        C15053l c15053l;
        this.f11898l = i3;
        switch (i3) {
            case 10:
                this.f11897l = i;
                this.f11896l = i2;
                float[] fArr = new float[3];
                Color.colorToHSV(0, fArr);
                float f = fArr[0];
                float f2 = fArr[1];
                float f3 = fArr[2];
                if (f2 >= 0.5f || f3 >= 0.7f) {
                    if (f >= 0.0f && f < 20.0f) {
                        c15053l = new C15053l(EnumC0551l.f1933l);
                    } else if (f >= 20.0f && f < 45.0f) {
                        c15053l = new C15053l(EnumC0551l.f1944l);
                    } else if (f >= 45.0f && f < 69.0f) {
                        c15053l = new C15053l(EnumC0551l.f1943l);
                    } else if (f >= 69.0f && f < 160.0f) {
                        c15053l = new C15053l(EnumC0551l.f1947l);
                    } else if (f >= 160.0f && f < 200.0f) {
                        c15053l = new C15053l(EnumC0551l.f1934l);
                    } else if (f >= 200.0f && f < 260.0f) {
                        c15053l = new C15053l(EnumC0551l.f1937l);
                    } else if (f >= 260.0f && f < 275.0f) {
                        c15053l = new C15053l(EnumC0551l.f1946l);
                    } else if (f < 275.0f || f >= 300.0f) {
                        c15053l = (f < 300.0f || f >= 340.0f) ? new C15053l(EnumC0551l.f1933l) : new C15053l(EnumC0551l.f1948l);
                    } else {
                        c15053l = new C15053l(EnumC0551l.f1941l);
                    }
                } else if (f >= 0.0f && f < 20.0f) {
                    c15053l = new C15053l(EnumC0551l.f1945l);
                } else if (f >= 20.0f && f < 50.0f) {
                    c15053l = new C15053l(EnumC0551l.f1932l);
                } else if (f >= 50.0f && f < 90.0f) {
                    c15053l = new C15053l(EnumC0551l.f1949l);
                } else if (f >= 90.0f && f < 160.0f) {
                    c15053l = new C15053l(EnumC0551l.f1942l);
                } else if (f >= 160.0f && f < 180.0f) {
                    c15053l = new C15053l(EnumC0551l.f1938l);
                } else if (f >= 180.0f && f < 260.0f) {
                    c15053l = new C15053l(EnumC0551l.f1940l);
                } else if (f >= 260.0f && f < 280.0f) {
                    c15053l = new C15053l(EnumC0551l.f1950l);
                } else if (f < 280.0f || f >= 300.0f) {
                    c15053l = (f < 300.0f || f >= 340.0f) ? new C15053l(EnumC0551l.f1936l) : new C15053l(EnumC0551l.f1939l);
                } else {
                    c15053l = new C15053l(EnumC0551l.f1941l);
                }
                this.f11899l = c15053l;
                break;
            default:
                this.f11899l = null;
                this.f11897l = i;
                int i4 = i2 & 7;
                this.f11896l = i4 == 0 ? 8 : i4;
                break;
        }
    }

    public static long purchase(int i, boolean z, byte[] bArr) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f11893l[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public static void subs(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(AbstractC1762l.loadAd(i2));
    }

    @Override // defpackage.InterfaceC3770l
    public void Signature(int i, Object obj) {
        ((InterfaceC3770l) this.f11899l).Signature(i + (this.f11896l == 0 ? this.f11897l : 0), obj);
    }

    @Override // defpackage.InterfaceC3770l
    public void adcel() {
        if (this.f11896l <= 0) {
            AbstractC2032l.yandex("OffsetApplier up called with no corresponding down");
        }
        this.f11896l--;
        ((InterfaceC3770l) this.f11899l).adcel();
    }

    @Override // defpackage.InterfaceC3770l
    public void admob(Object obj) {
        this.f11896l++;
        ((InterfaceC3770l) this.f11899l).admob(obj);
    }

    @Override // defpackage.InterfaceC3770l
    public void ads(Object obj, Function2 function2) {
        ((InterfaceC3770l) this.f11899l).ads(obj, function2);
    }

    @Override // defpackage.InterfaceC9751l
    public int amazon() {
        int i = this.f11897l;
        return i == -1 ? ((C13143l) this.f11899l).inmobi() : i;
    }

    @Override // defpackage.InterfaceC3770l
    public void billing(int i, Object obj) {
        ((InterfaceC3770l) this.f11899l).billing(i + (this.f11896l == 0 ? this.f11897l : 0), obj);
    }

    @Override // defpackage.InterfaceC9751l
    public int crashlytics() {
        return this.f11896l;
    }

    public synchronized int firebase() {
        PackageInfo packageInfoLoadAd;
        if (this.f11897l == 0) {
            try {
                packageInfoLoadAd = C16797l.yandex((Context) this.f11899l).loadAd(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfoLoadAd = null;
            }
            if (packageInfoLoadAd != null) {
                this.f11897l = packageInfoLoadAd.versionCode;
            }
        }
        return this.f11897l;
    }

    @Override // defpackage.InterfaceC12145l
    public int inmobi() {
        return this.f11897l;
    }

    @Override // defpackage.InterfaceC3770l
    public void isPro() {
        ((InterfaceC3770l) this.f11899l).isPro();
    }

    @Override // defpackage.InterfaceC9751l
    public int loadAd() {
        return this.f11897l;
    }

    public long mopub(InterfaceC10430l interfaceC10430l, boolean z, boolean z2, int i) {
        int i2;
        byte[] bArr = (byte[]) this.f11899l;
        if (this.f11897l == 0) {
            if (!interfaceC10430l.loadAd(bArr, 0, 1, z)) {
                return -1L;
            }
            int i3 = bArr[0] & 255;
            int i4 = 0;
            while (true) {
                if (i4 >= 8) {
                    i2 = -1;
                    break;
                }
                if ((f11893l[i4] & ((long) i3)) != 0) {
                    i2 = i4 + 1;
                    break;
                }
                i4++;
            }
            this.f11896l = i2;
            if (i2 == -1) {
                C8339l.smaato("No valid varint length mask found");
                return 0L;
            }
            this.f11897l = 1;
        }
        int i5 = this.f11896l;
        if (i5 > i) {
            this.f11897l = 0;
            return -2L;
        }
        if (i5 != 1) {
            interfaceC10430l.readFully(bArr, 1, i5 - 1);
        }
        this.f11897l = 0;
        return purchase(this.f11896l, z2, bArr);
    }

    @Override // defpackage.InterfaceC15930l
    /* JADX INFO: renamed from: package, reason: not valid java name */
    public AbstractC2249l mo1830package(AbstractC2249l abstractC2249l, AbstractC2249l abstractC2249l2, AbstractC2249l abstractC2249l3) {
        return ((C12014l) this.f11899l).subscription(mo1832volatile(abstractC2249l, abstractC2249l2, abstractC2249l3), abstractC2249l, abstractC2249l2, abstractC2249l3);
    }

    @Override // defpackage.InterfaceC0587l
    public InterfaceC14090l pro() {
        return new C8868l(this.f11897l, this.f11896l, (C0458l) this.f11899l);
    }

    @Override // defpackage.InterfaceC3770l
    public void remoteconfig(int i, int i2) {
        ((InterfaceC3770l) this.f11899l).remoteconfig(i + (this.f11896l == 0 ? this.f11897l : 0), i2);
    }

    @Override // defpackage.InterfaceC12145l
    public int signatures() {
        return this.f11896l;
    }

    @Override // defpackage.InterfaceC3770l
    public void smaato(int i, int i2, int i3) {
        int i4 = this.f11896l == 0 ? this.f11897l : 0;
        ((InterfaceC3770l) this.f11899l).smaato(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.InterfaceC15930l
    public AbstractC2249l subscription(long j, AbstractC2249l abstractC2249l, AbstractC2249l abstractC2249l2, AbstractC2249l abstractC2249l3) {
        return ((C12014l) this.f11899l).subscription(j, abstractC2249l, abstractC2249l2, abstractC2249l3);
    }

    @Override // defpackage.InterfaceC15930l
    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public AbstractC2249l mo1831throws(long j, AbstractC2249l abstractC2249l, AbstractC2249l abstractC2249l2, AbstractC2249l abstractC2249l3) {
        return ((C12014l) this.f11899l).mo1831throws(j, abstractC2249l, abstractC2249l2, abstractC2249l3);
    }

    public String toString() {
        switch (this.f11898l) {
            case 10:
                return "TintInfo{name: " + ((EnumC0551l) ((C15053l) this.f11899l).f29576l).name() + ", ColorA: 0x" + Integer.toHexString(this.f11897l) + ", ColorB: 0x" + Integer.toHexString(this.f11896l) + '}';
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[Catch: all -> 0x0030, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0027, B:14:0x0032, B:16:0x0039, B:18:0x004b, B:26:0x006c, B:21:0x0052, B:23:0x0065, B:29:0x0070, B:33:0x007f), top: B:38:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    public synchronized int vip() {
        List<ResolveInfo> listQueryBroadcastReceivers;
        int i = this.f11896l;
        if (i != 0) {
            return i;
        }
        Context context = (Context) this.f11899l;
        PackageManager packageManager = context.getPackageManager();
        if (((Context) C16797l.yandex(context).yandex).getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i2 = 1;
        if (AbstractC12300l.subs()) {
            Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
            intent.setPackage("com.google.android.gms");
            listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
            if (listQueryBroadcastReceivers != null) {
            }
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            if (true != AbstractC12300l.subs()) {
                i2 = 2;
            }
            this.f11896l = i2;
            return i2;
        }
        Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            Intent intent3 = new Intent("com.google.iid.TOKEN_REQUEST");
            intent3.setPackage("com.google.android.gms");
            listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent3, 0);
            if (listQueryBroadcastReceivers != null || listQueryBroadcastReceivers.isEmpty()) {
                Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
                if (true != AbstractC12300l.subs()) {
                    i2 = 2;
                }
                this.f11896l = i2;
                return i2;
            }
            i2 = 2;
        }
        this.f11896l = i2;
        return i2;
    }

    @Override // defpackage.InterfaceC15930l
    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public long mo1832volatile(AbstractC2249l abstractC2249l, AbstractC2249l abstractC2249l2, AbstractC2249l abstractC2249l3) {
        return ((long) (inmobi() + signatures())) * 1000000;
    }

    @Override // defpackage.InterfaceC15930l
    public /* synthetic */ boolean yandex() {
        return false;
    }

    @Override // defpackage.InterfaceC3770l
    public /* synthetic */ void license() {
    }

    public /* synthetic */ C5601l(Object obj, int i, int i2, int i3) {
        this.f11898l = i3;
        this.f11897l = i;
        this.f11896l = i2;
        this.f11899l = obj;
    }

    public C5601l(C15053l c15053l) {
        this.f11898l = 10;
        EnumC0551l enumC0551l = (EnumC0551l) c15053l.f29576l;
        this.f11897l = enumC0551l.f1952l;
        this.f11896l = enumC0551l.f1951l;
        this.f11899l = c15053l;
    }

    public C5601l(Context context, XmlResourceParser xmlResourceParser) {
        this.f11898l = 3;
        this.f11899l = new ArrayList();
        this.f11896l = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC4914l.admob);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f11897l = typedArrayObtainStyledAttributes.getResourceId(index, this.f11897l);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f11896l);
                this.f11896l = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C4759l().yandex(context, resourceId);
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public C5601l(InterfaceC3770l interfaceC3770l, int i) {
        this.f11898l = 7;
        this.f11899l = interfaceC3770l;
        this.f11897l = i;
    }

    public C5601l(int i) {
        this.f11898l = i;
        switch (i) {
            case 1:
                this.f11899l = new byte[8];
                break;
            case 4:
                this.f11899l = new C0458l(27);
                this.f11897l = 8000;
                this.f11896l = 8000;
                break;
            case 6:
                this.f11899l = new C5601l[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
                this.f11897l = 0;
                this.f11896l = 0;
                break;
        }
    }

    public C5601l(Context context) {
        this.f11898l = 12;
        this.f11896l = 0;
        this.f11899l = context;
    }

    public C5601l(int i, int i2, InterfaceC8097l interfaceC8097l) {
        this.f11898l = 11;
        this.f11897l = i;
        this.f11896l = i2;
        this.f11899l = new C12014l(new C15511l(i, i2, interfaceC8097l));
    }

    public C5601l(C16792l c16792l, C5978l c5978l) {
        this.f11898l = 2;
        C13143l c13143l = c16792l.f32816l;
        this.f11899l = c13143l;
        c13143l.m3562for(12);
        int iInmobi = c13143l.inmobi();
        if ("audio/raw".equals(c5978l.metrica)) {
            int iLicense = AbstractC15323l.license(c5978l.f12621strictfp) * c5978l.f12619package;
            if (iInmobi % iLicense != 0) {
                AbstractC6427l.vip("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iLicense + ", stsz sample size: " + iInmobi);
                iInmobi = iLicense;
            }
        }
        this.f11897l = iInmobi == 0 ? -1 : iInmobi;
        this.f11896l = c13143l.inmobi();
    }
}
