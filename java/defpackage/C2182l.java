package defpackage;

import android.util.Log;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lؓۡۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2182l {
    public final InterfaceC2262l amazon;
    public final LinkedHashSet billing;
    public final C10393l crashlytics;
    public final C9049l loadAd;
    public final ArrayList mopub;
    public final C1424l purchase;
    public final C15712l yandex;

    public C2182l(C15712l c15712l, C9049l c9049l, C10393l c10393l, C11969l c11969l) {
        this.yandex = c15712l;
        this.loadAd = c9049l;
        this.crashlytics = c10393l;
        InterfaceC2262l interfaceC2262l = c11969l.yandex;
        this.amazon = interfaceC2262l;
        C15406l c15406l = new C15406l(1, this, C2182l.class, "prune", "prune$camera_camera2_pipe(Ljava/util/List;)V", 0, 0, 29);
        InterfaceC14029l interfaceC14029l = null;
        int i = 7;
        C7226l c7226l = new C7226l(this, interfaceC14029l, i);
        C9673l c9673l = new C9673l(14);
        C1424l c1424l = new C1424l();
        c1424l.f3603l = c15406l;
        c1424l.f3602l = c9673l;
        c1424l.f3601l = c7226l;
        c1424l.f3605l = AbstractC1805l.yandex(false);
        c1424l.f3604l = AbstractC12098l.yandex(Alert.DURATION_SHOW_INDEFINITELY, 0, new C8250l(29, c1424l), 2);
        c1424l.f3606l = new C11315l();
        if (!((C18474l) c1424l.f3605l).yandex()) {
            C8339l.smaato("PruningProcessingQueue cannot be re-started!");
            throw null;
        }
        if (AbstractC10999l.mopub(interfaceC2262l, null, 0, new C17972l(c1424l, interfaceC14029l, i), 3).isCancelled()) {
            C1424l.firebase(c1424l, null);
        }
        this.purchase = c1424l;
        this.billing = new LinkedHashSet();
        this.mopub = new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:105:0x026a  */
    /* JADX WARN: Code duplicated, block: B:110:0x027d  */
    /* JADX WARN: Code duplicated, block: B:115:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0279 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:? A[LOOP:2: B:50:0x0145->B:125:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0137 A[LOOP:3: B:46:0x0131->B:48:0x0137, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x014b  */
    /* JADX WARN: Code duplicated, block: B:64:0x018b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0195  */
    /* JADX WARN: Code duplicated, block: B:69:0x019b  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:83:0x0207  */
    /* JADX WARN: Code duplicated, block: B:85:0x0213  */
    /* JADX WARN: Code duplicated, block: B:88:0x021a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0224  */
    /* JADX WARN: Code duplicated, block: B:99:0x0254  */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0264, code lost:
    
        if (loadAd(r10, r0) == r1) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0277, code lost:
    
        if (r11.amazon(r9, r0) == r1) goto L107;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x019b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x01c3, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object admob(defpackage.C2185l r10, defpackage.AbstractC0283l r11) {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2182l.admob(lؓۡۧ, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object amazon(String str, List list, C11760l c11760l, InterfaceC2262l interfaceC2262l, AbstractC0283l abstractC0283l) {
        C14673l c14673l;
        if (abstractC0283l instanceof C14673l) {
            c14673l = (C14673l) abstractC0283l;
            int i = c14673l.f28706l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c14673l.f28706l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c14673l = new C14673l(this, abstractC0283l);
            }
        } else {
            c14673l = new C14673l(this, abstractC0283l);
        }
        Object objLoadAd = c14673l.f28702l;
        int i2 = c14673l.f28706l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objLoadAd);
            Log.d("CXCP", "Opening " + ((Object) C10160l.loadAd(str)) + " with retries...");
            c14673l.f28705l = str;
            c14673l.f28704l = list;
            c14673l.f28707l = interfaceC2262l;
            c14673l.f28706l = 1;
            objLoadAd = this.yandex.loadAd(str, this.loadAd, c11760l, c14673l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objLoadAd == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC2262l = c14673l.f28707l;
            list = c14673l.f28704l;
            str = c14673l.f28705l;
            AbstractC2829l.crashlytics(objLoadAd);
        }
        C10785l c10785l = (C10785l) objLoadAd;
        C12747l c12747l = c10785l.yandex;
        return c12747l == null ? new C8584l(c10785l.loadAd) : new C13447l(new C12151l(c12747l, AbstractC16901l.m4229l(AbstractC16901l.m4218final(new C10160l(str), list)), interfaceC2262l, new C8250l(28, this)));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:32:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[LOOP:0: B:24:0x006c->B:34:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (crashlytics(r6.mopub) == r5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object billing(defpackage.C10463l r7, defpackage.AbstractC0283l r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.C15807l
            if (r0 == 0) goto L13
            r0 = r8
            lٕٜٞ r0 = (defpackage.C15807l) r0
            int r1 = r0.f31039l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31039l = r1
            goto L18
        L13:
            lٕٜٞ r0 = new lٕٜٞ
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f31042l
            int r1 = r0.f31039l
            r2 = 2
            r3 = 1
            java.util.LinkedHashSet r4 = r6.billing
            lٍؗؐ r5 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L37
            if (r1 != r2) goto L30
            java.util.Iterator r6 = r0.f31040l
            lَٞ۠ r7 = r0.f31041l
            defpackage.AbstractC2829l.crashlytics(r8)
            goto L6c
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r6)
            r6 = 0
            return r6
        L37:
            lَٞ۠ r7 = r0.f31041l
            defpackage.AbstractC2829l.crashlytics(r8)
            goto L54
        L3d:
            defpackage.AbstractC2829l.crashlytics(r8)
            java.lang.String r8 = "CXCP"
            java.lang.String r1 = "PruningCamera2DeviceManager#processRequestCloseAll()"
            android.util.Log.i(r8, r1)
            r0.f31041l = r7
            r0.f31039l = r3
            java.util.ArrayList r8 = r6.mopub
            kotlin.Unit r6 = r6.crashlytics(r8)
            if (r6 != r5) goto L54
            goto L84
        L54:
            java.util.Iterator r6 = r4.iterator()
        L58:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L68
            java.lang.Object r8 = r6.next()
            lِؚ۟ r8 = (defpackage.C12151l) r8
            r8.crashlytics()
            goto L58
        L68:
            java.util.Iterator r6 = r4.iterator()
        L6c:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L85
            java.lang.Object r8 = r6.next()
            lِؚ۟ r8 = (defpackage.C12151l) r8
            r0.f31041l = r7
            r0.f31040l = r6
            r0.f31039l = r2
            java.lang.Object r8 = r8.loadAd(r0)
            if (r8 != r5) goto L6c
        L84:
            return r5
        L85:
            r4.clear()
            lٌٍٝ r6 = r7.yandex
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            r6.m3885new(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2182l.billing(lَٞ۠, lّؑۧ):java.lang.Object");
    }

    public final Unit crashlytics(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0809l c0809l = (C0809l) it.next();
            c0809l.crashlytics.loadAd();
            this.mopub.remove(c0809l);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:26:0x008e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0098  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00dd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00db -> B:44:0x00de). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:34:0x00ae
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object loadAd(java.util.Set r10, defpackage.AbstractC0283l r11) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2182l.loadAd(java.util.Set, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object mopub(C2996l c2996l, AbstractC0283l abstractC0283l) {
        C9128l c9128l;
        C2996l c2996l2;
        String str;
        Object next;
        C2996l c2996l3;
        if (abstractC0283l instanceof C9128l) {
            c9128l = (C9128l) abstractC0283l;
            int i = c9128l.f18759l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c9128l.f18759l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c9128l = new C9128l(this, abstractC0283l);
            }
        } else {
            c9128l = new C9128l(this, abstractC0283l);
        }
        Object obj = c9128l.f18762l;
        int i2 = c9128l.f18759l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i2 != 0) {
            if (i2 == 1) {
                str = c9128l.f18760l;
                c2996l2 = c9128l.f18761l;
                AbstractC2829l.crashlytics(obj);
            } else {
                if (i2 != 2) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c2996l3 = c9128l.f18761l;
                AbstractC2829l.crashlytics(obj);
            }
            c2996l2 = c2996l3;
            C9426l c9426l = c2996l2.loadAd;
            Unit unit = Unit.INSTANCE;
            c9426l.m3885new(unit);
            return unit;
        }
        AbstractC2829l.crashlytics(obj);
        String str2 = c2996l.yandex;
        Log.i("CXCP", "PruningCamera2DeviceManager#processRequestCloseById(" + ((Object) C10160l.loadAd(c2996l.yandex)) + ')');
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : this.mopub) {
            if (AbstractC8576l.yandex(((C0809l) obj2).yandex.yandex.yandex, str2)) {
                arrayList.add(obj2);
            }
        }
        c9128l.f18761l = c2996l;
        c9128l.f18760l = str2;
        c9128l.f18759l = 1;
        if (crashlytics(arrayList) != enumC9342l) {
            c2996l2 = c2996l;
            str = str2;
        }
        return enumC9342l;
        LinkedHashSet linkedHashSet = this.billing;
        Iterator it = linkedHashSet.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC8576l.yandex(((C12151l) next).yandex.yandex, str));
        C12151l c12151l = (C12151l) next;
        if (c12151l != null) {
            linkedHashSet.remove(c12151l);
            c12151l.crashlytics();
            c9128l.f18761l = c2996l2;
            c9128l.f18760l = null;
            c9128l.f18759l = 2;
            if (c12151l.loadAd(c9128l) != enumC9342l) {
                c2996l3 = c2996l2;
                c2996l2 = c2996l3;
            }
            return enumC9342l;
        }
        C9426l c9426l2 = c2996l2.loadAd;
        Unit unit2 = Unit.INSTANCE;
        c9426l2.m3885new(unit2);
        return unit2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
    
        if (r9.loadAd(r0) == r5) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object purchase(defpackage.C18459l r10, defpackage.AbstractC0283l r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.C14305l
            if (r0 == 0) goto L13
            r0 = r11
            lّٓٞ r0 = (defpackage.C14305l) r0
            int r1 = r0.f27995l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27995l = r1
            goto L18
        L13:
            lّٓٞ r0 = new lّٓٞ
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f27996l
            int r1 = r0.f27995l
            r2 = 0
            r3 = 2
            r4 = 1
            lٍؗؐ r5 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L38
            if (r1 == r4) goto L32
            if (r1 != r3) goto L2c
            defpackage.AbstractC2829l.crashlytics(r11)
            goto La6
        L2c:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r9)
            return r2
        L32:
            lِٝ r10 = r0.f27997l
            defpackage.AbstractC2829l.crashlytics(r11)
            goto L94
        L38:
            defpackage.AbstractC2829l.crashlytics(r11)
            lِؚ۟ r11 = r10.yandex
            lّٞٛ r1 = r11.yandex
            java.lang.String r1 = r1.yandex
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "PruningCamera2DeviceManager#processRequestClose("
            r6.<init>(r7)
            java.lang.String r1 = defpackage.C10160l.loadAd(r1)
            r6.append(r1)
            r1 = 41
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            java.lang.String r6 = "CXCP"
            android.util.Log.i(r6, r1)
            java.util.LinkedHashSet r1 = r9.billing
            boolean r6 = r1.contains(r11)
            if (r6 == 0) goto L68
            r1.remove(r11)
        L68:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r6 = r9.mopub
            java.util.Iterator r6 = r6.iterator()
        L73:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L89
            java.lang.Object r7 = r6.next()
            r8 = r7
            lؒؔٓ r8 = (defpackage.C0809l) r8
            lِؚ۟ r8 = r8.loadAd
            if (r8 == r11) goto L85
            goto L73
        L85:
            r1.add(r7)
            goto L73
        L89:
            r0.f27997l = r10
            r0.f27995l = r4
            kotlin.Unit r9 = r9.crashlytics(r1)
            if (r9 != r5) goto L94
            goto La5
        L94:
            lِؚ۟ r9 = r10.yandex
            r9.crashlytics()
            lِؚ۟ r9 = r10.yandex
            r0.f27997l = r2
            r0.f27995l = r3
            java.lang.Object r9 = r9.loadAd(r0)
            if (r9 != r5) goto La6
        La5:
            return r5
        La6:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2182l.purchase(lِٝ, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    /* JADX WARN: Code duplicated, block: B:55:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[LOOP:0: B:17:0x004f->B:57:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0082 -> B:28:0x0084). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object subs(java.lang.String r13, defpackage.C2185l r14, defpackage.AbstractC0283l r15) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2182l.subs(java.lang.String, lؓۡۧ, lّؑۧ):java.lang.Object");
    }

    public final C9426l yandex(String str) {
        C2996l c2996l = new C2996l(str);
        boolean z = ((C7119l) this.purchase.f3604l).amazon(c2996l) instanceof C15230l;
        C9426l c9426l = c2996l.loadAd;
        if (z) {
            Log.e("CXCP", "Camera close by ID request failed for " + ((Object) C10160l.loadAd(str)) + '!');
            c9426l.m3885new(Unit.INSTANCE);
        }
        return c9426l;
    }
}
