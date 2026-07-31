package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lؔ٘ٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2688l {
    public long admob;
    public final long amazon;
    public final int[] billing;
    public final InterfaceC8639l crashlytics;
    public final C4074l loadAd;
    public final C18476l mopub;
    public final InterfaceC14189l purchase;
    public int subs;
    public final InterfaceC9354l yandex;

    public C2688l(InterfaceC9354l interfaceC9354l, C4074l c4074l, InterfaceC8639l interfaceC8639l, long j) {
        this.yandex = interfaceC9354l;
        this.loadAd = c4074l;
        this.crashlytics = interfaceC8639l;
        this.amazon = j;
        byte[] bArr = c4074l.f8376l;
        if (bArr.length <= 0) {
            C8339l.metrica("Empty match string not permitted for scanning");
            throw null;
        }
        this.purchase = interfaceC9354l.mopub();
        int[] iArr = new int[bArr.length];
        int length = bArr.length;
        int i = 0;
        for (int i2 = 1; i2 < length; i2++) {
            while (i > 0 && c4074l.yandex(i2) != c4074l.yandex(i)) {
                i = iArr[i - 1];
            }
            if (c4074l.yandex(i2) == c4074l.yandex(i)) {
                i++;
            }
            iArr[i2] = i;
        }
        this.billing = iArr;
        this.mopub = new C18476l();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0069 A[PHI: r10 r11
  0x0069: PHI (r10v3 boolean) = (r10v6 boolean), (r10v8 boolean) binds: [B:24:0x0066, B:19:0x0045] A[DONT_GENERATE, DONT_INLINE]
  0x0069: PHI (r11v4 java.lang.Object) = (r11v14 java.lang.Object), (r11v1 java.lang.Object) binds: [B:24:0x0066, B:19:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:35:0x0098  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c2 A[PHI: r10
  0x00c2: PHI (r10v2 boolean) = (r10v3 boolean), (r10v6 boolean) binds: [B:27:0x006f, B:22:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00cd A[PHI: r10
  0x00cd: PHI (r10v1 boolean) = (r10v2 boolean), (r10v9 boolean) binds: [B:38:0x00ca, B:18:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
    
        if (r1.crashlytics(r0) == r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d5, code lost:
    
        if (r11 == r6) goto L42;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x0098, please report this as an issue */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d5 -> B:43:0x00d8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object amazon(boolean r10, defpackage.AbstractC0283l r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2688l.amazon(boolean, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:51:0x0082 A[ADDED_TO_REGION, EDGE_INSN: B:51:0x0082->B:37:0x0082 BREAK  A[LOOP:0: B:32:0x006e->B:36:0x0078], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x003f -> B:27:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004b -> B:22:0x004e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object crashlytics(defpackage.AbstractC0283l r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2688l.crashlytics(lّؑۧ):java.lang.Object");
    }

    public final void loadAd(long j) throws IOException {
        long j2 = this.admob + j;
        long j3 = this.amazon;
        if (j2 <= j3) {
            return;
        }
        StringBuilder sbSignature = AbstractC0653l.Signature(j3, "Limit of ", " bytes exceeded while searching for \"");
        sbSignature.append(AbstractC16648l.advert(AbstractC16648l.ads(this.loadAd.f8376l), "\n", "\\n", false));
        sbSignature.append('\"');
        throw new IOException(sbSignature.toString());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0073  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008e -> B:18:0x003e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object yandex(defpackage.AbstractC0283l r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.C11988l
            if (r0 == 0) goto L13
            r0 = r12
            lِٝؔ r0 = (defpackage.C11988l) r0
            int r1 = r0.f23897l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23897l = r1
            goto L18
        L13:
            lِٝؔ r0 = new lِٝؔ
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f23896l
            int r1 = r0.f23897l
            r2 = 3
            r3 = 2
            r4 = 1
            lٖٓۡ r5 = r11.purchase
            lٍؗؐ r6 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L37
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L30
            defpackage.AbstractC2829l.crashlytics(r12)
            goto Laa
        L30:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r11)
            r11 = 0
            return r11
        L37:
            defpackage.AbstractC2829l.crashlytics(r12)
            goto L51
        L3b:
            defpackage.AbstractC2829l.crashlytics(r12)
        L3e:
            boolean r12 = r5.subs()
            if (r12 == 0) goto L5d
            r0.f23897l = r4
            int r12 = defpackage.AbstractC3458l.yandex
            lٍؘؒ r12 = r11.yandex
            java.lang.Object r12 = r12.amazon(r4, r0)
            if (r12 != r6) goto L51
            goto La9
        L51:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L5a
            goto L5d
        L5a:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L5d:
            lّؖ۠ r12 = r11.loadAd
            r1 = 0
            byte r12 = r12.yandex(r1)
            r7 = 0
            r1 = 6
            long r7 = defpackage.AbstractC10733l.amazon(r5, r12, r7, r1)
            r9 = -1
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            lٌؚۛ r1 = r11.crashlytics
            if (r12 != 0) goto L91
            r12 = r5
            lّٞ r12 = (defpackage.C18476l) r12
            long r7 = r12.f36079l
            r11.loadAd(r7)
            long r7 = r11.admob
            lّٞ r9 = r1.purchase()
            long r9 = r12.signatures(r9)
            long r9 = r9 + r7
            r11.admob = r9
            r0.f23897l = r3
            java.lang.Object r12 = defpackage.AbstractC10433l.purchase(r1, r0)
            if (r12 != r6) goto L3e
            goto La9
        L91:
            r11.loadAd(r7)
            long r3 = r11.admob
            lّٞ r12 = r1.purchase()
            long r7 = r5.mo1064extends(r12, r7)
            long r7 = r7 + r3
            r11.admob = r7
            r0.f23897l = r2
            java.lang.Object r11 = defpackage.AbstractC10433l.purchase(r1, r0)
            if (r11 != r6) goto Laa
        La9:
            return r6
        Laa:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2688l.yandex(lّؑۧ):java.lang.Object");
    }
}
