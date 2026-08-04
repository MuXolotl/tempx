package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.appbar.AppBarLayout;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* JADX INFO: renamed from: lُٕؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4816l implements InterfaceC10466l, InterfaceC0589l, InterfaceC10162l, InterfaceC11545l, InterfaceC11139l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f9859l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f9860l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9861l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f9862l;

    public C4816l(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr) {
        this.f9861l = 3;
        byte[] bArr2 = new byte[i];
        this.f9860l = bArr2;
        boolean z = false;
        System.arraycopy(bArr, 0, bArr2, 0, i);
        this.f9859l = new C18396l[i2];
        int i7 = i;
        for (int i8 = 0; i8 != i2; i8++) {
            byte[] bArr3 = new byte[i];
            System.arraycopy(bArr, i7, bArr3, 0, i);
            i7 += i;
            byte[][] bArr4 = new byte[i3][];
            for (int i9 = 0; i9 != i3; i9++) {
                byte[] bArr5 = new byte[i];
                bArr4[i9] = bArr5;
                System.arraycopy(bArr, i7, bArr5, 0, i);
                i7 += i;
            }
            ((C18396l[]) this.f9859l)[i8] = new C18396l(bArr3, bArr4, z, 17);
        }
        this.f9862l = new C13568l[i4];
        for (int i10 = 0; i10 != i4; i10++) {
            int i11 = i6 * i;
            byte[] bArr6 = new byte[i11];
            System.arraycopy(bArr, i7, bArr6, 0, i11);
            i7 += i11;
            byte[][] bArr7 = new byte[i5][];
            for (int i12 = 0; i12 != i5; i12++) {
                byte[] bArr8 = new byte[i];
                bArr7[i12] = bArr8;
                System.arraycopy(bArr, i7, bArr8, 0, i);
                i7 += i;
            }
            ((C13568l[]) this.f9862l)[i10] = new C13568l(bArr6, bArr7, 14);
        }
        if (i7 == bArr.length) {
            return;
        }
        C8339l.metrica("signature wrong length");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AbstractC12707l crashlytics(InterfaceC0308l interfaceC0308l, String str) {
        AbstractC12707l abstractC12707lCrashlytics;
        AbstractC12707l abstractC12707l = (AbstractC12707l) interfaceC0308l;
        if (str.equals(abstractC12707l.crashlytics)) {
            return abstractC12707l;
        }
        for (Object obj : interfaceC0308l.getChildren()) {
            if (obj instanceof AbstractC12707l) {
                AbstractC12707l abstractC12707l2 = (AbstractC12707l) obj;
                if (str.equals(abstractC12707l2.crashlytics)) {
                    return abstractC12707l2;
                }
                if ((obj instanceof InterfaceC0308l) && (abstractC12707lCrashlytics = crashlytics((InterfaceC0308l) obj, str)) != null) {
                    return abstractC12707lCrashlytics;
                }
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC11545l
    public void accept(Object obj, Object obj2) {
        switch (this.f9861l) {
            case 14:
                C2350l c2350l = (C2350l) obj2;
                C16014l c16014l = (C16014l) this.f9860l;
                String str = (String) this.f9859l;
                C17186l c17186l = (C17186l) this.f9862l;
                C4184l c4184l = (C4184l) obj;
                AbstractC1051l.firebase("Not active connection", c16014l.f31393throws != 1);
                Context context = c4184l.crashlytics;
                C3448l c3448lRemoteconfig = AbstractC11990l.remoteconfig();
                C10567l c10567l = (C10567l) c4184l.metrica();
                Parcel parcelM743l = c10567l.m743l();
                parcelM743l.writeString(str);
                AbstractC14627l.loadAd(parcelM743l, c3448lRemoteconfig);
                c10567l.m747l(parcelM743l, 12);
                if (c17186l != null) {
                    C10567l c10567l2 = (C10567l) c4184l.metrica();
                    Parcel parcelM743l2 = c10567l2.m743l();
                    parcelM743l2.writeString(str);
                    AbstractC14627l.loadAd(parcelM743l2, c3448lRemoteconfig);
                    c10567l2.m747l(parcelM743l2, 11);
                }
                c2350l.loadAd(null);
                break;
            default:
                C11963l c11963l = (C11963l) obj;
                C13132l c13132l = new C13132l((C2350l) obj2);
                String str2 = (String) this.f9860l;
                String str3 = (String) this.f9859l;
                C18096l c18096l = (C18096l) this.f9862l;
                c11963l.getClass();
                BinderC11501l binderC11501l = new BinderC11501l(c18096l);
                c11963l.f23838synchronized.add(binderC11501l);
                C13452l c13452l = (C13452l) c11963l.metrica();
                C7441l c7441l = new C7441l();
                c7441l.f15405l = new BinderC13190l(c13132l);
                c7441l.f15408l = str2;
                c7441l.f15407l = str3;
                c7441l.f15402l = binderC11501l;
                Parcel parcelM743l3 = c13452l.m743l();
                int i = AbstractC14866l.yandex;
                parcelM743l3.writeInt(1);
                c7441l.writeToParcel(parcelM743l3, 0);
                c13452l.m742l(parcelM743l3, 2005);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        if (r5 == r8) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        if (r5 == r8) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.io.Serializable admob(defpackage.C2258l r6, defpackage.InterfaceC17817l r7, defpackage.AbstractC0283l r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.C0636l
            if (r0 == 0) goto L13
            r0 = r8
            lؑ۠ۜ r0 = (defpackage.C0636l) r0
            int r1 = r0.f2101l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2101l = r1
            goto L18
        L13:
            lؑ۠ۜ r0 = new lؑ۠ۜ
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r5 = r0.f2100l
            int r8 = r0.f2101l
            lّؔۜ r1 = defpackage.C2580l.f5619l
            r2 = 2
            r3 = 1
            r4 = 0
            if (r8 == 0) goto L3f
            if (r8 == r3) goto L3b
            if (r8 == r2) goto L37
            r6 = 3
            if (r8 != r6) goto L31
            defpackage.AbstractC2829l.crashlytics(r5)
            r1 = r5
            java.util.List r1 = (java.util.List) r1
            goto L7b
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r5)
            return r4
        L37:
            defpackage.AbstractC2829l.crashlytics(r5)
            goto L78
        L3b:
            defpackage.AbstractC2829l.crashlytics(r5)
            goto L61
        L3f:
            defpackage.AbstractC2829l.crashlytics(r5)
            boolean r5 = r7 instanceof defpackage.InterfaceC2244l
            lٍؗؐ r8 = defpackage.EnumC9342l.f19165l
            if (r5 == 0) goto L69
            java.util.List r5 = r6.amazon()
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L53
            goto L54
        L53:
            r5 = r4
        L54:
            if (r5 == 0) goto L64
            lؓۦؑ r7 = (defpackage.InterfaceC2244l) r7
            r0.f2101l = r3
            java.lang.Object r5 = r7.loadAd(r5, r0)
            if (r5 != r8) goto L61
            goto L77
        L61:
            r4 = r5
            java.util.List r4 = (java.util.List) r4
        L64:
            if (r4 != 0) goto L67
            goto L7b
        L67:
            r1 = r4
            goto L7b
        L69:
            boolean r5 = r7 instanceof defpackage.InterfaceC2841l
            if (r5 == 0) goto L7b
            lٌؔۗ r7 = (defpackage.InterfaceC2841l) r7
            r0.f2101l = r2
            java.lang.Object r5 = r7.purchase(r0)
            if (r5 != r8) goto L78
        L77:
            return r8
        L78:
            r1 = r5
            java.util.List r1 = (java.util.List) r1
        L7b:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r1.iterator()
        L89:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Laa
            java.lang.Object r8 = r7.next()
            r0 = r8
            lۡۨ r0 = (defpackage.AbstractC18643l) r0
            boolean r1 = r0 instanceof defpackage.InterfaceC6019l
            if (r1 == 0) goto La6
            lؘۡؐ r0 = (defpackage.InterfaceC6019l) r0
            boolean r0 = r0.yandex()
            if (r0 == 0) goto La6
            r5.add(r8)
            goto L89
        La6:
            r6.add(r8)
            goto L89
        Laa:
            lًۖٔ r7 = new lًۖٔ
            r7.<init>(r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4816l.admob(lؓۦۤ, lٍ٘ۢ, lّؑۧ):java.io.Serializable");
    }

    public boolean amazon() {
        C7504l c7504l = (C7504l) this.f9859l;
        return c7504l != null && c7504l.mopub();
    }

    public boolean billing() {
        if (((InterfaceC12244l) this.f9860l).getValue() != this.f9862l) {
            return true;
        }
        C4816l c4816l = (C4816l) this.f9859l;
        return c4816l != null && c4816l.billing();
    }

    public void firebase(Object obj) {
        long jLoadAd = AbstractC4071l.loadAd();
        if (jLoadAd == AbstractC17382l.yandex) {
            this.f9862l = obj;
            return;
        }
        synchronized (this.f9859l) {
            C13044l c13044l = (C13044l) ((AtomicReference) this.f9860l).get();
            int iYandex = c13044l.yandex(jLoadAd);
            if (iYandex >= 0) {
                c13044l.crashlytics[iYandex] = obj;
            } else {
                ((AtomicReference) this.f9860l).set(c13044l.loadAd(jLoadAd, obj));
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // defpackage.InterfaceC15897l
    public Object get() {
        switch (this.f9861l) {
            case 5:
                return new C2072l((InterfaceC12932l) ((InterfaceC15897l) this.f9860l).get(), (C3982l) ((InterfaceC15897l) this.f9859l).get(), (InterfaceC15829l) ((InterfaceC2661l) this.f9862l).get());
            default:
                long jLoadAd = AbstractC4071l.loadAd();
                if (jLoadAd == AbstractC17382l.yandex) {
                    return this.f9862l;
                }
                C13044l c13044l = (C13044l) ((AtomicReference) this.f9860l).get();
                int iYandex = c13044l.yandex(jLoadAd);
                if (iYandex >= 0) {
                    return c13044l.crashlytics[iYandex];
                }
                return null;
        }
    }

    @Override // defpackage.InterfaceC0589l
    public View getRoot() {
        return (AppBarLayout) this.f9860l;
    }

    public AbstractC12707l isPro(String str) {
        if (str != null) {
            if (str.startsWith("\"") && str.endsWith("\"")) {
                str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
            } else if (str.startsWith("'") && str.endsWith("'")) {
                str = str.substring(1, str.length() - 1).replace("\\'", "'");
            }
            String strReplace = str.replace("\\\n", "").replace("\\A", "\n");
            if (strReplace.length() > 1 && strReplace.startsWith("#")) {
                String strSubstring = strReplace.substring(1);
                HashMap map = (HashMap) this.f9862l;
                if (strSubstring.length() == 0) {
                    return null;
                }
                if (strSubstring.equals(((C15965l) this.f9860l).crashlytics)) {
                    return (C15965l) this.f9860l;
                }
                if (map.containsKey(strSubstring)) {
                    return (AbstractC12707l) map.get(strSubstring);
                }
                AbstractC12707l abstractC12707lCrashlytics = crashlytics((C15965l) this.f9860l, strSubstring);
                map.put(strSubstring, abstractC12707lCrashlytics);
                return abstractC12707lCrashlytics;
            }
        }
        return null;
    }

    public C10006l loadAd() {
        int i;
        float fCrashlytics;
        int i2;
        C15965l c15965l = (C15965l) this.f9860l;
        C12671l c12671l = c15965l.ads;
        C12671l c12671l2 = c15965l.subscription;
        if (c12671l == null || c12671l.admob() || (i = c12671l.f24958l) == 9 || i == 2 || i == 3) {
            return new C10006l(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fCrashlytics2 = c12671l.crashlytics();
        if (c12671l2 == null) {
            C10006l c10006l = ((C15965l) this.f9860l).metrica;
            fCrashlytics = c10006l != null ? (c10006l.purchase * fCrashlytics2) / c10006l.amazon : fCrashlytics2;
        } else {
            if (c12671l2.admob() || (i2 = c12671l2.f24958l) == 9 || i2 == 2 || i2 == 3) {
                return new C10006l(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fCrashlytics = c12671l2.crashlytics();
        }
        return new C10006l(0.0f, 0.0f, fCrashlytics2, fCrashlytics);
    }

    @Override // defpackage.InterfaceC10162l
    public void metrica(C3823l c3823l) {
        C14302l c14302l = (C14302l) this.f9860l;
        String str = (String) this.f9859l;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f9862l;
        synchronized (c14302l.yandex) {
            c14302l.yandex.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public void mopub(LongPointerWrapper longPointerWrapper) {
        InterfaceC3999l interfaceC3999l = (InterfaceC3999l) this.f9860l;
        ((AbstractC6107l) this.f9862l).purchase(interfaceC3999l.isValid() ? interfaceC3999l.mo877l(((C11571l) this.f9859l).billing().m1958l()) : null, longPointerWrapper);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x001b, B:19:0x0065, B:22:0x0089, B:13:0x002c, B:15:0x0052, B:17:0x005d, B:18:0x0061), top: B:27:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0052 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x001b, B:19:0x0065, B:22:0x0089, B:13:0x002c, B:15:0x0052, B:17:0x005d, B:18:0x0061), top: B:27:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:17:0x005d A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x001b, B:19:0x0065, B:22:0x0089, B:13:0x002c, B:15:0x0052, B:17:0x005d, B:18:0x0061), top: B:27:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0061 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x001b, B:19:0x0065, B:22:0x0089, B:13:0x002c, B:15:0x0052, B:17:0x005d, B:18:0x0061), top: B:27:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0065 A[Catch: all -> 0x001e, PHI: r6
  0x0065: PHI (r6v7 int) = (r6v1 int), (r6v0 int) binds: [B:12:0x002a, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x001e, blocks: (B:4:0x001b, B:19:0x0065, B:22:0x0089, B:13:0x002c, B:15:0x0052, B:17:0x005d, B:18:0x0061), top: B:27:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0088  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.InterfaceC11139l
    public void purchase(String str, int i, Throwable th, byte[] bArr, Map map) {
        C11079l c11079l;
        C8648l c8648l;
        String strSubstring;
        Object obj;
        long j = ((C18253l) this.f9859l).yandex;
        C6901l c6901l = (C6901l) this.f9862l;
        String str2 = (String) this.f9860l;
        c6901l.mo224l().mo211l();
        c6901l.m2112transient();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                c6901l.f14453l = false;
                c6901l.m2100native();
            }
        }
        if (i == 200) {
            if (th == null) {
                C8648l c8648l2 = c6901l.f14451l;
                C6901l.m2082case(c8648l2);
                c8648l2.m2368l(Long.valueOf(j));
                c6901l.mo200else().f16911l.crashlytics(str2, Integer.valueOf(i), "Successfully uploaded batch from upload queue. appId, status");
                c11079l = c6901l.f14459l;
                C6901l.m2082case(c11079l);
                if (c11079l.m3038l()) {
                    c8648l = c6901l.f14451l;
                    C6901l.m2082case(c8648l);
                    if (c8648l.m2357l(str2)) {
                        c6901l.metrica(str2);
                    } else {
                        c6901l.m2114volatile();
                    }
                } else {
                    c6901l.m2114volatile();
                }
            } else {
                String str3 = new String(bArr, StandardCharsets.UTF_8);
                strSubstring = str3.substring(0, Math.min(32, str3.length()));
                C14906l c14906l = c6901l.mo200else().f16914l;
                Integer numValueOf = Integer.valueOf(i);
                obj = th;
                if (th == null) {
                    obj = strSubstring;
                }
                c14906l.amazon("Network upload failed. Will retry later. appId, status, error", str2, numValueOf, obj);
                C8648l c8648l3 = c6901l.f14451l;
                C6901l.m2082case(c8648l3);
                c8648l3.m2363l(Long.valueOf(j));
                c6901l.m2114volatile();
            }
        } else if (i == 204) {
            i = 204;
            if (th == null) {
                C8648l c8648l4 = c6901l.f14451l;
                C6901l.m2082case(c8648l4);
                c8648l4.m2368l(Long.valueOf(j));
                c6901l.mo200else().f16911l.crashlytics(str2, Integer.valueOf(i), "Successfully uploaded batch from upload queue. appId, status");
                c11079l = c6901l.f14459l;
                C6901l.m2082case(c11079l);
                if (c11079l.m3038l()) {
                    c8648l = c6901l.f14451l;
                    C6901l.m2082case(c8648l);
                    if (c8648l.m2357l(str2)) {
                        c6901l.metrica(str2);
                    } else {
                        c6901l.m2114volatile();
                    }
                } else {
                    c6901l.m2114volatile();
                }
            } else {
                String str4 = new String(bArr, StandardCharsets.UTF_8);
                strSubstring = str4.substring(0, Math.min(32, str4.length()));
                C14906l c14906l2 = c6901l.mo200else().f16914l;
                Integer numValueOf2 = Integer.valueOf(i);
                obj = th;
                if (th == null) {
                    obj = strSubstring;
                }
                c14906l2.amazon("Network upload failed. Will retry later. appId, status, error", str2, numValueOf2, obj);
                C8648l c8648l5 = c6901l.f14451l;
                C6901l.m2082case(c8648l5);
                c8648l5.m2363l(Long.valueOf(j));
                c6901l.m2114volatile();
            }
        } else {
            String str5 = new String(bArr, StandardCharsets.UTF_8);
            strSubstring = str5.substring(0, Math.min(32, str5.length()));
            C14906l c14906l3 = c6901l.mo200else().f16914l;
            Integer numValueOf3 = Integer.valueOf(i);
            obj = th;
            if (th == null) {
                obj = strSubstring;
            }
            c14906l3.amazon("Network upload failed. Will retry later. appId, status, error", str2, numValueOf3, obj);
            C8648l c8648l6 = c6901l.f14451l;
            C6901l.m2082case(c8648l6);
            c8648l6.m2363l(Long.valueOf(j));
            c6901l.m2114volatile();
        }
    }

    public File smaato() {
        String str = (String) ((InterfaceC11766l) this.f9859l).get();
        String str2 = (String) ((InterfaceC11766l) this.f9862l).get();
        return new File(AbstractC9361l.advert(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length() + 3), str, "/", str2, ".pb"));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r6.mo2158switch(r0) == r5) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object subs(defpackage.C16076l r7, defpackage.AbstractC0283l r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.C10662l
            if (r0 == 0) goto L13
            r0 = r8
            lَۢۦ r0 = (defpackage.C10662l) r0
            int r1 = r0.f21630l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21630l = r1
            goto L18
        L13:
            lَۢۦ r0 = new lَۢۦ
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f21629l
            int r1 = r0.f21630l
            r2 = 0
            r3 = 2
            r4 = 1
            lٍؗؐ r5 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.AbstractC2829l.crashlytics(r8)
            goto L5c
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r6)
            return r2
        L31:
            defpackage.AbstractC2829l.crashlytics(r8)
            goto L4d
        L35:
            defpackage.AbstractC2829l.crashlytics(r8)
            r0.f21630l = r4
            lؓ٘ۜ r8 = new lؓ٘ۜ
            r1 = 9
            r8.<init>(r6, r7, r2, r1)
            java.lang.Object r7 = defpackage.AbstractC11990l.admob(r8, r0)
            if (r7 != r5) goto L48
            goto L4a
        L48:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
        L4a:
            if (r7 != r5) goto L4d
            goto L5b
        L4d:
            java.lang.Object r6 = r6.f9859l
            lؚٜۚ r6 = (defpackage.C7504l) r6
            if (r6 == 0) goto L5f
            r0.f21630l = r3
            java.lang.Object r6 = r6.mo2158switch(r0)
            if (r6 != r5) goto L5c
        L5b:
            return r5
        L5c:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L5f:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4816l.subs(lٕۦ۠, lّؑۧ):java.lang.Object");
    }

    public void yandex(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.f9860l;
        C2694l c2694l = new C2694l(byteArrayOutputStream, map, (HashMap) this.f9859l, (InterfaceC18528l) this.f9862l);
        if (obj == null) {
            return;
        }
        InterfaceC18528l interfaceC18528l = (InterfaceC18528l) map.get(obj.getClass());
        if (interfaceC18528l != null) {
            interfaceC18528l.yandex(obj, c2694l);
            return;
        }
        throw new C4726l("No encoder for " + obj.getClass());
    }

    public /* synthetic */ C4816l(int i, boolean z) {
        this.f9861l = i;
    }

    public /* synthetic */ C4816l(Object obj, Object obj2, Object obj3, int i) {
        this.f9861l = i;
        this.f9860l = obj;
        this.f9859l = obj2;
        this.f9862l = obj3;
    }

    public /* synthetic */ C4816l(C1062l c1062l, String str, String str2, C18096l c18096l) {
        this.f9861l = 15;
        this.f9860l = str;
        this.f9859l = str2;
        this.f9862l = c18096l;
    }

    public C4816l(C17186l c17186l) {
        this.f9861l = 13;
        this.f9862l = c17186l;
        this.f9859l = new AtomicLong((AbstractC15091l.loadAd.nextLong() & 65535) * 10000);
    }

    public C4816l(final AbstractC15619l abstractC15619l, final String str) {
        this.f9861l = 17;
        this.f9860l = C1597l.amazon;
        final int i = 1;
        this.f9859l = AbstractC15788l.purchase(new InterfaceC11766l(this) { // from class: lٌۧٓ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C4816l f18951l;

            {
                this.f18951l = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // defpackage.InterfaceC11766l
            public final Object get() {
                long j;
                long j2;
                long j3;
                long j4;
                long j5;
                long j6;
                long j7;
                int i2 = i;
                Serializable serializable = abstractC15619l;
                C4816l c4816l = this.f18951l;
                switch (i2) {
                    case 0:
                        int i3 = AbstractC8075l.yandex;
                        int i4 = C17275l.f33510l;
                        C15518l c15518lCrashlytics = new C15518l().crashlytics(((String) serializable).getBytes());
                        ByteBuffer byteBuffer = c15518lCrashlytics.yandex;
                        byteBuffer.put((byte) 0);
                        char c = '\b';
                        if (byteBuffer.remaining() < 8) {
                            c15518lCrashlytics.yandex();
                        }
                        C15518l c15518lCrashlytics2 = c15518lCrashlytics.crashlytics("".getBytes());
                        c15518lCrashlytics2.yandex();
                        ByteBuffer byteBuffer2 = c15518lCrashlytics2.yandex;
                        byteBuffer2.flip();
                        if (byteBuffer2.remaining() > 0) {
                            c15518lCrashlytics2.billing = byteBuffer2.remaining() + c15518lCrashlytics2.billing;
                            long j8 = 0;
                            switch (byteBuffer2.remaining()) {
                                case 1:
                                    j = 0;
                                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                    c15518lCrashlytics2.amazon = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c15518lCrashlytics2.amazon;
                                    c15518lCrashlytics2.purchase ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 2:
                                    c = '\b';
                                    j2 = 0;
                                    j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                    c15518lCrashlytics2.amazon = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c15518lCrashlytics2.amazon;
                                    c15518lCrashlytics2.purchase ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 3:
                                    c = '\b';
                                    j3 = 0;
                                    j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                    j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                    c15518lCrashlytics2.amazon = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c15518lCrashlytics2.amazon;
                                    c15518lCrashlytics2.purchase ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 4:
                                    c = '\b';
                                    j4 = 0;
                                    j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                                    j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                    j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                    c15518lCrashlytics2.amazon = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c15518lCrashlytics2.amazon;
                                    c15518lCrashlytics2.purchase ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 5:
                                    j5 = 0;
                                    j4 = j5 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                                    j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                                    j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                    j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                    c15518lCrashlytics2.amazon = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c15518lCrashlytics2.amazon;
                                    c15518lCrashlytics2.purchase ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 6:
                                    j6 = 0;
                                    j5 = (((long) (byteBuffer2.get(5) & 255)) << 40) ^ j6;
                                    j4 = j5 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                                    j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                                    j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                    j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                    c15518lCrashlytics2.amazon = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c15518lCrashlytics2.amazon;
                                    c15518lCrashlytics2.purchase ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 7:
                                    j6 = ((long) (byteBuffer2.get(6) & 255)) << 48;
                                    j5 = (((long) (byteBuffer2.get(5) & 255)) << 40) ^ j6;
                                    j4 = j5 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                                    j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                                    j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                    j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                    c15518lCrashlytics2.amazon = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c15518lCrashlytics2.amazon;
                                    c15518lCrashlytics2.purchase ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 8:
                                    j7 = byteBuffer2.getLong();
                                    c15518lCrashlytics2.amazon = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c15518lCrashlytics2.amazon;
                                    c15518lCrashlytics2.purchase ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 9:
                                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                                    j7 = byteBuffer2.getLong();
                                    c15518lCrashlytics2.amazon = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c15518lCrashlytics2.amazon;
                                    c15518lCrashlytics2.purchase ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 10:
                                    j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                                    j7 = byteBuffer2.getLong();
                                    c15518lCrashlytics2.amazon = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c15518lCrashlytics2.amazon;
                                    c15518lCrashlytics2.purchase ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 11:
                                    j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                    j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                                    j7 = byteBuffer2.getLong();
                                    c15518lCrashlytics2.amazon = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c15518lCrashlytics2.amazon;
                                    c15518lCrashlytics2.purchase ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 12:
                                    j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                    j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                    j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                                    j7 = byteBuffer2.getLong();
                                    c15518lCrashlytics2.amazon = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c15518lCrashlytics2.amazon;
                                    c15518lCrashlytics2.purchase ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 13:
                                    j8 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                                    j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                    j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                    j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                                    j7 = byteBuffer2.getLong();
                                    c15518lCrashlytics2.amazon = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c15518lCrashlytics2.amazon;
                                    c15518lCrashlytics2.purchase ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 14:
                                    j8 ^= ((long) (byteBuffer2.get(13) & 255)) << 40;
                                    j8 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                                    j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                    j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                    j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                                    j7 = byteBuffer2.getLong();
                                    c15518lCrashlytics2.amazon = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c15518lCrashlytics2.amazon;
                                    c15518lCrashlytics2.purchase ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 15:
                                    j8 = ((long) (byteBuffer2.get(14) & 255)) << 48;
                                    j8 ^= ((long) (byteBuffer2.get(13) & 255)) << 40;
                                    j8 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                                    j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                    j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                    j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                                    j7 = byteBuffer2.getLong();
                                    c15518lCrashlytics2.amazon = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c15518lCrashlytics2.amazon;
                                    c15518lCrashlytics2.purchase ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                default:
                                    C8339l.subs("Should never get here.");
                                    return null;
                            }
                        }
                        long j9 = c15518lCrashlytics2.amazon;
                        long j10 = c15518lCrashlytics2.billing;
                        long j11 = j9 ^ j10;
                        long j12 = j10 ^ c15518lCrashlytics2.purchase;
                        long j13 = j11 + j12;
                        long j14 = j12 + j13;
                        long j15 = (j13 ^ (j13 >>> 33)) * (-49064778989728563L);
                        long j16 = (j15 ^ (j15 >>> 33)) * (-4265267296055464877L);
                        long j17 = (j14 ^ (j14 >>> 33)) * (-49064778989728563L);
                        long j18 = (j17 ^ (j17 >>> 33)) * (-4265267296055464877L);
                        long j19 = j18 ^ (j18 >>> 33);
                        long j20 = (j16 ^ (j16 >>> 33)) + j19;
                        c15518lCrashlytics2.amazon = j20;
                        c15518lCrashlytics2.purchase = j19 + j20;
                        byte[] bArrArray = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(c15518lCrashlytics2.amazon).putLong(c15518lCrashlytics2.purchase).array();
                        char[] cArr = AbstractC17250l.f33478l;
                        new C13575l(bArrArray);
                        return ((C15362l) c4816l.f9860l).yandex((byte[]) bArrArray.clone());
                    default:
                        return ((C15362l) c4816l.f9860l).yandex(((AbstractC15619l) serializable).ads());
                }
            }
        });
        final int i2 = 0;
        this.f9862l = AbstractC15788l.purchase(new InterfaceC11766l(this) { // from class: lٌۧٓ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C4816l f18951l;

            {
                this.f18951l = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // defpackage.InterfaceC11766l
            public final Object get() {
                long j;
                long j2;
                long j3;
                long j4;
                long j5;
                long j6;
                long j7;
                int i3 = i2;
                Serializable serializable = str;
                C4816l c4816l = this.f18951l;
                switch (i3) {
                    case 0:
                        int i4 = AbstractC8075l.yandex;
                        int i5 = C17275l.f33510l;
                        C15518l c15518lCrashlytics = new C15518l().crashlytics(((String) serializable).getBytes());
                        ByteBuffer byteBuffer = c15518lCrashlytics.yandex;
                        byteBuffer.put((byte) 0);
                        char c = '\b';
                        if (byteBuffer.remaining() < 8) {
                            c15518lCrashlytics.yandex();
                        }
                        C15518l c15518lCrashlytics2 = c15518lCrashlytics.crashlytics("".getBytes());
                        c15518lCrashlytics2.yandex();
                        ByteBuffer byteBuffer2 = c15518lCrashlytics2.yandex;
                        byteBuffer2.flip();
                        if (byteBuffer2.remaining() > 0) {
                            c15518lCrashlytics2.billing = byteBuffer2.remaining() + c15518lCrashlytics2.billing;
                            long j8 = 0;
                            switch (byteBuffer2.remaining()) {
                                case 1:
                                    j = 0;
                                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                    c15518lCrashlytics2.amazon = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c15518lCrashlytics2.amazon;
                                    c15518lCrashlytics2.purchase ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 2:
                                    c = '\b';
                                    j2 = 0;
                                    j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                    c15518lCrashlytics2.amazon = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c15518lCrashlytics2.amazon;
                                    c15518lCrashlytics2.purchase ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 3:
                                    c = '\b';
                                    j3 = 0;
                                    j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                    j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                    c15518lCrashlytics2.amazon = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c15518lCrashlytics2.amazon;
                                    c15518lCrashlytics2.purchase ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 4:
                                    c = '\b';
                                    j4 = 0;
                                    j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                                    j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                    j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                    c15518lCrashlytics2.amazon = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c15518lCrashlytics2.amazon;
                                    c15518lCrashlytics2.purchase ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 5:
                                    j5 = 0;
                                    j4 = j5 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                                    j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                                    j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                    j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                    c15518lCrashlytics2.amazon = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c15518lCrashlytics2.amazon;
                                    c15518lCrashlytics2.purchase ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 6:
                                    j6 = 0;
                                    j5 = (((long) (byteBuffer2.get(5) & 255)) << 40) ^ j6;
                                    j4 = j5 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                                    j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                                    j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                    j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                    c15518lCrashlytics2.amazon = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c15518lCrashlytics2.amazon;
                                    c15518lCrashlytics2.purchase ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 7:
                                    j6 = ((long) (byteBuffer2.get(6) & 255)) << 48;
                                    j5 = (((long) (byteBuffer2.get(5) & 255)) << 40) ^ j6;
                                    j4 = j5 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                                    j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                                    j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                    j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                    c15518lCrashlytics2.amazon = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c15518lCrashlytics2.amazon;
                                    c15518lCrashlytics2.purchase ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 8:
                                    j7 = byteBuffer2.getLong();
                                    c15518lCrashlytics2.amazon = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c15518lCrashlytics2.amazon;
                                    c15518lCrashlytics2.purchase ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 9:
                                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                                    j7 = byteBuffer2.getLong();
                                    c15518lCrashlytics2.amazon = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c15518lCrashlytics2.amazon;
                                    c15518lCrashlytics2.purchase ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 10:
                                    j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                                    j7 = byteBuffer2.getLong();
                                    c15518lCrashlytics2.amazon = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c15518lCrashlytics2.amazon;
                                    c15518lCrashlytics2.purchase ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 11:
                                    j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                    j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                                    j7 = byteBuffer2.getLong();
                                    c15518lCrashlytics2.amazon = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c15518lCrashlytics2.amazon;
                                    c15518lCrashlytics2.purchase ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 12:
                                    j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                    j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                    j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                                    j7 = byteBuffer2.getLong();
                                    c15518lCrashlytics2.amazon = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c15518lCrashlytics2.amazon;
                                    c15518lCrashlytics2.purchase ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 13:
                                    j8 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                                    j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                    j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                    j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                                    j7 = byteBuffer2.getLong();
                                    c15518lCrashlytics2.amazon = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c15518lCrashlytics2.amazon;
                                    c15518lCrashlytics2.purchase ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 14:
                                    j8 ^= ((long) (byteBuffer2.get(13) & 255)) << 40;
                                    j8 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                                    j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                    j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                    j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                                    j7 = byteBuffer2.getLong();
                                    c15518lCrashlytics2.amazon = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c15518lCrashlytics2.amazon;
                                    c15518lCrashlytics2.purchase ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 15:
                                    j8 = ((long) (byteBuffer2.get(14) & 255)) << 48;
                                    j8 ^= ((long) (byteBuffer2.get(13) & 255)) << 40;
                                    j8 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                                    j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                    j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                    j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                                    j7 = byteBuffer2.getLong();
                                    c15518lCrashlytics2.amazon = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c15518lCrashlytics2.amazon;
                                    c15518lCrashlytics2.purchase ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                default:
                                    C8339l.subs("Should never get here.");
                                    return null;
                            }
                        }
                        long j9 = c15518lCrashlytics2.amazon;
                        long j10 = c15518lCrashlytics2.billing;
                        long j11 = j9 ^ j10;
                        long j12 = j10 ^ c15518lCrashlytics2.purchase;
                        long j13 = j11 + j12;
                        long j14 = j12 + j13;
                        long j15 = (j13 ^ (j13 >>> 33)) * (-49064778989728563L);
                        long j16 = (j15 ^ (j15 >>> 33)) * (-4265267296055464877L);
                        long j17 = (j14 ^ (j14 >>> 33)) * (-49064778989728563L);
                        long j18 = (j17 ^ (j17 >>> 33)) * (-4265267296055464877L);
                        long j19 = j18 ^ (j18 >>> 33);
                        long j20 = (j16 ^ (j16 >>> 33)) + j19;
                        c15518lCrashlytics2.amazon = j20;
                        c15518lCrashlytics2.purchase = j19 + j20;
                        byte[] bArrArray = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(c15518lCrashlytics2.amazon).putLong(c15518lCrashlytics2.purchase).array();
                        char[] cArr = AbstractC17250l.f33478l;
                        new C13575l(bArrArray);
                        return ((C15362l) c4816l.f9860l).yandex((byte[]) bArrArray.clone());
                    default:
                        return ((C15362l) c4816l.f9860l).yandex(((AbstractC15619l) serializable).ads());
                }
            }
        });
    }

    public C4816l(C6901l c6901l, String str, C18253l c18253l) {
        this.f9861l = 18;
        this.f9860l = str;
        this.f9859l = c18253l;
        this.f9862l = c6901l;
    }

    public C4816l(int i) {
        this.f9861l = i;
        switch (i) {
            case 6:
                this.f9860l = new AtomicReference(AbstractC15450l.yandex);
                this.f9859l = new Object();
                break;
            default:
                this.f9860l = AbstractC8618l.yandex();
                this.f9862l = AbstractC11190l.yandex(Boolean.FALSE);
                break;
        }
    }

    public C4816l(AppBarLayout appBarLayout, ActionMenuView actionMenuView, ImageView imageView, TextView textView) {
        this.f9861l = 10;
        this.f9860l = appBarLayout;
        this.f9859l = actionMenuView;
        this.f9862l = textView;
    }

    public C4816l(Context context) {
        this.f9861l = 2;
        this.f9860l = new Object();
        this.f9862l = new HashMap();
        this.f9859l = new C3602l(this, context);
    }

    public C4816l(InterfaceC16115l interfaceC16115l, C4816l c4816l) {
        this.f9861l = 9;
        this.f9860l = interfaceC16115l;
        this.f9859l = c4816l;
        this.f9862l = interfaceC16115l.getValue();
    }
}
