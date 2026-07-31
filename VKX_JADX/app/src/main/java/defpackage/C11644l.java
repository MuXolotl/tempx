package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.Layout;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.View;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.renderscript.Toolkit;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.text.Bidi;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lُِؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11644l implements InterfaceC14209l, InterfaceC17443l, InterfaceC4452l, InterfaceC10466l, InterfaceC9814l, InterfaceC0478l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C13617l f23356l = new C13617l(13);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f23357l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f23358l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23359l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f23360l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f23361l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f23362l;

    public C11644l(C3625l c3625l, C11090l c11090l, List list, InterfaceC13490l interfaceC13490l, InterfaceC16061l interfaceC16061l) {
        int i;
        C3625l c3625l2 = c3625l;
        C11090l c11090l2 = c11090l;
        this.f23359l = 23;
        this.f23358l = c3625l2;
        this.f23357l = list;
        final int i2 = 0;
        this.f23360l = AbstractC9968l.crashlytics(3, new Function0(this) { // from class: lٓؒؗ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C11644l f27149l;

            {
                this.f27149l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                Object obj = null;
                int i4 = 1;
                C11644l c11644l = this.f27149l;
                switch (i3) {
                    case 0:
                        ArrayList arrayList = (ArrayList) c11644l.f23361l;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fMo1546l = ((C8928l) obj2).yandex.mo1546l();
                            int iSmaato = AbstractC14055l.smaato(arrayList);
                            if (1 <= iSmaato) {
                                while (true) {
                                    Object obj3 = arrayList.get(i4);
                                    float fMo1546l2 = ((C8928l) obj3).yandex.mo1546l();
                                    if (Float.compare(fMo1546l, fMo1546l2) < 0) {
                                        obj2 = obj3;
                                        fMo1546l = fMo1546l2;
                                    }
                                    if (i4 != iSmaato) {
                                        i4++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        C8928l c8928l = (C8928l) obj;
                        return Float.valueOf(c8928l != null ? c8928l.yandex.mo1546l() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) c11644l.f23361l;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fCrashlytics = ((C8928l) obj4).yandex.f28296l.crashlytics();
                            int iSmaato2 = AbstractC14055l.smaato(arrayList2);
                            if (1 <= iSmaato2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i4);
                                    float fCrashlytics2 = ((C8928l) obj5).yandex.f28296l.crashlytics();
                                    if (Float.compare(fCrashlytics, fCrashlytics2) < 0) {
                                        obj4 = obj5;
                                        fCrashlytics = fCrashlytics2;
                                    }
                                    if (i4 != iSmaato2) {
                                        i4++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        C8928l c8928l2 = (C8928l) obj;
                        return Float.valueOf(c8928l2 != null ? c8928l2.yandex.f28296l.crashlytics() : 0.0f);
                }
            }
        });
        final int i3 = 1;
        this.f23362l = AbstractC9968l.crashlytics(3, new Function0(this) { // from class: lٓؒؗ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C11644l f27149l;

            {
                this.f27149l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                Object obj = null;
                int i5 = 1;
                C11644l c11644l = this.f27149l;
                switch (i4) {
                    case 0:
                        ArrayList arrayList = (ArrayList) c11644l.f23361l;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fMo1546l = ((C8928l) obj2).yandex.mo1546l();
                            int iSmaato = AbstractC14055l.smaato(arrayList);
                            if (1 <= iSmaato) {
                                while (true) {
                                    Object obj3 = arrayList.get(i5);
                                    float fMo1546l2 = ((C8928l) obj3).yandex.mo1546l();
                                    if (Float.compare(fMo1546l, fMo1546l2) < 0) {
                                        obj2 = obj3;
                                        fMo1546l = fMo1546l2;
                                    }
                                    if (i5 != iSmaato) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        C8928l c8928l = (C8928l) obj;
                        return Float.valueOf(c8928l != null ? c8928l.yandex.mo1546l() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) c11644l.f23361l;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fCrashlytics = ((C8928l) obj4).yandex.f28296l.crashlytics();
                            int iSmaato2 = AbstractC14055l.smaato(arrayList2);
                            if (1 <= iSmaato2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i5);
                                    float fCrashlytics2 = ((C8928l) obj5).yandex.f28296l.crashlytics();
                                    if (Float.compare(fCrashlytics, fCrashlytics2) < 0) {
                                        obj4 = obj5;
                                        fCrashlytics = fCrashlytics2;
                                    }
                                    if (i5 != iSmaato2) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        C8928l c8928l2 = (C8928l) obj;
                        return Float.valueOf(c8928l2 != null ? c8928l2.yandex.f28296l.crashlytics() : 0.0f);
                }
            }
        });
        C9077l c9077l = c11090l2.loadAd;
        C3625l c3625l3 = AbstractC0255l.yandex;
        ArrayList arrayList = c3625l2.f7565l;
        String str = c3625l2.f7563l;
        C2580l c2580l = C2580l.f5619l;
        List listM4243this = arrayList != null ? AbstractC16901l.m4243this(arrayList, new C13617l(9)) : c2580l;
        ArrayList arrayList2 = new ArrayList();
        C11315l c11315l = new C11315l();
        int size = listM4243this.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            C15012l c15012l = (C15012l) listM4243this.get(i4);
            C15012l c15012lYandex = C15012l.yandex(c15012l, c9077l.yandex((C9077l) c15012l.yandex), i2, i2, 14);
            Object obj = c15012lYandex.yandex;
            int i6 = c15012lYandex.crashlytics;
            int i7 = c15012lYandex.loadAd;
            while (i5 < i7 && !c11315l.isEmpty()) {
                C15012l c15012l2 = (C15012l) c11315l.last();
                listM4243this = listM4243this;
                int i8 = c15012l2.crashlytics;
                c2580l = c2580l;
                Object obj2 = c15012l2.yandex;
                if (i7 < i8) {
                    arrayList2.add(new C15012l(obj2, i5, i7));
                    i5 = i7;
                } else {
                    int i9 = size;
                    arrayList2.add(new C15012l(obj2, i5, i8));
                    i5 = c15012l2.crashlytics;
                    while (!c11315l.isEmpty() && i5 == ((C15012l) c11315l.last()).crashlytics) {
                        c11315l.removeLast();
                    }
                    size = i9;
                }
            }
            List list2 = listM4243this;
            C2580l c2580l2 = c2580l;
            int i10 = size;
            if (i5 < i7) {
                arrayList2.add(new C15012l(c9077l, i5, i7));
                i5 = i7;
            }
            C15012l c15012l3 = (C15012l) c11315l.applovin();
            if (c15012l3 != null) {
                int i11 = c15012l3.crashlytics;
                Object obj3 = c15012l3.yandex;
                int i12 = c15012l3.loadAd;
                if (i12 == i7 && i11 == i6) {
                    c11315l.removeLast();
                    c11315l.addLast(new C15012l(((C9077l) obj3).yandex((C9077l) obj), i7, i6));
                } else if (i12 == i11) {
                    arrayList2.add(new C15012l(obj3, i12, i11));
                    c11315l.removeLast();
                    c11315l.addLast(new C15012l(obj, i7, i6));
                } else {
                    if (i11 < i6) {
                        C11983l.crashlytics();
                        throw null;
                    }
                    c11315l.addLast(new C15012l(((C9077l) obj3).yandex((C9077l) obj), i7, i6));
                }
            } else {
                c11315l.addLast(new C15012l(obj, i7, i6));
            }
            i4++;
            listM4243this = list2;
            c2580l = c2580l2;
            size = i10;
            i2 = 0;
        }
        C2580l c2580l3 = c2580l;
        while (i5 <= str.length() && !c11315l.isEmpty()) {
            C15012l c15012l4 = (C15012l) c11315l.last();
            Object obj4 = c15012l4.yandex;
            int i13 = c15012l4.crashlytics;
            arrayList2.add(new C15012l(obj4, i5, i13));
            while (!c11315l.isEmpty() && i13 == ((C15012l) c11315l.last()).crashlytics) {
                c11315l.removeLast();
            }
            i5 = i13;
        }
        if (i5 < str.length()) {
            arrayList2.add(new C15012l(c9077l, i5, str.length()));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new C15012l(c9077l, 0, 0));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int i14 = i;
        for (int size2 = arrayList2.size(); i14 < size2; size2 = size2) {
            C15012l c15012l5 = (C15012l) arrayList2.get(i14);
            int i15 = c15012l5.loadAd;
            int i16 = c15012l5.crashlytics;
            String strSubstring = i15 != i16 ? str.substring(i15, i16) : "";
            List listYandex = AbstractC0255l.yandex(c3625l2, i15, i16, new C13206l(12));
            C3625l c3625l4 = new C3625l(strSubstring, listYandex == null ? c2580l3 : listYandex);
            C9077l c9077l2 = (C9077l) c15012l5.yandex;
            if (c9077l2.loadAd == 0) {
                c9077l2 = new C9077l(c9077l2.yandex, c9077l.loadAd, c9077l2.crashlytics, c9077l2.amazon, c9077l2.purchase, c9077l2.billing, c9077l2.mopub, c9077l2.admob, c9077l2.subs);
            }
            C11090l c11090l3 = new C11090l(c11090l2.yandex, c9077l.yandex(c9077l2));
            List list3 = c3625l4.f7564l;
            List list4 = list3 == null ? c2580l3 : list3;
            List list5 = (List) this.f23357l;
            ArrayList arrayList4 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i17 = 0;
            while (i17 < size3) {
                C15012l c15012l6 = (C15012l) list5.get(i17);
                int i18 = c15012l6.loadAd;
                C9077l c9077l3 = c9077l;
                int i19 = c15012l6.crashlytics;
                if (AbstractC0255l.loadAd(i15, i16, i18, i19)) {
                    if (i15 > i18 || i19 > i16) {
                        AbstractC1786l.yandex("placeholder can not overlap with paragraph.");
                    }
                    arrayList4.add(new C15012l(c15012l6.yandex, i18 - i15, i19 - i15));
                }
                i17++;
                list5 = list5;
                c9077l = c9077l3;
            }
            arrayList3.add(new C8928l(new C14442l(strSubstring, c11090l3, list4, arrayList4, interfaceC16061l, interfaceC13490l), i15, i16));
            i14++;
            c3625l2 = c3625l;
            c11090l2 = c11090l;
            str = str;
        }
        this.f23361l = arrayList3;
    }

    /* JADX INFO: renamed from: lؑٞۘ, reason: contains not printable characters */
    public static C11644l m3137l(String str, AbstractC15257l abstractC15257l, C18176l c18176l, C9358l c9358l, Integer num) throws GeneralSecurityException {
        C9358l c9358l2 = C9358l.purchase;
        if (num != null && c9358l.equals(c9358l2)) {
            C18262l.ads("Cannot set idRequirement for OutputPrefixType RAW");
            return null;
        }
        if (num == null && !c9358l.equals(c9358l2)) {
            C18262l.ads("Cannot have null idRequirement unless OutputPrefixType is RAW");
            return null;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new GeneralSecurityException("typeURL " + str + " contains non-ascii character at position " + i);
            }
        }
        return new C11644l(str, abstractC15257l, c18176l, c9358l, num, 25);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00de, code lost:
    
        if (r13 == r5) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX INFO: renamed from: lؑۨٝ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m3138l(defpackage.C11644l r9, android.content.Context r10, defpackage.AbstractC18643l r11, defpackage.C18554l r12, defpackage.AbstractC0283l r13) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11644l.m3138l(lُِؗ, android.content.Context, lۡۨ, lۙۨ, lّؑۧ):java.lang.Object");
    }

    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public static int m3139l(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0043 A[Catch: all -> 0x0034, TRY_ENTER, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x0030, B:35:0x0079, B:26:0x004f, B:28:0x0055, B:29:0x0059, B:31:0x005d, B:32:0x0068, B:22:0x0043, B:25:0x004c, B:19:0x003c), top: B:40:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    /* JADX WARN: Code duplicated, block: B:25:0x004c A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x0030, B:35:0x0079, B:26:0x004f, B:28:0x0055, B:29:0x0059, B:31:0x005d, B:32:0x0068, B:22:0x0043, B:25:0x004c, B:19:0x003c), top: B:40:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0055 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x0030, B:35:0x0079, B:26:0x004f, B:28:0x0055, B:29:0x0059, B:31:0x005d, B:32:0x0068, B:22:0x0043, B:25:0x004c, B:19:0x003c), top: B:40:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x005d A[Catch: all -> 0x0034, LOOP:0: B:29:0x0059->B:31:0x005d, LOOP_END, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x0030, B:35:0x0079, B:26:0x004f, B:28:0x0055, B:29:0x0059, B:31:0x005d, B:32:0x0068, B:22:0x0043, B:25:0x004c, B:19:0x003c), top: B:40:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0076 -> B:35:0x0079). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:22:0x0043
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: lؚؚؔ, reason: contains not printable characters */
    public static final void m3140l(defpackage.C11644l r7, defpackage.AbstractC0283l r8) {
        /*
            java.lang.Object r0 = r7.f23360l
            lؚؚۖ r0 = (defpackage.C7119l) r0
            java.lang.Object r1 = r7.f23362l
            lُۚٞ r1 = (defpackage.C11315l) r1
            boolean r2 = r8 instanceof defpackage.C16906l
            if (r2 == 0) goto L1b
            r2 = r8
            lٗؖٝ r2 = (defpackage.C16906l) r2
            int r3 = r2.f32969l
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f32969l = r3
            goto L20
        L1b:
            lٗؖٝ r2 = new lٗؖٝ
            r2.<init>(r7, r8)
        L20:
            java.lang.Object r8 = r2.f32970l
            int r3 = r2.f32969l
            lٍؗؐ r4 = defpackage.EnumC9342l.f19165l
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L40
            if (r3 == r6) goto L3c
            if (r3 != r5) goto L36
            int r3 = r2.f32971l
            defpackage.AbstractC2829l.crashlytics(r8)     // Catch: java.lang.Throwable -> L34
            goto L79
        L34:
            r8 = move-exception
            goto L7e
        L36:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r7)
            return
        L3c:
            defpackage.AbstractC2829l.crashlytics(r8)     // Catch: java.lang.Throwable -> L34
            goto L4c
        L40:
            defpackage.AbstractC2829l.crashlytics(r8)
        L43:
            r2.f32969l = r6     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r0.Signature(r2)     // Catch: java.lang.Throwable -> L34
            if (r8 != r4) goto L4c
            goto L78
        L4c:
            r1.addLast(r8)     // Catch: java.lang.Throwable -> L34
        L4f:
            boolean r8 = r1.isEmpty()     // Catch: java.lang.Throwable -> L34
            if (r8 != 0) goto L43
            java.lang.Object r8 = r0.tapsense()     // Catch: java.lang.Throwable -> L34
        L59:
            boolean r3 = r8 instanceof defpackage.C15230l     // Catch: java.lang.Throwable -> L34
            if (r3 != 0) goto L68
            defpackage.C0381l.loadAd(r8)     // Catch: java.lang.Throwable -> L34
            r1.addLast(r8)     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r0.tapsense()     // Catch: java.lang.Throwable -> L34
            goto L59
        L68:
            int r3 = r1.f22809l     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r7.f23357l     // Catch: java.lang.Throwable -> L34
            lٔ٘۠ r8 = (defpackage.C14959l) r8     // Catch: java.lang.Throwable -> L34
            r2.f32971l = r3     // Catch: java.lang.Throwable -> L34
            r2.f32969l = r5     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r8.invoke(r1, r2)     // Catch: java.lang.Throwable -> L34
            if (r8 != r4) goto L79
        L78:
            return
        L79:
            int r8 = r1.f22809l     // Catch: java.lang.Throwable -> L34
            if (r3 != r8) goto L4f
            goto L43
        L7e:
            r7.m3158l(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11644l.m3140l(lُِؗ, lّؑۧ):void");
    }

    /* JADX INFO: renamed from: lًَۙ, reason: contains not printable characters */
    public static void m3141l(int i, int i2, int i3, int[] iArr) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5);
                i2++;
            }
            return;
        }
        if (i != -1) {
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = ((i5 >> 10) & 31) | ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5);
            i2++;
        }
    }

    @Override // defpackage.InterfaceC9814l
    public void Signature(InterfaceC13521l interfaceC13521l) {
        ((C9928l) this.f23358l).Signature(interfaceC13521l);
        ((ArrayList) this.f23361l).add(interfaceC13521l);
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: abstract */
    public void mo1662abstract() {
        ((C12714l) this.f23357l).mo1662abstract();
        C12714l c12714l = (C12714l) this.f23360l;
        ((HashMap) c12714l.f25074l).put((C3498l) this.f23362l, new C18438l((InterfaceC1910l) AbstractC16901l.m4208abstract((ArrayList) this.f23361l)));
    }

    @Override // defpackage.InterfaceC9814l
    public int ad() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).ad();
    }

    @Override // defpackage.InterfaceC9814l
    public void adcel() {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).adcel();
        ((ArrayList) this.f23362l).clear();
    }

    @Override // defpackage.InterfaceC9814l
    public int admob() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).admob();
    }

    @Override // defpackage.InterfaceC9814l
    public void ads(boolean z) {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).ads(z);
    }

    @Override // defpackage.InterfaceC9814l
    public C15074l advert() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).advert();
    }

    @Override // defpackage.InterfaceC9814l
    public boolean amazon() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).amazon();
    }

    @Override // defpackage.InterfaceC9814l
    public C13736l applovin() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).applovin();
    }

    @Override // defpackage.InterfaceC9814l
    public void appmetrica(int i, boolean z) {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).appmetrica(i, z);
    }

    @Override // defpackage.InterfaceC9814l
    public C1372l billing() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).billing();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: break */
    public void mo2748break(C13736l c13736l, boolean z) {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2748break(c13736l, z);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: case */
    public void mo2749case() {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2749case();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: catch */
    public void mo2750catch(SurfaceHolder surfaceHolder) {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2750catch(surfaceHolder);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: class */
    public void mo2751class(int i) {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2751class(i);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: const */
    public void mo2752const(int i) {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2752const(i);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: continue */
    public void mo2753continue(boolean z) {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2753continue(z);
    }

    @Override // defpackage.InterfaceC9814l
    public void crashlytics(float f) {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).crashlytics(f);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: default */
    public void mo2754default(int i, List list) {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2754default(i, list);
        ((ArrayList) this.f23362l).addAll(i, list);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: else */
    public void mo2755else(float f) {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2755else(f);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: extends */
    public void mo2756extends(int i) {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2756extends(i);
        ((ArrayList) this.f23362l).remove(i);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: final */
    public void mo2757final() {
        ((C9928l) this.f23358l).mo2757final();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: finally */
    public boolean mo2758finally() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).mo2758finally();
    }

    @Override // defpackage.InterfaceC9814l
    public long firebase() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).firebase();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: for */
    public void mo2759for(long j) {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2759for(j);
    }

    @Override // defpackage.InterfaceC15897l
    public Object get() {
        switch (this.f23359l) {
            case 11:
                return new C5379l((Executor) ((InterfaceC15897l) this.f23358l).get(), (C2690l) ((InterfaceC15897l) this.f23357l).get(), (C10111l) ((C12418l) this.f23361l).get(), (C16163l) ((InterfaceC15897l) this.f23360l).get(), (C16163l) ((InterfaceC15897l) this.f23362l).get());
            default:
                return new C0732l((C3982l) ((InterfaceC15897l) this.f23358l).get(), (InterfaceC6095l) ((InterfaceC15897l) this.f23357l).get(), (C6579l) ((InterfaceC15897l) this.f23361l).get(), (C13335l) ((InterfaceC15897l) this.f23360l).get(), (C2072l) ((InterfaceC2661l) this.f23362l).get());
        }
    }

    @Override // defpackage.InterfaceC9814l
    public long getDuration() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).getDuration();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: goto */
    public void mo2760goto() {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2760goto();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: implements */
    public int mo2761implements() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).mo2761implements();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: import */
    public C1047l mo2762import() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).mo2762import();
    }

    @Override // defpackage.InterfaceC9814l
    public C2848l inmobi() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).inmobi();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: instanceof */
    public boolean mo2763instanceof() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).mo2763instanceof();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: interface */
    public long mo2764interface() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).mo2764interface();
    }

    @Override // defpackage.InterfaceC9814l
    public long isPro() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).isPro();
    }

    @Override // defpackage.InterfaceC9814l
    public void isVip() {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).isVip();
    }

    @Override // defpackage.InterfaceC9814l
    public int license() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).license();
    }

    @Override // defpackage.InterfaceC9814l
    public void loadAd(C1372l c1372l) {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).loadAd(c1372l);
    }

    /* JADX INFO: renamed from: lؑؓۙ, reason: contains not printable characters */
    public void m3142l(InterfaceC2262l interfaceC2262l, C12125l c12125l, C2063l c2063l, C2063l c2063l2, boolean z) {
        AbstractC10999l.mopub(interfaceC2262l, ExecutorC6708l.f14063l, 0, new C10059l(z, this, c12125l, c2063l2, AbstractC10999l.mopub(interfaceC2262l, AbstractC11463l.yandex, 0, new C11039l(c2063l, null, 4), 2), null), 2);
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: lًؑٝ */
    public void mo1664l(C3498l c3498l, C3624l c3624l, C3498l c3498l2) {
        ((C12714l) this.f23358l).mo1664l(c3498l, c3624l, c3498l2);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؚۣؒ */
    public void mo2765l() {
        ((C9928l) this.f23358l).mo2765l();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lۣؒٞ */
    public C4970l mo2766l() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).mo2766l();
    }

    /* JADX INFO: renamed from: lؒۜۡ, reason: contains not printable characters */
    public C6507l m3143l() {
        return new C6507l(AbstractC18296l.admob((ArrayList) this.f23361l), AbstractC18296l.admob((ArrayList) this.f23358l), AbstractC18296l.admob((ArrayList) this.f23357l), AbstractC18296l.admob((ArrayList) this.f23360l), AbstractC18296l.admob((ArrayList) this.f23362l));
    }

    /* JADX INFO: renamed from: lؒۡۦ, reason: contains not printable characters */
    public boolean m3144l(InterfaceC12641l interfaceC12641l) {
        return !(((C7119l) this.f23360l).amazon(interfaceC12641l) instanceof C15230l);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؒۢۜ */
    public void mo2767l(C2427l c2427l) {
        ArrayList arrayList = (ArrayList) this.f23362l;
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2767l(c2427l);
        arrayList.clear();
        arrayList.add(c2427l);
    }

    /* JADX INFO: renamed from: lؒۨٓ, reason: contains not printable characters */
    public void m3145l(String str, AbstractC10033l abstractC10033l) {
        if (str.length() <= 0) {
            C8339l.metrica("method.isEmpty() == true");
            return;
        }
        if (abstractC10033l == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                C10754l.metrica(AbstractC15560l.Signature("method ", str, " must have a request body."));
                return;
            }
        } else if (!AbstractC3670l.purchase(str)) {
            C10754l.metrica(AbstractC15560l.Signature("method ", str, " must not have a request body."));
            return;
        }
        this.f23357l = str;
        this.f23360l = abstractC10033l;
    }

    @Override // defpackage.InterfaceC4452l
    /* JADX INFO: renamed from: lؘؓؖ */
    public boolean mo1545l() {
        ArrayList arrayList = (ArrayList) this.f23361l;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C8928l) arrayList.get(i)).yandex.mo1545l()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lٜؓ۠ */
    public void mo2768l(List list) {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2768l(list);
        ((ArrayList) this.f23362l).addAll(list);
    }

    /* JADX INFO: renamed from: lؓۚ۟, reason: contains not printable characters */
    public void m3146l(InterfaceC0914l interfaceC0914l, InterfaceC1388l interfaceC1388l) {
        ((ArrayList) this.f23360l).add(new C12242l(interfaceC0914l, interfaceC1388l, 5));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX INFO: renamed from: lٕؓۡ, reason: contains not printable characters */
    public Bidi m3147l(int i) {
        Bidi bidi;
        Layout layout = (Layout) this.f23358l;
        ArrayList arrayList = (ArrayList) this.f23361l;
        ArrayList arrayList2 = (ArrayList) this.f23357l;
        boolean[] zArr = (boolean[]) this.f23360l;
        if (zArr[i]) {
            return (Bidi) arrayList2.get(i);
        }
        int iIntValue = i == 0 ? 0 : ((Number) arrayList.get(i - 1)).intValue();
        int iIntValue2 = ((Number) arrayList.get(i)).intValue();
        int i2 = iIntValue2 - iIntValue;
        char[] cArr = (char[]) this.f23362l;
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i2)) {
            bidi = new Bidi(cArr2, 0, null, 0, i2, layout.getParagraphDirection(layout.getLineForOffset(m3150l(i))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        arrayList2.set(i, bidi);
        zArr[i] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.f23362l;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.f23362l = cArr2;
        return bidi;
    }

    /* JADX INFO: renamed from: lؓۤٚ, reason: contains not printable characters */
    public void m3148l(C7323l c7323l, InterfaceC1388l interfaceC1388l) {
        ((ArrayList) this.f23357l).add(new C8195l(c7323l, interfaceC1388l));
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؙؔؑ */
    public void mo2769l(List list) {
        ArrayList arrayList = (ArrayList) this.f23362l;
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2769l(list);
        arrayList.clear();
        arrayList.addAll(list);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؔٙؕ */
    public int mo2770l() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).mo2770l();
    }

    /* JADX INFO: renamed from: lؔۥ٘, reason: contains not printable characters */
    public void m3149l(InterfaceC18690l interfaceC18690l, InterfaceC18690l interfaceC18690l2, C3716l c3716l, C3716l c3716l2, Map.Entry entry) {
        C3716l c3716l3 = (C3716l) entry.getValue();
        AbstractC5088l.yandex("DualSurfaceProcessorNode", "     -> outputEdge = " + c3716l3);
        C2005l c2005l = new C2005l(c3716l.mopub.yandex, ((C18187l) entry.getKey()).yandex.amazon, c3716l.crashlytics ? interfaceC18690l : null, ((C18187l) entry.getKey()).yandex.billing, ((C18187l) entry.getKey()).yandex.mopub);
        C2005l c2005l2 = new C2005l(c3716l2.mopub.yandex, ((C18187l) entry.getKey()).loadAd.amazon, c3716l2.crashlytics ? interfaceC18690l2 : null, ((C18187l) entry.getKey()).loadAd.billing, ((C18187l) entry.getKey()).loadAd.mopub);
        int i = ((C18187l) entry.getKey()).yandex.crashlytics;
        c3716l3.getClass();
        AbstractC12225l.crashlytics();
        c3716l3.loadAd();
        AbstractC5641l.purchase("Consumer can only be linked once.", !c3716l3.isPro);
        c3716l3.isPro = true;
        C10500l c10500l = c3716l3.smaato;
        RunnableC9823l runnableC9823lSmaato = AbstractC11356l.smaato(c10500l.crashlytics(), new C11573l(c3716l3, c10500l, i, c2005l, c2005l2), AbstractC12272l.admob());
        runnableC9823lSmaato.yandex(new RunnableC9929l(runnableC9823lSmaato, new C3797l(this, c3716l3), 0), AbstractC12272l.admob());
    }

    /* JADX INFO: renamed from: lؖٔؓ, reason: contains not printable characters */
    public int m3150l(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f23361l).get(i - 1)).intValue();
    }

    @Override // defpackage.InterfaceC0478l
    /* JADX INFO: renamed from: lٖؖ۠ */
    public InterfaceC15189l mo619l(Class cls) {
        return mo621l(C12638l.yandex(cls));
    }

    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    public int m3151l(int i, boolean z) {
        ArrayList arrayList = (ArrayList) this.f23361l;
        int iAmazon = AbstractC14055l.amazon(arrayList, Integer.valueOf(i));
        int i2 = iAmazon < 0 ? -(iAmazon + 1) : iAmazon + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: lٍؖۜ, reason: contains not printable characters */
    public Object m3152l(AbstractC0283l abstractC0283l) throws Throwable {
        C2537l c2537l;
        InterfaceC1601l interfaceC1601l;
        int i;
        Throwable th;
        InterfaceC1601l interfaceC1601l2;
        C9426l c9426l = (C9426l) this.f23357l;
        if (abstractC0283l instanceof C2537l) {
            c2537l = (C2537l) abstractC0283l;
            int i2 = c2537l.f5519l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2537l.f5519l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c2537l = new C2537l(this, abstractC0283l);
            }
        } else {
            c2537l = new C2537l(this, abstractC0283l);
        }
        Object obj = c2537l.f5522l;
        int i3 = c2537l.f5519l;
        Object obj2 = EnumC9342l.f19165l;
        try {
            if (i3 == 0) {
                AbstractC2829l.crashlytics(obj);
                if (c9426l.mo2155l()) {
                    return Unit.INSTANCE;
                }
                interfaceC1601l = (C4910l) this.f23358l;
                c2537l.f5521l = interfaceC1601l;
                i = 0;
                c2537l.f5520l = 0;
                c2537l.f5519l = 1;
                if (interfaceC1601l.yandex(c2537l) != obj2) {
                }
                return obj2;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC1601l2 = c2537l.f5521l;
                try {
                    AbstractC2829l.crashlytics(obj);
                    Unit unit = Unit.INSTANCE;
                    c9426l.m3885new(unit);
                    interfaceC1601l2.billing(null);
                    return unit;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC1601l2.billing(null);
                    throw th;
                }
            }
            i = c2537l.f5520l;
            InterfaceC1601l interfaceC1601l3 = c2537l.f5521l;
            AbstractC2829l.crashlytics(obj);
            interfaceC1601l = interfaceC1601l3;
            if (c9426l.mo2155l()) {
                Unit unit2 = Unit.INSTANCE;
                interfaceC1601l.billing(null);
                return unit2;
            }
            c2537l.f5521l = interfaceC1601l;
            c2537l.f5520l = i;
            c2537l.f5519l = 2;
            if (m3153l(c2537l) != obj2) {
                interfaceC1601l2 = interfaceC1601l;
                Unit unit3 = Unit.INSTANCE;
                c9426l.m3885new(unit3);
                interfaceC1601l2.billing(null);
                return unit3;
            }
            return obj2;
        } catch (Throwable th3) {
            InterfaceC1601l interfaceC1601l4 = interfaceC1601l;
            th = th3;
            interfaceC1601l2 = interfaceC1601l4;
            interfaceC1601l2.billing(null);
            throw th;
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lّؗؑ */
    public long mo2771l() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).mo2771l();
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: lؗۨؑ */
    public void mo1665l(C3498l c3498l, Object obj) {
        ((C12714l) this.f23358l).mo1665l(c3498l, obj);
    }

    @Override // defpackage.InterfaceC4452l
    /* JADX INFO: renamed from: lٍؘؘ */
    public float mo1546l() {
        return ((Number) ((InterfaceC1220l) this.f23360l).getValue()).floatValue();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؘِٞ */
    public void mo2772l(int i) {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2772l(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: lؘٞۨ, reason: contains not printable characters */
    public Object m3153l(AbstractC0283l abstractC0283l) throws Throwable {
        C4814l c4814l;
        C0360l c0360l = (C0360l) this.f23362l;
        if (abstractC0283l instanceof C4814l) {
            c4814l = (C4814l) abstractC0283l;
            int i = c4814l.f9858l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c4814l.f9858l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c4814l = new C4814l(this, abstractC0283l);
            }
        } else {
            c4814l = new C4814l(this, abstractC0283l);
        }
        Object obj = c4814l.f9857l;
        int i2 = c4814l.f9858l;
        if (i2 != 0) {
            if (i2 == 1) {
                AbstractC2829l.crashlytics(obj);
            } else {
                if (i2 != 2) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
            }
            return Unit.INSTANCE;
        }
        AbstractC2829l.crashlytics(obj);
        c4814l.f9858l = 1;
        obj = null;
        InterfaceC12932l interfaceC12932l = (InterfaceC12932l) this.f23361l;
        C6637l c6637l = new C6637l(c0360l, (InterfaceC8282l) obj, this, (InterfaceC14029l) null);
        c4814l.f9858l = 2;
        Object objFirebase = AbstractC10999l.firebase(interfaceC12932l, c6637l, c4814l);
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (objFirebase == enumC9342l) {
            return enumC9342l;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: lؘۛؕ */
    public void mo1666l(C3498l c3498l, C14700l c14700l) {
        ((C12714l) this.f23358l).mo1666l(c3498l, c14700l);
    }

    /* JADX INFO: renamed from: lؘۦۧ, reason: contains not printable characters */
    public void m3154l(String str, String str2) {
        ((C16543l) this.f23361l).signatures(str, str2);
    }

    /* JADX INFO: renamed from: lؙؕؕ, reason: contains not printable characters */
    public long m3155l() {
        return ((C9735l) ((C10086l) this.f23361l).getValue()).yandex;
    }

    /* JADX INFO: renamed from: lؙؗٗ, reason: contains not printable characters */
    public InterfaceC3263l m3156l(AbstractC7910l abstractC7910l, Function0 function0) {
        int i;
        int i2;
        C9987l c9987l = new C9987l();
        c9987l.f20387l = -1;
        synchronized (this.f23358l) {
            Throwable th = (Throwable) this.f23357l;
            if (th != null) {
                abstractC7910l.loadAd(th);
                return C6928l.f14501l;
            }
            C12633l c12633l = (C12633l) this.f23361l;
            do {
                i = c12633l.get();
                i2 = i + 1;
            } while (!c12633l.compareAndSet(i, i2));
            boolean z = true;
            if ((134217727 & i2) != 1) {
                z = false;
            }
            c9987l.f20387l = (i2 >>> 27) & 15;
            ((C12463l) this.f23360l).yandex(abstractC7910l);
            if (z && function0 != null) {
                try {
                    function0.invoke();
                } catch (Throwable th2) {
                    m3164l(th2);
                }
            }
            return new C13568l(new Cfinally(abstractC7910l, this, c9987l, 2));
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؙٗۛ */
    public void mo2773l() {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2773l();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؙ۟ٙ */
    public C3852l mo2774l() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).mo2774l();
    }

    /* JADX INFO: renamed from: lؙؚؚ, reason: contains not printable characters */
    public void m3157l(String str) {
        if (AbstractC16648l.isVip(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (AbstractC16648l.isVip(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        C13170l c13170l = new C13170l();
        c13170l.isPro(null, str);
        this.f23358l = c13170l.crashlytics();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lٍؚۖ */
    public long mo2775l() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).mo2775l();
    }

    /* JADX INFO: renamed from: lؚۥۚ, reason: contains not printable characters */
    public void m3158l(Throwable th) {
        C11315l c11315l = (C11315l) this.f23362l;
        C7119l c7119l = (C7119l) this.f23360l;
        if (c7119l.firebase(th, false)) {
            for (Object objTapsense = c7119l.tapsense(); !(objTapsense instanceof C15230l); objTapsense = c7119l.tapsense()) {
                C0381l.loadAd(objTapsense);
                c11315l.addLast(objTapsense);
            }
            if (c11315l.isEmpty()) {
                return;
            }
            ((Function1) this.f23358l).invoke(new ArrayList(c11315l));
            c11315l.clear();
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؚۦ۠ */
    public void mo2776l(C2427l c2427l) {
        ArrayList arrayList = (ArrayList) this.f23362l;
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2776l(c2427l);
        arrayList.clear();
        arrayList.add(c2427l);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lًَٙ */
    public boolean mo2777l() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).mo2777l();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lًٚٔ */
    public C2427l mo2778l() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).mo2778l();
    }

    /* JADX INFO: renamed from: lًٖۘ, reason: contains not printable characters */
    public boolean m3159l(float[] fArr) {
        C10060l[] c10060lArr = (C10060l[]) this.f23360l;
        if (c10060lArr != null && c10060lArr.length > 0) {
            for (C10060l c10060l : c10060lArr) {
                c10060l.getClass();
                float f = fArr[2];
                if (f < 0.95f && f > 0.05f) {
                    float f2 = fArr[0];
                    if (f2 < 10.0f || f2 > 37.0f || fArr[1] > 0.82f) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: lٌّۡ */
    public InterfaceC12997l mo1667l(C3498l c3498l) {
        return ((C12714l) this.f23358l).mo1667l(c3498l);
    }

    /* JADX INFO: renamed from: lٌٔٞ, reason: contains not printable characters */
    public int m3160l(int i, int i2) {
        while (i > i2) {
            char cCharAt = ((Layout) this.f23358l).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((AbstractC8576l.subs(cCharAt, 8192) < 0 || AbstractC8576l.subs(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    /* JADX INFO: renamed from: lًٍّ, reason: contains not printable characters */
    public C5198l m3161l() {
        return (C5198l) ((C1008l) this.f23362l).getValue();
    }

    /* JADX INFO: renamed from: lٍٙؐ, reason: contains not printable characters */
    public void m3162l(C1501l c1501l, InterfaceC1388l interfaceC1388l) {
        ((ArrayList) this.f23358l).add(new C8195l(c1501l, interfaceC1388l));
    }

    /* JADX INFO: renamed from: lٍ۟ۨ, reason: contains not printable characters */
    public void m3163l(Function1 function1) {
        int i;
        synchronized (this.f23358l) {
            try {
                C12463l c12463l = (C12463l) this.f23360l;
                this.f23360l = (C12463l) this.f23362l;
                this.f23362l = c12463l;
                C12633l c12633l = (C12633l) this.f23361l;
                do {
                    i = c12633l.get();
                } while (!c12633l.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = c12463l.loadAd;
                for (int i3 = 0; i3 < i2; i3++) {
                    function1.invoke(c12463l.admob(i3));
                }
                c12463l.billing();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lٍۤٙ */
    public boolean mo2779l(int i) {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).mo2779l(i);
    }

    /* JADX INFO: renamed from: lَٜؑ, reason: contains not printable characters */
    public void m3164l(Throwable th) {
        int i;
        synchronized (this.f23358l) {
            try {
                if (((Throwable) this.f23357l) != null) {
                    return;
                }
                this.f23357l = th;
                C12463l c12463l = (C12463l) this.f23360l;
                Object[] objArr = c12463l.yandex;
                int i2 = c12463l.loadAd;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((AbstractC7910l) objArr[i3]).loadAd(th);
                }
                ((C12463l) this.f23360l).billing();
                C12633l c12633l = (C12633l) this.f23361l;
                do {
                    i = c12633l.get();
                } while (!c12633l.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public float m3165l(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        Layout layout = (Layout) this.f23358l;
        if (!z2) {
            return m3174l(i, z);
        }
        int iBilling = AbstractC10478l.billing(layout, i, z2);
        int lineStart = layout.getLineStart(iBilling);
        int lineEnd = layout.getLineEnd(iBilling);
        if (i != lineStart && i != lineEnd) {
            return m3174l(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return m3174l(i, z);
        }
        int iM3151l = m3151l(i, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(m3150l(iM3151l))) == -1;
        int iM3160l = m3160l(lineEnd, lineStart);
        int iM3150l = m3150l(iM3151l);
        int i4 = lineStart - iM3150l;
        int i5 = iM3160l - iM3150l;
        Bidi bidiM3147l = m3147l(iM3151l);
        Bidi bidiCreateLineBidi = bidiM3147l != null ? bidiM3147l.createLineBidi(i4, i5) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == zIsRtlCharAt) {
                z3 = !z3;
            }
            return i == lineStart ? z3 : !z3 ? layout.getLineLeft(iBilling) : layout.getLineRight(iBilling);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        C6793l[] c6793lArr = new C6793l[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            c6793lArr[i6] = new C6793l(bidiCreateLineBidi.getRunStart(i6) + lineStart, bidiCreateLineBidi.getRunLimit(i6) + lineStart, bidiCreateLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) bidiCreateLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, c6793lArr, 0, runCount);
        if (i == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (c6793lArr[i8].yandex == i) {
                    i3 = i8;
                    break;
                }
                i8++;
            }
            boolean z4 = (z || z3 == c6793lArr[i3].crashlytics) ? !z3 : z3;
            if (i3 == 0 && z4) {
                return layout.getLineLeft(iBilling);
            }
            if (i3 != runCount - 1 || z4) {
                return z4 ? layout.getPrimaryHorizontal(c6793lArr[i3 - 1].yandex) : layout.getPrimaryHorizontal(c6793lArr[i3 + 1].yandex);
            }
            return layout.getLineRight(iBilling);
        }
        int iM3160l2 = i > iM3160l ? m3160l(i, lineStart) : i;
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i2 = -1;
                break;
            }
            if (c6793lArr[i9].loadAd == iM3160l2) {
                i2 = i9;
                break;
            }
            i9++;
        }
        boolean z5 = (z || z3 == c6793lArr[i2].crashlytics) ? z3 : !z3;
        if (i2 == 0 && z5) {
            return layout.getLineLeft(iBilling);
        }
        if (i2 != runCount - 1 || z5) {
            return z5 ? layout.getPrimaryHorizontal(c6793lArr[i2 - 1].loadAd) : layout.getPrimaryHorizontal(c6793lArr[i2 + 1].loadAd);
        }
        return layout.getLineRight(iBilling);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lُٔۨ */
    public Looper mo2780l() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).mo2780l();
    }

    /* JADX INFO: renamed from: lٍُۙ, reason: contains not printable characters */
    public void m3166l(String str) {
        ((C16543l) this.f23361l).ad(str);
    }

    /* JADX INFO: renamed from: lُٕۙ, reason: contains not printable characters */
    public void m3167l() {
        this.f23360l = null;
        ((Function0) this.f23357l).invoke();
    }

    /* JADX INFO: renamed from: lِۙٞ, reason: contains not printable characters */
    public Object m3168l(AbstractC0283l abstractC0283l) {
        return AbstractC0622l.firebase(new C10424l((C1008l) this.f23362l, 15), abstractC0283l);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؘْؒ */
    public void mo2781l(int i, long j, List list) {
        ArrayList arrayList = (ArrayList) this.f23362l;
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2781l(i, j, list);
        arrayList.clear();
        arrayList.addAll(list);
    }

    /* JADX INFO: renamed from: lْؕ۠, reason: contains not printable characters */
    public void m3169l(Class cls, String str, InterfaceC10470l interfaceC10470l) {
        ((HashMap) this.f23361l).put(cls, interfaceC10470l);
        if (str != null) {
            ((HashMap) this.f23360l).put(str, cls);
            ((HashMap) this.f23362l).put(cls, str);
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؚْٟ */
    public long mo2782l() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).mo2782l();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lْٓؒ */
    public boolean mo2783l() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).mo2783l();
    }

    /* JADX INFO: renamed from: lْۣٔ, reason: contains not printable characters */
    public C13177l m3170l() {
        C4865l c4865l;
        C6507l c6507l;
        Context context = (Context) this.f23358l;
        C4865l c4865l2 = (C4865l) this.f23357l;
        C13767l c13767l = (C13767l) this.f23362l;
        c13767l.getClass();
        C4865l c4865l3 = new C4865l(c4865l2.yandex, c4865l2.loadAd, c4865l2.crashlytics, c4865l2.amazon, c4865l2.purchase, c4865l2.billing, c4865l2.mopub, c4865l2.admob, c4865l2.subs, c4865l2.isPro, c4865l2.firebase, c4865l2.smaato, c4865l2.remoteconfig, new C3548l(AbstractC18296l.subs(c13767l.yandex)));
        C8688l c8688l = new C8688l(new C8241l(18));
        C8688l c8688l2 = new C8688l(new C7730l(10, this));
        C8688l c8688l3 = (C8688l) this.f23361l;
        if (c8688l3 == null) {
            c8688l3 = new C8688l(new C8241l(19));
        }
        C6507l c6507l2 = (C6507l) this.f23360l;
        if (c6507l2 == null) {
            C2580l c2580l = C2580l.f5619l;
            c6507l = new C6507l(c2580l, c2580l, c2580l, c2580l, c2580l);
            c4865l = c4865l3;
        } else {
            c4865l = c4865l3;
            c6507l = c6507l2;
        }
        return new C13177l(new C13615l(context, c4865l, c8688l, c8688l2, c8688l3, c6507l));
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lْ٘ۚ */
    public void mo2784l(int i, C2427l c2427l) {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2784l(i, c2427l);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lْۥٞ */
    public void mo2785l() {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2785l();
    }

    /* JADX INFO: renamed from: lٖٓۧ, reason: contains not printable characters */
    public byte[] m3171l(byte[] bArr, int i, int i2, byte[] bArr2, C5138l c5138l) {
        int i3 = i;
        if (((i3 >>> i2) << i2) != i3) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        C5138l c5138l2 = new C5138l(c5138l);
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = 1;
            if (i5 >= (1 << i2)) {
                return ((C1943l) linkedList.get(i4)).yandex;
            }
            c5138l2.m1715l(i4);
            int i7 = i3 + i5;
            c5138l2.m1709const(i7);
            C14099l c14099l = (C14099l) this.f23360l;
            C5138l c5138l3 = new C5138l(c5138l2);
            AbstractC6716l abstractC6716l = (AbstractC6716l) c14099l.f27460l;
            int i8 = abstractC6716l.crashlytics;
            byte[][] bArr3 = new byte[i8][];
            int i9 = i4;
            while (i9 < i8) {
                C5138l c5138l4 = new C5138l(c5138l2);
                byte[] bArr4 = (byte[]) c5138l4.f11181l;
                c5138l4.m1715l(5);
                c5138l4.m1709const(c5138l2.m1711goto());
                AbstractC10000l.isPro(i9, 24, bArr4);
                AbstractC10000l.isPro(0, 28, bArr4);
                int i10 = i8;
                byte[][] bArr5 = bArr3;
                byte[] bArrAmazon = abstractC6716l.amazon(c5138l4, bArr2, bArr);
                c5138l4.m1715l(0);
                c5138l4.m1709const(c5138l2.m1711goto());
                AbstractC10000l.isPro(i9, 24, bArr4);
                AbstractC10000l.isPro(0, 28, bArr4);
                int i11 = i9;
                bArr5[i11] = c14099l.loadAd(bArrAmazon, 0, 15, bArr2, c5138l4);
                i9 = i11 + 1;
                bArr3 = bArr5;
                i8 = i10;
                i6 = 1;
            }
            int i12 = i6;
            c5138l3.m1715l(i12);
            c5138l3.m1709const(c5138l2.m1711goto());
            byte[] bArrBilling = abstractC6716l.billing(c5138l3, bArr2, AbstractC14024l.isPro(bArr3));
            c5138l2.m1715l(2);
            c5138l2.m1714l(i12);
            c5138l2.m1717l(i7);
            int i13 = i12;
            while (!linkedList.isEmpty() && ((C1943l) linkedList.get(0)).loadAd == i13) {
                i7 = (i7 - i12) / 2;
                c5138l2.m1717l(i7);
                bArrBilling = ((AbstractC6716l) this.f23361l).loadAd(bArr2, c5138l2, ((C1943l) linkedList.remove(0)).yandex, bArrBilling);
                i13++;
                c5138l2.m1714l(i13);
            }
            linkedList.add(0, new C1943l(bArrBilling, i13));
            i5++;
            i3 = i;
            i4 = 0;
        }
    }

    @Override // defpackage.InterfaceC4452l
    /* JADX INFO: renamed from: lؘْٔ */
    public float mo1547l() {
        return ((Number) ((InterfaceC1220l) this.f23362l).getValue()).floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: lّٔ٘, reason: contains not printable characters */
    public Object m3172l(Bitmap bitmap, C18554l c18554l, AbstractC0283l abstractC0283l) throws Throwable {
        C0905l c0905l;
        C14473l c14473l;
        Bitmap bitmap2;
        int i;
        C14473l c14473l2;
        C11644l c11644l;
        EnumC10468l enumC10468l;
        if (abstractC0283l instanceof C0905l) {
            c0905l = (C0905l) abstractC0283l;
            int i2 = c0905l.f2567l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0905l.f2567l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c0905l = new C0905l(this, abstractC0283l);
            }
        } else {
            c0905l = new C0905l(this, abstractC0283l);
        }
        Object obj = c0905l.f2566l;
        int i3 = c0905l.f2567l;
        InterfaceC14029l interfaceC14029l = null;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(obj);
            int i4 = (c18554l.f36225l || !((enumC10468l = c18554l.f36227l) == EnumC10468l.BEYOND_BACKGROUND || enumC10468l == EnumC10468l.IOS_LAYER_VIEW)) ? 1 : 0;
            EnumC14810l enumC14810l = c18554l.f36222l;
            EnumC14810l enumC14810l2 = EnumC14810l.LIGHT;
            EnumC0972l enumC0972l = c18554l.f36229l;
            if (enumC14810l == enumC14810l2) {
                int iOrdinal = enumC0972l.ordinal();
                if (iOrdinal == 0) {
                    c14473l = C14473l.metrica;
                } else if (iOrdinal == 1) {
                    c14473l = C14473l.firebase;
                } else if (iOrdinal == 2) {
                    c14473l = C14473l.smaato;
                } else if (iOrdinal == 3) {
                    c14473l = C14473l.remoteconfig;
                } else if (iOrdinal == 4) {
                    c14473l = C14473l.vip;
                } else {
                    if (iOrdinal != 5) {
                        C18725l.billing();
                        return null;
                    }
                    c14473l = C14473l.startapp;
                }
            } else {
                int iOrdinal2 = enumC0972l.ordinal();
                if (iOrdinal2 == 0) {
                    c14473l = C14473l.subs;
                } else if (iOrdinal2 == 1) {
                    c14473l = C14473l.purchase;
                } else if (iOrdinal2 == 2) {
                    c14473l = C14473l.billing;
                } else if (iOrdinal2 == 3) {
                    c14473l = C14473l.mopub;
                } else if (iOrdinal2 == 4) {
                    c14473l = C14473l.admob;
                } else {
                    if (iOrdinal2 != 5) {
                        C18725l.billing();
                        return null;
                    }
                    c14473l = C14473l.isPro;
                }
            }
            ((C10086l) this.f23362l).setValue(c14473l);
            if (i4 != 0) {
                Toolkit toolkit = Toolkit.yandex;
                bitmap = Toolkit.yandex(bitmap, AbstractC8576l.billing(c14473l.yandex, new C8934l(0, 25, 1)));
                if (c14473l.crashlytics != 1.0f) {
                    Bitmap bitmapLoadAd = Toolkit.loadAd(bitmap, (float[]) c14473l.amazon.getValue());
                    bitmap.recycle();
                    bitmap = bitmapLoadAd;
                }
            }
            C7545l c7545l = C18718l.purchase;
            c0905l.f2569l = c14473l;
            c0905l.f2568l = bitmap;
            c0905l.f2571l = this;
            c0905l.f2565l = i4;
            c0905l.f2567l = 1;
            Object objFirebase = AbstractC10999l.firebase(AbstractC11463l.yandex, new C11671l(bitmap, interfaceC14029l, 10), c0905l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objFirebase == enumC9342l) {
                return enumC9342l;
            }
            bitmap2 = bitmap;
            i = i4;
            obj = objFirebase;
            c14473l2 = c14473l;
            c11644l = this;
        } else {
            if (i3 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = c0905l.f2565l;
            c11644l = c0905l.f2571l;
            bitmap2 = c0905l.f2568l;
            c14473l2 = c0905l.f2569l;
            AbstractC2829l.crashlytics(obj);
        }
        ((C10086l) c11644l.f23361l).setValue(new C9735l(((C9735l) obj).yandex));
        AbstractC1757l.m1041throw(Math.max(C9735l.admob(m3155l()), Math.max(C9735l.purchase(m3155l()), C9735l.mopub(m3155l()))) >= 0.75f ? AbstractC12953l.firebase(C9735l.loadAd(0.5f, C9735l.loadAd), m3155l()) : m3155l(), (C10086l) this.f23360l);
        if (i != 0) {
            Canvas canvas = new Canvas(bitmap2);
            for (C15024l c15024l : c14473l2.loadAd) {
                C4480l c4480l = (C4480l) this.f23358l;
                c4480l.billing(AbstractC12953l.loadAd(c15024l.yandex));
                c4480l.purchase(c15024l.loadAd);
                canvas.drawPaint(c4480l.yandex);
            }
        }
        return bitmap2;
    }

    /* JADX INFO: renamed from: lٔ٘۠, reason: contains not printable characters */
    public C14113l m3173l() {
        String strConcat = ((AbstractC0958l) this.f23358l) == null ? " surface" : "";
        if (((List) this.f23357l) == null) {
            strConcat = strConcat.concat(" sharedSurfaces");
        }
        if (((Integer) this.f23361l) == null) {
            strConcat = strConcat.concat(" mirrorMode");
        }
        if (((Integer) this.f23360l) == null) {
            strConcat = strConcat.concat(" surfaceGroupId");
        }
        if (((C15421l) this.f23362l) == null) {
            strConcat = strConcat.concat(" dynamicRange");
        }
        if (strConcat.isEmpty()) {
            return new C14113l((AbstractC0958l) this.f23358l, (List) this.f23357l, ((Integer) this.f23361l).intValue(), ((Integer) this.f23360l).intValue(), (C15421l) this.f23362l);
        }
        C8339l.smaato("Missing required properties:".concat(strConcat));
        return null;
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lٔٙٝ */
    public void mo2786l() {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2786l();
    }

    /* JADX INFO: renamed from: lًٔۘ, reason: contains not printable characters */
    public float m3174l(int i, boolean z) {
        Layout layout = (Layout) this.f23358l;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lٍٔ۠ */
    public void mo2787l() {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2787l();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lٕؓٗ */
    public boolean mo2788l() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).mo2788l();
    }

    /* JADX INFO: renamed from: lٕؖؔ, reason: contains not printable characters */
    public C1263l m3175l(Class cls) {
        return mo623l(C12638l.yandex(cls));
    }

    @Override // defpackage.InterfaceC0478l
    /* JADX INFO: renamed from: lٕٕۤ */
    public Set mo620l(C12638l c12638l) {
        if (((Set) this.f23360l).contains(c12638l)) {
            return ((InterfaceC0478l) this.f23362l).mo620l(c12638l);
        }
        C11983l.Signature(c12638l, ">.", "Attempting to request an undeclared dependency Set<");
        return null;
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lٕۗٞ */
    public boolean mo2789l() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).mo2789l();
    }

    /* JADX INFO: renamed from: lٖؐۜ, reason: contains not printable characters */
    public C13568l m3176l(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, C5138l c5138l) {
        int i2 = ((AbstractC6716l) this.f23361l).isPro;
        byte[][] bArr4 = new byte[i2][];
        C5138l c5138l2 = new C5138l(c5138l);
        c5138l2.m1715l(2);
        byte[] bArr5 = (byte[]) c5138l.f11181l;
        c5138l2.m1721return(AbstractC10000l.yandex(0, bArr5));
        c5138l2.m1718l(AbstractC10000l.loadAd(8, bArr5));
        for (int i3 = 0; i3 < i2; i3++) {
            bArr4[i3] = m3171l(bArr2, ((i >>> i3) ^ 1) << i3, i3, bArr3, c5138l2);
        }
        C5138l c5138l3 = new C5138l(c5138l);
        c5138l3.m1715l(0);
        c5138l3.m1709const(i);
        C14099l c14099l = (C14099l) this.f23360l;
        C5138l c5138l4 = new C5138l(c5138l3);
        byte[] bArr6 = (byte[]) c5138l4.f11181l;
        AbstractC6716l abstractC6716l = (AbstractC6716l) c14099l.f27460l;
        int i4 = abstractC6716l.crashlytics;
        int i5 = abstractC6716l.purchase;
        int[] iArr = new int[i4];
        c14099l.yandex(bArr, 0, iArr, 0, abstractC6716l.amazon);
        int i6 = 0;
        for (int i7 = 0; i7 < abstractC6716l.amazon; i7++) {
            i6 += 15 - iArr[i7];
        }
        int i8 = abstractC6716l.loadAd;
        if (i8 % 8 != 0) {
            i6 <<= 8 - ((i5 * i8) % 8);
        }
        int i9 = ((i5 * i8) + 7) / 8;
        byte[] bArr7 = new byte[4];
        AbstractC10000l.isPro(i6, 0, bArr7);
        c14099l.yandex(bArr7, 4 - i9, iArr, abstractC6716l.amazon, abstractC6716l.purchase);
        byte[][] bArr8 = new byte[i4][];
        int i10 = 0;
        while (i10 < i4) {
            c5138l4.m1715l(5);
            c5138l4.m1709const(c5138l3.m1711goto());
            AbstractC10000l.isPro(i10, 24, bArr6);
            AbstractC10000l.isPro(0, 28, bArr6);
            int i11 = i4;
            byte[] bArrAmazon = abstractC6716l.amazon(c5138l4, bArr3, bArr2);
            c5138l4.m1715l(0);
            c5138l4.m1709const(c5138l3.m1711goto());
            AbstractC10000l.isPro(i10, 24, bArr6);
            AbstractC10000l.isPro(0, 28, bArr6);
            C5138l c5138l5 = c5138l4;
            AbstractC6716l abstractC6716l2 = abstractC6716l;
            C14099l c14099l2 = c14099l;
            bArr8[i10] = c14099l2.loadAd(bArrAmazon, 0, iArr[i10], bArr3, c5138l5);
            i10++;
            i4 = i11;
            c14099l = c14099l2;
            abstractC6716l = abstractC6716l2;
            c5138l4 = c5138l5;
        }
        return new C13568l(AbstractC14024l.isPro(bArr8), bArr4, 14);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lَٖؔ */
    public void mo2790l(int i, int i2, int i3) {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i4 = i2 - i;
        while (true) {
            i4--;
            ArrayList arrayList = (ArrayList) this.f23362l;
            if (-1 >= i4) {
                arrayList.addAll(Math.min(i3, arrayList.size()), arrayDeque);
                return;
            }
            arrayDeque.addFirst(arrayList.remove(i + i4));
        }
    }

    @Override // defpackage.InterfaceC0478l
    /* JADX INFO: renamed from: lٌٖؖ */
    public InterfaceC15189l mo621l(C12638l c12638l) {
        if (((Set) this.f23357l).contains(c12638l)) {
            return ((InterfaceC0478l) this.f23362l).mo621l(c12638l);
        }
        C11983l.Signature(c12638l, ">.", "Attempting to request an undeclared dependency Provider<");
        return null;
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lَٖؕ */
    public AbstractC10759l mo2791l() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).mo2791l();
    }

    @Override // defpackage.InterfaceC0478l
    /* JADX INFO: renamed from: lٖۡٓ */
    public Object mo622l(C12638l c12638l) {
        if (((Set) this.f23358l).contains(c12638l)) {
            return ((InterfaceC0478l) this.f23362l).mo622l(c12638l);
        }
        C11983l.Signature(c12638l, ".", "Attempting to request an undeclared dependency ");
        return null;
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lٖۥۡ */
    public int mo2792l() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).mo2792l();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؘٗۦ */
    public boolean mo2793l() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).mo2793l();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lْٗٔ */
    public boolean mo2794l() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).mo2794l();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؙٗٙ */
    public void mo2795l(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.f23362l;
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2795l(i, i2);
        arrayList.add(Math.min(i2, arrayList.size()), arrayList.remove(i));
    }

    /* JADX INFO: renamed from: l٘ؓۘ, reason: contains not printable characters */
    public byte[] m3177l(int i, C13568l c13568l, byte[] bArr, byte[] bArr2, C5138l c5138l) {
        AbstractC6716l abstractC6716l = (AbstractC6716l) this.f23361l;
        C5138l c5138l2 = new C5138l(c5138l);
        byte[] bArr3 = (byte[]) c5138l2.f11181l;
        int i2 = 0;
        c5138l2.m1715l(0);
        c5138l2.m1709const(i);
        byte[] bArr4 = (byte[]) c13568l.f26581l;
        byte[][] bArr5 = (byte[][]) c13568l.f26580l;
        C14099l c14099l = (C14099l) this.f23360l;
        C5138l c5138l3 = new C5138l(c5138l2);
        AbstractC6716l abstractC6716l2 = (AbstractC6716l) c14099l.f27460l;
        int i3 = abstractC6716l2.crashlytics;
        int i4 = abstractC6716l2.yandex;
        int[] iArr = new int[i3];
        c14099l.yandex(bArr, 0, iArr, 0, abstractC6716l2.amazon);
        int i5 = 0;
        for (int i6 = 0; i6 < abstractC6716l2.amazon; i6++) {
            i5 += 15 - iArr[i6];
        }
        int i7 = abstractC6716l2.purchase * abstractC6716l2.loadAd;
        byte[] bArr6 = new byte[4];
        AbstractC10000l.isPro(i5 << (8 - (i7 % 8)), 0, bArr6);
        c14099l.yandex(bArr6, 4 - ((i7 + 7) / 8), iArr, abstractC6716l2.amazon, abstractC6716l2.purchase);
        byte[] bArr7 = new byte[i4];
        byte[][] bArr8 = new byte[i3][];
        int i8 = 0;
        while (i8 < i3) {
            AbstractC10000l.isPro(i8, 24, bArr3);
            System.arraycopy(bArr4, i8 * i4, bArr7, 0, i4);
            int i9 = i4;
            int i10 = iArr[i8];
            int i11 = i3;
            byte[] bArr9 = bArr7;
            C14099l c14099l2 = c14099l;
            bArr8[i8] = c14099l2.loadAd(bArr9, i10, 15 - i10, bArr2, c5138l2);
            i8++;
            c14099l = c14099l2;
            abstractC6716l2 = abstractC6716l2;
            bArr7 = bArr9;
            i3 = i11;
            i4 = i9;
        }
        c5138l3.m1715l(1);
        c5138l3.m1709const(c5138l2.m1711goto());
        byte[] bArrBilling = abstractC6716l2.billing(c5138l3, bArr2, AbstractC14024l.isPro(bArr8));
        c5138l2.m1715l(2);
        c5138l2.m1717l(i);
        while (i2 < abstractC6716l.isPro) {
            int i12 = i2 + 1;
            c5138l2.m1714l(i12);
            if (((1 << i2) & i) == 0) {
                c5138l2.m1717l(AbstractC10000l.yandex(28, bArr3) / 2);
                bArrBilling = abstractC6716l.loadAd(bArr2, c5138l2, bArrBilling, bArr5[i2]);
            } else {
                c5138l2.m1717l((AbstractC10000l.yandex(28, bArr3) - 1) / 2);
                bArrBilling = abstractC6716l.loadAd(bArr2, c5138l2, bArr5[i2], bArrBilling);
            }
            i2 = i12;
        }
        return bArrBilling;
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: l٘ٗ۟ */
    public InterfaceC14209l mo1668l(C3624l c3624l, C3498l c3498l) {
        return ((C12714l) this.f23358l).mo1668l(c3624l, c3498l);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: l٘ٚۥ */
    public void mo2796l(InterfaceC13521l interfaceC13521l) {
        ((C9928l) this.f23358l).mo2796l(interfaceC13521l);
        ((ArrayList) this.f23361l).remove(interfaceC13521l);
    }

    /* JADX INFO: renamed from: l٘ٛؒ, reason: contains not printable characters */
    public Set m3178l(Class cls) {
        return mo620l(C12638l.yandex(cls));
    }

    @Override // defpackage.InterfaceC0478l
    /* JADX INFO: renamed from: l٘ۦۢ */
    public C1263l mo623l(C12638l c12638l) {
        if (((Set) this.f23361l).contains(c12638l)) {
            return ((InterfaceC0478l) this.f23362l).mo623l(c12638l);
        }
        C11983l.Signature(c12638l, ">.", "Attempting to request an undeclared dependency Deferred<");
        return null;
    }

    @Override // defpackage.InterfaceC9814l
    public void metrica(C2427l c2427l, long j) {
        ArrayList arrayList = (ArrayList) this.f23362l;
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).metrica(c2427l, j);
        arrayList.clear();
        arrayList.add(c2427l);
    }

    @Override // defpackage.InterfaceC9814l
    public int mopub() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).mopub();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: native */
    public void mo2797native(int i, int i2, List list) {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2797native(i, i2, list);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: new */
    public long mo2798new() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).mo2798new();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: package */
    public void mo2799package(int i, int i2) {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2799package(i, i2);
    }

    @Override // defpackage.InterfaceC9814l
    public void premium() {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).premium();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: private */
    public void mo2800private(C4970l c4970l) {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2800private(c4970l);
    }

    @Override // defpackage.InterfaceC9814l
    public long pro() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).pro();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: protected */
    public void mo2801protected() {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2801protected();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: public */
    public C3852l mo2802public() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).mo2802public();
    }

    @Override // defpackage.InterfaceC9814l
    public int purchase() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).purchase();
    }

    @Override // defpackage.InterfaceC9814l
    public void release() {
        C9928l c9928l = (C9928l) this.f23360l;
        if (c9928l != null) {
            c9928l.release();
        }
        ((C9928l) this.f23358l).release();
        ((ArrayList) this.f23362l).clear();
    }

    @Override // defpackage.InterfaceC0478l
    public Object remoteconfig(Class cls) {
        if (!((Set) this.f23358l).contains(C12638l.yandex(cls))) {
            throw new C6451l(AbstractC14814l.metrica(cls, "Attempting to request an undeclared dependency ", "."), 2, (byte) 0);
        }
        Object objRemoteconfig = ((InterfaceC0478l) this.f23362l).remoteconfig(cls);
        if (!cls.equals(InterfaceC1677l.class)) {
            return objRemoteconfig;
        }
        return new C17836l();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: return */
    public void mo2803return(boolean z) {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2803return(z);
    }

    @Override // defpackage.InterfaceC9814l
    public float signatures() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).signatures();
    }

    @Override // defpackage.InterfaceC9814l
    public void smaato(int i, long j) {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).smaato(i, j);
    }

    @Override // defpackage.InterfaceC9814l
    public boolean startapp() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).startapp();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: static */
    public long mo2804static() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).mo2804static();
    }

    @Override // defpackage.InterfaceC9814l
    public void stop() {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).stop();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: strictfp */
    public int mo2805strictfp() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).mo2805strictfp();
    }

    @Override // defpackage.InterfaceC9814l
    public boolean subs() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).subs();
    }

    @Override // defpackage.InterfaceC9814l
    public int subscription() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).subscription();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: super */
    public void mo2806super(int i) {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2806super(i);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: switch */
    public C14723l mo2807switch() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).mo2807switch();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: synchronized */
    public void mo2808synchronized(int i) {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2808synchronized(i);
    }

    @Override // defpackage.InterfaceC9814l
    public long tapsense() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).tapsense();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: this */
    public C16684l mo2809this() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).mo2809this();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: throw */
    public void mo2810throw(int i, int i2) {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2810throw(i, i2);
        int i3 = i2 - i;
        while (true) {
            i3--;
            if (-1 >= i3) {
                return;
            } else {
                ((ArrayList) this.f23362l).remove(i + i3);
            }
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: throws */
    public void mo2811throws() {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2811throws();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: transient */
    public void mo2812transient(C3852l c3852l) {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2812transient(c3852l);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: try */
    public int mo2813try() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).mo2813try();
    }

    @Override // defpackage.InterfaceC9814l
    public C16616l vip() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).vip();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: volatile */
    public void mo2814volatile() {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).mo2814volatile();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: while */
    public int mo2815while() {
        return ((InterfaceC9814l) ((C9928l) this.f23358l).f33215l).mo2815while();
    }

    @Override // defpackage.InterfaceC9814l
    public void yandex() {
        if (((C9928l) this.f23360l) != null) {
            m3167l();
        }
        ((C9928l) this.f23358l).yandex();
    }

    public C11644l(AbstractC6716l abstractC6716l, byte[] bArr, byte[] bArr2) {
        this.f23359l = 17;
        this.f23358l = bArr;
        this.f23357l = bArr2;
        this.f23361l = abstractC6716l;
        this.f23360l = new C14099l(abstractC6716l);
        C5138l c5138l = new C5138l((byte) 0, 3);
        c5138l.m1721return(abstractC6716l.billing - 1);
        c5138l.m1718l(0L);
        if (bArr != null) {
            this.f23362l = m3171l(bArr, 0, abstractC6716l.isPro, bArr2, c5138l);
        } else {
            this.f23362l = null;
        }
    }

    public /* synthetic */ C11644l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f23359l = i;
        this.f23358l = obj;
        this.f23357l = obj2;
        this.f23361l = obj3;
        this.f23360l = obj4;
        this.f23362l = obj5;
    }

    public /* synthetic */ C11644l(boolean z) {
        this.f23359l = 28;
    }

    public C11644l(C12125l c12125l, VKXApplication vKXApplication, C2063l c2063l, C2063l c2063l2) {
        this.f23359l = 3;
        this.f23358l = c12125l;
        this.f23357l = vKXApplication;
        this.f23361l = c2063l;
        this.f23360l = c2063l2;
        this.f23362l = AbstractC11190l.yandex(null);
        m3142l(vKXApplication, c12125l, c2063l, c2063l2, false);
    }

    public C11644l(C18662l c18662l, List list) {
        this.f23359l = 19;
        this.f23358l = c18662l;
        this.f23357l = list;
        C1008l c1008lYandex = AbstractC11190l.yandex(new C8195l(0, 0));
        this.f23360l = c1008lYandex;
        this.f23362l = AbstractC0622l.yandex(c1008lYandex);
    }

    public C11644l(Drawable.Callback callback) {
        this.f23359l = 16;
        this.f23358l = new C0797l();
        this.f23357l = new HashMap();
        this.f23361l = new HashMap();
        this.f23362l = ".ttf";
        if (!(callback instanceof View)) {
            AbstractC17968l.loadAd("LottieDrawable must be inside of a view for images to work.");
            this.f23360l = null;
        } else {
            this.f23360l = ((View) callback).getContext().getAssets();
        }
    }

    public C11644l(Layout layout) {
        this.f23359l = 21;
        this.f23358l = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iM3321extends = AbstractC12024l.m3321extends(((Layout) this.f23358l).getText(), '\n', length, 4);
            length = iM3321extends < 0 ? ((Layout) this.f23358l).getText().length() : iM3321extends + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.f23358l).getText().length());
        this.f23361l = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.f23357l = arrayList2;
        this.f23360l = new boolean[((ArrayList) this.f23361l).size()];
        ((ArrayList) this.f23361l).size();
    }

    public C11644l(C9928l c9928l) {
        this.f23359l = 27;
        this.f23358l = c9928l;
        this.f23357l = new C3342l(29);
        this.f23361l = new ArrayList();
        this.f23362l = new ArrayList();
    }

    public C11644l(C4652l c4652l, InterfaceC0478l interfaceC0478l) {
        this.f23359l = 29;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<C12186l> set = c4652l.crashlytics;
        Set set2 = c4652l.mopub;
        for (C12186l c12186l : set) {
            int i = c12186l.crashlytics;
            int i2 = c12186l.loadAd;
            boolean z = i == 0;
            C12638l c12638l = c12186l.yandex;
            if (z) {
                if (i2 == 2) {
                    hashSet4.add(c12638l);
                } else {
                    hashSet.add(c12638l);
                }
            } else if (i == 2) {
                hashSet3.add(c12638l);
            } else if (i2 == 2) {
                hashSet5.add(c12638l);
            } else {
                hashSet2.add(c12638l);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(C12638l.yandex(InterfaceC1677l.class));
        }
        this.f23358l = DesugarCollections.unmodifiableSet(hashSet);
        this.f23357l = DesugarCollections.unmodifiableSet(hashSet2);
        this.f23361l = DesugarCollections.unmodifiableSet(hashSet3);
        this.f23360l = DesugarCollections.unmodifiableSet(hashSet4);
        DesugarCollections.unmodifiableSet(hashSet5);
        this.f23362l = interfaceC0478l;
    }

    public /* synthetic */ C11644l(int i, boolean z) {
        this.f23359l = i;
    }

    public C11644l(int i) {
        this.f23359l = i;
        int i2 = 13;
        switch (i) {
            case 5:
                this.f23358l = new Object();
                this.f23361l = new C12633l(0);
                this.f23360l = new C12463l();
                this.f23362l = new C12463l();
                break;
            case 8:
                this.f23361l = new ArrayList();
                this.f23358l = new ArrayList();
                this.f23357l = new ArrayList();
                this.f23360l = new ArrayList();
                this.f23362l = new ArrayList();
                break;
            case 10:
                C16076l c16076l = VKXApplication.f36632l;
                this.f23358l = AbstractC8020l.smaato((c16076l == null ? null : c16076l).f31521l.amazon);
                C16076l c16076l2 = VKXApplication.f36632l;
                this.f23357l = AbstractC8020l.smaato((c16076l2 == null ? null : c16076l2).purchase());
                C16076l c16076l3 = VKXApplication.f36632l;
                C10507l c10507lCrashlytics = (c16076l3 == null ? null : c16076l3).crashlytics();
                this.f23361l = AbstractC8020l.smaato(c10507lCrashlytics != null ? c10507lCrashlytics.loadAd : null);
                C16076l c16076l4 = VKXApplication.f36632l;
                c16076l4 = c16076l4 == null ? null : c16076l4;
                c16076l4.getClass();
                this.f23360l = AbstractC8020l.smaato((C1100l) c16076l4.admob(new C18606l(c16076l4, i2)));
                C16076l c16076l5 = VKXApplication.f36632l;
                C16076l c16076l6 = c16076l5 != null ? c16076l5 : null;
                c16076l6.getClass();
                Boolean bool = (Boolean) c16076l6.admob(new C18606l(c16076l6, 20));
                bool.booleanValue();
                this.f23362l = AbstractC8020l.smaato(bool);
                break;
            case 14:
                this.f23358l = new int[10];
                this.f23357l = new int[10];
                this.f23361l = new int[10];
                this.f23360l = new int[10];
                this.f23362l = new int[10];
                break;
            case 22:
                this.f23358l = new HashMap();
                this.f23357l = new HashMap();
                this.f23361l = new HashMap();
                this.f23360l = new HashMap();
                this.f23362l = new HashMap();
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                this.f23362l = C13772l.f26878l;
                this.f23357l = "GET";
                this.f23361l = new C16543l((byte) 0, 13);
                break;
            default:
                this.f23358l = AbstractC4311l.yandex();
                this.f23357l = AbstractC8020l.smaato(null);
                long j = C9735l.purchase;
                this.f23361l = AbstractC8020l.smaato(new C9735l(j));
                this.f23360l = AbstractC8020l.smaato(new C9735l(j));
                this.f23362l = AbstractC8020l.smaato(C14473l.subs);
                break;
        }
    }

    public C11644l(C17847l c17847l, C14959l c14959l) {
        this.f23359l = 24;
        this.f23358l = c17847l;
        this.f23357l = c14959l;
        this.f23361l = AbstractC1805l.yandex(false);
        this.f23360l = AbstractC12098l.yandex(Alert.DURATION_SHOW_INDEFINITELY, 0, new C8250l(23, this), 2);
        this.f23362l = new C11315l();
    }

    public C11644l(int[] iArr, int i, C10060l[] c10060lArr) {
        C0940l c0940l;
        this.f23359l = 0;
        this.f23362l = new float[3];
        this.f23360l = c10060lArr;
        int[] iArr2 = new int[32768];
        this.f23357l = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            int iM3139l = m3139l(Color.blue(i3), 8, 5) | (m3139l(Color.red(i3), 8, 5) << 10) | (m3139l(Color.green(i3), 8, 5) << 5);
            iArr[i2] = iM3139l;
            iArr2[iM3139l] = iArr2[iM3139l] + 1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr2[i5] > 0) {
                int iRgb = Color.rgb(m3139l((i5 >> 10) & 31, 5, 8), m3139l((i5 >> 5) & 31, 5, 8), m3139l(i5 & 31, 5, 8));
                float[] fArr = (float[]) this.f23362l;
                ThreadLocal threadLocal = AbstractC14093l.yandex;
                AbstractC14093l.yandex(Color.red(iRgb), Color.green(iRgb), Color.blue(iRgb), fArr);
                if (m3159l(fArr)) {
                    iArr2[i5] = 0;
                }
            }
            if (iArr2[i5] > 0) {
                i4++;
            }
        }
        int[] iArr3 = new int[i4];
        this.f23358l = iArr3;
        int i6 = 0;
        for (int i7 = 0; i7 < 32768; i7++) {
            if (iArr2[i7] > 0) {
                iArr3[i6] = i7;
                i6++;
            }
        }
        if (i4 <= i) {
            this.f23361l = new ArrayList();
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = iArr3[i8];
                ((ArrayList) this.f23361l).add(new C13562l(Color.rgb(m3139l((i9 >> 10) & 31, 5, 8), m3139l((i9 >> 5) & 31, 5, 8), m3139l(i9 & 31, 5, 8)), iArr2[i9]));
            }
            return;
        }
        PriorityQueue<C0940l> priorityQueue = new PriorityQueue(i, f23356l);
        priorityQueue.offer(new C0940l(this, 0, ((int[]) this.f23358l).length - 1));
        while (priorityQueue.size() < i && (c0940l = (C0940l) priorityQueue.poll()) != null) {
            int i10 = c0940l.loadAd;
            int iMin = c0940l.yandex;
            if ((i10 + 1) - iMin <= 1) {
                break;
            }
            C11644l c11644l = c0940l.isPro;
            if ((i10 + 1) - iMin > 1) {
                int i11 = c0940l.purchase - c0940l.amazon;
                int i12 = c0940l.mopub - c0940l.billing;
                int i13 = c0940l.subs - c0940l.admob;
                int i14 = (i11 < i12 || i11 < i13) ? (i12 < i11 || i12 < i13) ? -1 : -2 : -3;
                int[] iArr4 = (int[]) c11644l.f23358l;
                int[] iArr5 = (int[]) c11644l.f23357l;
                m3141l(i14, iMin, i10, iArr4);
                Arrays.sort(iArr4, iMin, c0940l.loadAd + 1);
                m3141l(i14, iMin, c0940l.loadAd, iArr4);
                int i15 = c0940l.crashlytics / 2;
                int i16 = 0;
                int i17 = iMin;
                while (true) {
                    int i18 = c0940l.loadAd;
                    if (i17 > i18) {
                        break;
                    }
                    i16 += iArr5[iArr4[i17]];
                    if (i16 >= i15) {
                        iMin = Math.min(i18 - 1, i17);
                        break;
                    }
                    i17++;
                }
                C0940l c0940l2 = new C0940l(c11644l, iMin + 1, c0940l.loadAd);
                c0940l.loadAd = iMin;
                c0940l.yandex();
                priorityQueue.offer(c0940l2);
                priorityQueue.offer(c0940l);
            } else {
                C8339l.smaato("Can not split a box with only 1 color");
                throw null;
            }
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        for (C0940l c0940l3 : priorityQueue) {
            C11644l c11644l2 = c0940l3.isPro;
            int[] iArr6 = (int[]) c11644l2.f23358l;
            int[] iArr7 = (int[]) c11644l2.f23357l;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            for (int i23 = c0940l3.yandex; i23 <= c0940l3.loadAd; i23++) {
                int i24 = iArr6[i23];
                int i25 = iArr7[i24];
                i20 += i25;
                i19 = (((i24 >> 10) & 31) * i25) + i19;
                i21 = (((i24 >> 5) & 31) * i25) + i21;
                i22 += i25 * (i24 & 31);
            }
            float f = i20;
            C13562l c13562l = new C13562l(Color.rgb(m3139l(Math.round(i19 / f), 5, 8), m3139l(Math.round(i21 / f), 5, 8), m3139l(Math.round(i22 / f), 5, 8)), i20);
            if (!m3159l(c13562l.loadAd())) {
                arrayList.add(c13562l);
            }
        }
        this.f23361l = arrayList;
    }

    public C11644l(InterfaceC18690l interfaceC18690l, InterfaceC18690l interfaceC18690l2, InterfaceC13989l interfaceC13989l) {
        this.f23359l = 13;
        this.f23357l = interfaceC18690l;
        this.f23361l = interfaceC18690l2;
        this.f23358l = interfaceC13989l;
    }

    public C11644l(Context context) {
        this.f23359l = 20;
        this.f23358l = context.getApplicationContext();
        this.f23357l = C4865l.metrica;
        this.f23361l = null;
        this.f23360l = null;
        this.f23362l = new C13767l();
    }

    public C11644l(C6507l c6507l) {
        this.f23359l = 8;
        this.f23361l = new ArrayList(c6507l.yandex);
        this.f23358l = new ArrayList(c6507l.loadAd);
        this.f23357l = new ArrayList(c6507l.crashlytics);
        List list = (List) c6507l.billing.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C13802l(12, (C8195l) it.next()));
        }
        this.f23360l = arrayList;
        List list2 = (List) c6507l.mopub.getValue();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new C13771l((InterfaceC3525l) it2.next(), 1));
        }
        this.f23362l = arrayList2;
    }

    public C11644l(C12714l c12714l, C12714l c12714l2, C3498l c3498l, ArrayList arrayList) {
        this.f23359l = 6;
        this.f23357l = c12714l;
        this.f23360l = c12714l2;
        this.f23362l = c3498l;
        this.f23361l = arrayList;
        this.f23358l = c12714l;
    }

    public C11644l(C3097l c3097l) {
        this.f23359l = 18;
        this.f23358l = c3097l;
        this.f23360l = AbstractC10039l.yandex;
        this.f23362l = C12682l.yandex;
    }

    public C11644l(C0360l c0360l, List list, InterfaceC12932l interfaceC12932l) {
        this.f23359l = 9;
        this.f23362l = c0360l;
        this.f23358l = AbstractC8618l.yandex();
        this.f23357l = new C9426l();
        this.f23361l = interfaceC12932l;
        this.f23360l = AbstractC16901l.m4213const(list);
    }
}
