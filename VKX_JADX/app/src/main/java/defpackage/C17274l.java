package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٍٗٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17274l {
    public static final String[] smaato = {"INSERT", "UPDATE", "DELETE"};
    public Object admob;
    public final Object amazon;
    public final Object billing;
    public final Object crashlytics;
    public Object firebase;
    public Object isPro;
    public final Object loadAd;
    public final Object mopub;
    public final Object purchase;
    public Object subs;
    public boolean yandex;

    public C17274l(WorkDatabase_Impl workDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z, C17847l c17847l) {
        this.loadAd = workDatabase_Impl;
        this.crashlytics = linkedHashMap;
        this.amazon = linkedHashMap2;
        this.yandex = z;
        this.billing = c17847l;
        this.isPro = new AtomicBoolean(false);
        this.firebase = new C1712l(14);
        this.purchase = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            ((LinkedHashMap) this.purchase).put(lowerCase, Integer.valueOf(i));
            String str2 = (String) ((LinkedHashMap) this.crashlytics).get(strArr[i]);
            String lowerCase2 = str2 != null ? str2.toLowerCase(locale) : null;
            if (lowerCase2 != null) {
                lowerCase = lowerCase2;
            }
            strArr2[i] = lowerCase;
        }
        this.mopub = strArr2;
        for (Map.Entry entry : ((LinkedHashMap) this.crashlytics).entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            if (((LinkedHashMap) this.purchase).containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                LinkedHashMap linkedHashMap3 = (LinkedHashMap) this.purchase;
                linkedHashMap3.put(lowerCase4, AbstractC8676l.smaato(lowerCase3, linkedHashMap3));
            }
        }
        this.admob = new C11919l(((String[]) this.mopub).length);
        this.subs = new C16543l(((String[]) this.mopub).length);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051  */
    /* JADX WARN: Code duplicated, block: B:18:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0083 -> B:19:0x0086). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object amazon(defpackage.C17274l r7, defpackage.InterfaceC12352l r8, int r9, defpackage.AbstractC0283l r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof defpackage.C18511l
            if (r0 == 0) goto L16
            r0 = r10
            lؘۗ r0 = (defpackage.C18511l) r0
            int r1 = r0.f36143l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f36143l = r1
            goto L1b
        L16:
            lؘۗ r0 = new lؘۗ
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.f36141l
            int r1 = r0.f36143l
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 != r2) goto L34
            int r7 = r0.f36137l
            int r8 = r0.f36136l
            java.lang.String[] r9 = r0.f36142l
            java.lang.String r1 = r0.f36139l
            lؔٗۨ r3 = r0.f36140l
            defpackage.AbstractC2829l.crashlytics(r10)
            r10 = r9
            r9 = r3
            goto L86
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r7)
            r7 = 0
            return r7
        L3b:
            defpackage.AbstractC2829l.crashlytics(r10)
            java.lang.Object r7 = r7.mopub
            java.lang.String[] r7 = (java.lang.String[]) r7
            r7 = r7[r9]
            java.lang.String[] r9 = defpackage.C17274l.smaato
            r10 = 0
            r1 = 3
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L4f:
            if (r8 >= r7) goto L88
            r3 = r10[r8]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "room_table_modification_trigger_"
            r4.<init>(r5)
            r4.append(r1)
            r5 = 95
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "DROP TRIGGER IF EXISTS `"
            r5 = 96
            java.lang.String r3 = defpackage.AbstractC14814l.smaato(r5, r4, r3)
            r0.f36140l = r9
            r0.f36139l = r1
            r0.f36142l = r10
            r0.f36136l = r8
            r0.f36137l = r7
            r0.f36143l = r2
            java.lang.Object r3 = defpackage.AbstractC15235l.loadAd(r9, r3, r0)
            lٍؗؐ r4 = defpackage.EnumC9342l.f19165l
            if (r3 != r4) goto L86
            return r4
        L86:
            int r8 = r8 + r2
            goto L4f
        L88:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17274l.amazon(lٍٗٝ, lّؓۦ, int, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0092  */
    /* JADX WARN: Code duplicated, block: B:23:0x0098  */
    /* JADX WARN: Code duplicated, block: B:24:0x009b  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007e, code lost:
    
        if (defpackage.AbstractC15235l.loadAd(r1, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e0, code lost:
    
        if (defpackage.AbstractC15235l.loadAd(r10, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e2, code lost:
    
        return r8;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00e0 -> B:28:0x00e3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object crashlytics(defpackage.C17274l r17, defpackage.InterfaceC12352l r18, int r19, defpackage.AbstractC0283l r20) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17274l.crashlytics(lٍٗٝ, lّؓۦ, int, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object loadAd(C17274l c17274l, AbstractC0283l abstractC0283l) throws Throwable {
        C15828l c15828l;
        C3797l c3797l;
        Object objMetrica;
        Throwable th;
        C3797l c3797l2;
        Object value;
        int[] iArr;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c17274l.loadAd;
        if (abstractC0283l instanceof C15828l) {
            c15828l = (C15828l) abstractC0283l;
            int i = c15828l.f31081l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c15828l.f31081l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c15828l = new C15828l(c17274l, abstractC0283l);
            }
        } else {
            c15828l = new C15828l(c17274l, abstractC0283l);
        }
        Object obj = c15828l.f31084l;
        int i2 = c15828l.f31081l;
        InterfaceC14029l interfaceC14029l = null;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c3797l = workDatabase_Impl.billing;
            boolean zLoadAd = c3797l.loadAd();
            C5746l c5746l = C5746l.f12138l;
            if (!zLoadAd) {
                return c5746l;
            }
            try {
                if (!((AtomicBoolean) c17274l.isPro).compareAndSet(true, false)) {
                    c3797l.m1427private();
                    return c5746l;
                }
                if (!((Boolean) ((Function0) c17274l.firebase).invoke()).booleanValue()) {
                    c3797l.m1427private();
                    return c5746l;
                }
                C14497l c14497l = new C14497l(c17274l, interfaceC14029l, i3);
                c15828l.f31083l = c17274l;
                c15828l.f31082l = c3797l;
                c15828l.f31081l = 1;
                objMetrica = workDatabase_Impl.metrica(false, c14497l, c15828l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objMetrica == enumC9342l) {
                    return enumC9342l;
                }
            } catch (Throwable th2) {
                C3797l c3797l3 = c3797l;
                th = th2;
                c3797l2 = c3797l3;
                c3797l2.m1427private();
                throw th;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c3797l2 = c15828l.f31082l;
            C17274l c17274l2 = c15828l.f31083l;
            try {
                AbstractC2829l.crashlytics(obj);
                c3797l = c3797l2;
                c17274l = c17274l2;
                objMetrica = obj;
            } catch (Throwable th3) {
                th = th3;
                c3797l2.m1427private();
                throw th;
            }
        }
        Set set = (Set) objMetrica;
        if (!set.isEmpty()) {
            C16543l c16543l = (C16543l) c17274l.subs;
            c16543l.getClass();
            if (!set.isEmpty()) {
                C1008l c1008l = (C1008l) c16543l.f32482l;
                do {
                    value = c1008l.getValue();
                    int[] iArr2 = (int[]) value;
                    int length = iArr2.length;
                    iArr = new int[length];
                    for (int i4 = 0; i4 < length; i4++) {
                        iArr[i4] = set.contains(Integer.valueOf(i4)) ? iArr2[i4] + 1 : iArr2[i4];
                    }
                } while (!c1008l.firebase(value, iArr));
            }
            ((C17847l) c17274l.billing).invoke(set);
        }
        c3797l.m1427private();
        return set;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object yandex(C17274l c17274l, InterfaceC2679l interfaceC2679l, AbstractC0283l abstractC0283l) {
        C12422l c12422l;
        if (abstractC0283l instanceof C12422l) {
            c12422l = (C12422l) abstractC0283l;
            int i = c12422l.f24527l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c12422l.f24527l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c12422l = new C12422l(c17274l, abstractC0283l);
            }
        } else {
            c12422l = new C12422l(c17274l, abstractC0283l);
        }
        Object objLoadAd = c12422l.f24528l;
        int i2 = c12422l.f24527l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objLoadAd);
            C5562l c5562l = new C5562l(24);
            c12422l.f24529l = interfaceC2679l;
            c12422l.f24527l = 1;
            objLoadAd = interfaceC2679l.loadAd("SELECT * FROM room_table_modification_log WHERE invalidated = 1", c5562l, c12422l);
            if (objLoadAd != enumC9342l) {
            }
            return enumC9342l;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Set set = (Set) c12422l.f24529l;
            AbstractC2829l.crashlytics(objLoadAd);
            return set;
        }
        interfaceC2679l = (InterfaceC2679l) c12422l.f24529l;
        AbstractC2829l.crashlytics(objLoadAd);
        Set set2 = (Set) objLoadAd;
        if (!set2.isEmpty()) {
            c12422l.f24529l = set2;
            c12422l.f24527l = 2;
            if (AbstractC15235l.loadAd(interfaceC2679l, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", c12422l) == enumC9342l) {
                return enumC9342l;
            }
        }
        return set2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object admob(AbstractC0283l abstractC0283l) {
        C3646l c3646l;
        Throwable th;
        C3797l c3797l;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.loadAd;
        if (abstractC0283l instanceof C3646l) {
            c3646l = (C3646l) abstractC0283l;
            int i = c3646l.f7621l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3646l.f7621l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c3646l = new C3646l(this, abstractC0283l);
            }
        } else {
            c3646l = new C3646l(this, abstractC0283l);
        }
        Object obj = c3646l.f7622l;
        int i2 = c3646l.f7621l;
        InterfaceC14029l interfaceC14029l = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C3797l c3797l2 = workDatabase_Impl.billing;
            if (c3797l2.loadAd()) {
                try {
                    C14497l c14497l = new C14497l(this, interfaceC14029l, 2);
                    c3646l.f7623l = c3797l2;
                    c3646l.f7621l = 1;
                    Object objMetrica = workDatabase_Impl.metrica(false, c14497l, c3646l);
                    EnumC9342l enumC9342l = EnumC9342l.f19165l;
                    if (objMetrica == enumC9342l) {
                        return enumC9342l;
                    }
                    c3797l = c3797l2;
                    c3797l.m1427private();
                } catch (Throwable th2) {
                    th = th2;
                    c3797l = c3797l2;
                    c3797l.m1427private();
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c3797l = c3646l.f7623l;
            try {
                AbstractC2829l.crashlytics(obj);
                c3797l.m1427private();
            } catch (Throwable th3) {
                th = th3;
                c3797l.m1427private();
                throw th;
            }
        }
        return Unit.INSTANCE;
    }

    public void billing(C8193l c8193l) {
        if (!this.yandex || c8193l.equals((C8193l) this.subs)) {
            return;
        }
        this.subs = c8193l;
        C4856l c4856l = (C4856l) ((C2683l) this.crashlytics).f5813l;
        c4856l.billing();
        C8193l c8193l2 = c4856l.admob;
        if (c8193l2 == null || c8193l.equals(c8193l2)) {
            return;
        }
        c4856l.admob = c8193l;
        C8961l c8961l = c4856l.billing;
        if (c8961l != null) {
            c8961l.mopub(-1, new C8339l(21));
        }
    }

    public C8195l isPro(String[] strArr) {
        C4344l c4344l = new C4344l();
        for (String str : strArr) {
            Set set = (Set) ((LinkedHashMap) this.amazon).get(str.toLowerCase(Locale.ROOT));
            if (set != null) {
                c4344l.addAll(set);
            } else {
                c4344l.add(str);
            }
        }
        String[] strArr2 = (String[]) AbstractC9905l.yandex(c4344l).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            Integer num = (Integer) ((LinkedHashMap) this.purchase).get(str2.toLowerCase(Locale.ROOT));
            if (num == null) {
                C8339l.metrica("There is no table with name ".concat(str2));
                return null;
            }
            iArr[i] = num.intValue();
        }
        return new C8195l(strArr2, iArr);
    }

    public void mopub(Function0 function0, Function0 function1) {
        if (((AtomicBoolean) this.isPro).compareAndSet(false, true)) {
            function0.invoke();
            C18662l c18662l = ((WorkDatabase_Impl) this.loadAd).yandex;
            InterfaceC14029l interfaceC14029l = null;
            if (c18662l == null) {
                c18662l = null;
            }
            AbstractC10999l.mopub(c18662l, new C0499l("Room Invalidation Tracker Refresh"), 0, new C15352l(this, function1, interfaceC14029l, 22), 2);
        }
    }

    public List purchase() {
        C3582l c3582l;
        if (Build.VERSION.SDK_INT >= 32 && (c3582l = (C3582l) this.admob) != null) {
            return c3582l.loadAd();
        }
        C9258l c9258l = AbstractC1186l.f3181l;
        return C13708l.f26763l;
    }

    public void subs() {
        List listPurchase = purchase();
        Context context = (Context) this.loadAd;
        C13736l c13736l = (C13736l) this.firebase;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.isPro;
        C13708l c13708l = C8193l.purchase;
        billing(C8193l.loadAd(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c13736l, audioDeviceInfo, listPurchase));
    }

    public C17274l(Context context, C2683l c2683l, C13736l c13736l, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.loadAd = applicationContext;
        this.crashlytics = c2683l;
        this.firebase = c13736l;
        this.isPro = audioDeviceInfo;
        Handler handler = new Handler(AbstractC15323l.isVip(), null);
        this.amazon = handler;
        this.purchase = new C2088l(0, this);
        this.billing = new C13773l(2, this);
        C13708l c13708l = C8193l.purchase;
        String str = Build.MANUFACTURER;
        Uri uriFor = (str.equals("Amazon") || str.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.mopub = uriFor != null ? new C10986l(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }
}
