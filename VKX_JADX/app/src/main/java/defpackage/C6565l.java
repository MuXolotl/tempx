package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.os.Parcel;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: lؙٚٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6565l implements InterfaceC11759l, InterfaceC15446l, InterfaceC7405l, InterfaceC4789l, InterfaceC9560l, InterfaceC11545l, InterfaceC9765l, InterfaceC15378l, InterfaceC14257l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13717l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ C6565l f13712l = new C6565l(15);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ C6565l f13709l = new C6565l(16);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ C6565l f13714l = new C6565l(17);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ C6565l f13713l = new C6565l(18);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ C6565l f13716l = new C6565l(19);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ C6565l f13710l = new C6565l(20);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ C6565l f13711l = new C6565l(21);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final /* synthetic */ C6565l f13715l = new C6565l(23);

    public /* synthetic */ C6565l(int i) {
        this.f13717l = i;
    }

    public static final C2934l ads(Bitmap bitmap) {
        C7545l c7545l = C18718l.purchase;
        C2934l c2934l = new C2934l(bitmap);
        ArrayList arrayList = (ArrayList) c2934l.f6390l;
        if (arrayList != null) {
            arrayList.clear();
        }
        c2934l.yandex(C18718l.purchase);
        c2934l.yandex(C18718l.billing);
        c2934l.yandex(C18718l.mopub);
        c2934l.yandex(C18718l.admob);
        return c2934l;
    }

    public static Path tapsense(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    @Override // defpackage.InterfaceC11545l
    public void accept(Object obj, Object obj2) {
        C0022l c0022l = C16014l.f31391package;
        C10567l c10567l = (C10567l) ((C4184l) obj).metrica();
        C3448l c3448lRemoteconfig = AbstractC11990l.remoteconfig();
        Parcel parcelM743l = c10567l.m743l();
        AbstractC14627l.loadAd(parcelM743l, c3448lRemoteconfig);
        c10567l.m747l(parcelM743l, 19);
        ((C2350l) obj2).loadAd(Boolean.TRUE);
    }

    @Override // defpackage.InterfaceC11759l
    public int adcel(C10023l c10023l, C4136l c4136l, int i) {
        c4136l.f16423l = 4;
        return -4;
    }

    @Override // defpackage.InterfaceC4789l
    public /* synthetic */ boolean admob(AbstractC14971l abstractC14971l) {
        return true;
    }

    @Override // defpackage.InterfaceC7405l
    public long amazon() {
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r8v0, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r8v1, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.InterfaceC4789l
    public boolean billing(AbstractC14971l abstractC14971l) {
        ?? c17893l = 0;
        while (abstractC14971l != 0) {
            if (abstractC14971l instanceof InterfaceC13202l) {
                ((InterfaceC13202l) abstractC14971l).mo1493class();
            } else if ((abstractC14971l.f29450l & 16) != 0 && (abstractC14971l instanceof AbstractC11340l)) {
                AbstractC14971l abstractC14971l2 = ((AbstractC11340l) abstractC14971l).f22875l;
                int i = 0;
                c17893l = c17893l;
                abstractC14971l = abstractC14971l;
                while (abstractC14971l2 != null) {
                    if ((abstractC14971l2.f29450l & 16) != 0) {
                        i++;
                        if (i == 1) {
                            c17893l = c17893l;
                            abstractC14971l = abstractC14971l2;
                        } else {
                            if (c17893l == 0) {
                                c17893l = new C17893l(0, new AbstractC14971l[16]);
                            }
                            if (abstractC14971l != 0) {
                                c17893l.crashlytics(abstractC14971l);
                                abstractC14971l = 0;
                            }
                            c17893l.crashlytics(abstractC14971l2);
                        }
                    }
                    abstractC14971l2 = abstractC14971l2.f29460l;
                    c17893l = c17893l;
                    abstractC14971l = abstractC14971l;
                }
                if (i == 1) {
                }
            }
            abstractC14971l = AbstractC5573l.loadAd(c17893l);
        }
        return false;
    }

    @Override // defpackage.InterfaceC15378l
    public boolean crashlytics(Class cls) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // defpackage.InterfaceC4789l
    public boolean isPro(C18333l c18333l, C3654l c3654l) {
        AbstractC18026l abstractC18026l = (AbstractC18026l) c3654l.f7703l.purchase;
        abstractC18026l.getClass();
        AbstractC14971l abstractC14971lM4493l = abstractC18026l.m4493l(AbstractC3068l.mopub(16));
        if (abstractC14971lM4493l != null && abstractC14971lM4493l.f29462l) {
            if (!abstractC14971lM4493l.f29454l.f29462l) {
                AbstractC0081l.crashlytics("visitLocalDescendants called on an unattached node");
            }
            AbstractC14971l abstractC14971l = abstractC14971lM4493l.f29454l;
            if ((abstractC14971l.f29457l & 16) != 0) {
                while (abstractC14971l != null) {
                    if ((abstractC14971l.f29450l & 16) != 0) {
                        ?? LoadAd = abstractC14971l;
                        ?? c17893l = 0;
                        while (LoadAd != 0) {
                            if (LoadAd instanceof InterfaceC13202l) {
                                if (((InterfaceC13202l) LoadAd).mo1497l()) {
                                    c18333l.f35842l = c18333l.f35844l.loadAd - 1;
                                    return true;
                                }
                            } else if ((LoadAd.f29450l & 16) != 0 && (LoadAd instanceof AbstractC11340l)) {
                                AbstractC14971l abstractC14971l2 = ((AbstractC11340l) LoadAd).f22875l;
                                int i = 0;
                                while (abstractC14971l2 != null) {
                                    if ((abstractC14971l2.f29450l & 16) != 0) {
                                        i++;
                                        if (i == 1) {
                                            LoadAd = LoadAd;
                                            c17893l = c17893l;
                                            c17893l = c17893l;
                                            LoadAd = abstractC14971l2;
                                        } else {
                                            if (c17893l == 0) {
                                                c17893l = new C17893l(0, new AbstractC14971l[16]);
                                            }
                                            if (LoadAd != 0) {
                                                c17893l.crashlytics(LoadAd);
                                                LoadAd = 0;
                                            }
                                            c17893l.crashlytics(abstractC14971l2);
                                        }
                                    } else {
                                        LoadAd = LoadAd;
                                        c17893l = c17893l;
                                    }
                                    abstractC14971l2 = abstractC14971l2.f29460l;
                                    LoadAd = LoadAd;
                                    c17893l = c17893l;
                                }
                                if (i == 1) {
                                    LoadAd = LoadAd;
                                    c17893l = c17893l;
                                } else {
                                    LoadAd = LoadAd;
                                    c17893l = c17893l;
                                }
                            }
                            LoadAd = AbstractC5573l.loadAd(c17893l);
                        }
                    }
                    abstractC14971l = abstractC14971l.f29460l;
                }
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC15378l
    public C9025l loadAd(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // defpackage.InterfaceC14257l
    public C15380l metrica(Context context, String str, InterfaceC6481l interfaceC6481l) {
        int iBilling;
        C15380l c15380l = new C15380l();
        int iSubs = interfaceC6481l.subs(context, str);
        c15380l.loadAd = iSubs;
        int i = 1;
        int i2 = 0;
        if (iSubs != 0) {
            iBilling = interfaceC6481l.billing(context, str, false);
            c15380l.crashlytics = iBilling;
        } else {
            iBilling = interfaceC6481l.billing(context, str, true);
            c15380l.crashlytics = iBilling;
        }
        int i3 = c15380l.loadAd;
        if (i3 == 0) {
            if (iBilling == 0) {
                i = 0;
            }
            c15380l.amazon = i;
            return c15380l;
        }
        i2 = i3;
        if (i2 >= iBilling) {
            i = -1;
        }
        c15380l.amazon = i;
        return c15380l;
    }

    @Override // defpackage.InterfaceC4789l
    public int mopub() {
        return 16;
    }

    @Override // defpackage.InterfaceC7405l
    public boolean next() {
        return false;
    }

    @Override // defpackage.InterfaceC9560l
    public C1561l purchase() {
        byte[] bArrPurchase = AbstractC10478l.purchase();
        return new C1561l(bArrPurchase, AbstractC10478l.mopub(bArrPurchase));
    }

    @Override // defpackage.InterfaceC4789l
    public boolean remoteconfig(C3654l c3654l) {
        return true;
    }

    @Override // defpackage.InterfaceC11759l
    public int smaato(long j) {
        return 0;
    }

    @Override // defpackage.InterfaceC9560l
    public byte[] startapp(byte[] bArr, byte[] bArr2) {
        return AbstractC10478l.amazon(bArr, bArr2);
    }

    @Override // defpackage.InterfaceC4789l
    public void subs(C3654l c3654l, long j, C18333l c18333l, int i, boolean z) {
        c3654l.premium(j, c18333l, i, z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        if (r7 == r5) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r8v0, types: [lؘۥۨ] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object subscription(defpackage.InterfaceC6095l r8, defpackage.AbstractC0283l r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.C3042l
            if (r0 == 0) goto L13
            r0 = r9
            lؔۦؒ r0 = (defpackage.C3042l) r0
            int r1 = r0.f6558l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6558l = r1
            goto L18
        L13:
            lؔۦؒ r0 = new lؔۦؒ
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r7 = r0.f6559l
            int r9 = r0.f6558l
            java.lang.String r1 = "FirebaseSessions"
            r2 = 2
            r3 = 1
            java.lang.String r4 = ""
            lٍؗؐ r5 = defpackage.EnumC9342l.f19165l
            if (r9 == 0) goto L45
            if (r9 == r3) goto L3b
            if (r9 != r2) goto L34
            java.lang.Object r8 = r0.f6560l
            java.lang.String r8 = (java.lang.String) r8
            defpackage.AbstractC2829l.crashlytics(r7)     // Catch: java.lang.Exception -> L32
            goto L81
        L32:
            r7 = move-exception
            goto L88
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r7)
            r7 = 0
            return r7
        L3b:
            java.lang.Object r8 = r0.f6560l
            lؘۥۨ r8 = (defpackage.InterfaceC6095l) r8
            defpackage.AbstractC2829l.crashlytics(r7)     // Catch: java.lang.Exception -> L43
            goto L5d
        L43:
            r7 = move-exception
            goto L69
        L45:
            defpackage.AbstractC2829l.crashlytics(r7)
            r7 = r8
            lِٗؓ r7 = (defpackage.C17059l) r7     // Catch: java.lang.Exception -> L43
            lؖؐؖ r8 = r7.purchase()     // Catch: java.lang.Exception -> L43
            r0.f6560l = r7     // Catch: java.lang.Exception -> L65
            r0.f6558l = r3     // Catch: java.lang.Exception -> L65
            java.lang.Object r8 = defpackage.AbstractC5103l.amazon(r8, r0)     // Catch: java.lang.Exception -> L65
            if (r8 != r5) goto L5a
            goto L80
        L5a:
            r6 = r8
            r8 = r7
            r7 = r6
        L5d:
            lؗ۠ۢ r7 = (defpackage.C5204l) r7     // Catch: java.lang.Exception -> L43
            java.lang.String r7 = r7.yandex     // Catch: java.lang.Exception -> L43
            r6 = r8
            r8 = r7
            r7 = r6
            goto L70
        L65:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L69:
            java.lang.String r9 = "Error getting authentication token."
            android.util.Log.w(r1, r9, r7)
            r7 = r8
            r8 = r4
        L70:
            lِٗؓ r7 = (defpackage.C17059l) r7     // Catch: java.lang.Exception -> L32
            lؖؐؖ r7 = r7.amazon()     // Catch: java.lang.Exception -> L32
            r0.f6560l = r8     // Catch: java.lang.Exception -> L32
            r0.f6558l = r2     // Catch: java.lang.Exception -> L32
            java.lang.Object r7 = defpackage.AbstractC5103l.amazon(r7, r0)     // Catch: java.lang.Exception -> L32
            if (r7 != r5) goto L81
        L80:
            return r5
        L81:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L32
            if (r7 != 0) goto L86
            goto L8d
        L86:
            r4 = r7
            goto L8d
        L88:
            java.lang.String r9 = "Error getting Firebase installation id ."
            android.util.Log.w(r1, r9, r7)
        L8d:
            lًؒؔ r7 = new lًؒؔ
            r7.<init>(r4, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6565l.subscription(lؘۥۨ, lّؑۧ):java.lang.Object");
    }

    @Override // defpackage.InterfaceC7405l
    public long vip() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.InterfaceC11759l
    public boolean yandex() {
        return true;
    }

    @Override // defpackage.InterfaceC9765l
    public Object zza() {
        switch (this.f13717l) {
            case 16:
                List list = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return Integer.valueOf((int) ((Long) C4515l.yandex.billing(1000L, 69, "measurement.upload.max_error_events_per_day").get()).longValue());
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                List list2 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return Integer.valueOf((int) ((Long) C4515l.yandex.billing(10L, 42, "measurement.sgtm.batch.retry_max_count").get()).longValue());
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list3 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(86400000L, 53, "measurement.upload.stale_data_deletion_interval").get();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list4 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (String) C4515l.yandex.mopub("measurement.config.url_authority", 7, "app-measurement.com").get();
            case 20:
                List list5 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (String) C4515l.yandex.mopub("measurement.rb.attribution.uri_scheme", 60, "https").get();
            case 21:
                List list6 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return Integer.valueOf((int) ((Long) C4515l.yandex.billing(3000L, 30, "measurement.rb.attribution.notify_app_delay_millis").get()).longValue());
            default:
                List list7 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(10000L, 0, "measurement.ad_id_cache_time").get();
        }
    }

    @Override // defpackage.InterfaceC11759l
    public void firebase() {
    }
}
