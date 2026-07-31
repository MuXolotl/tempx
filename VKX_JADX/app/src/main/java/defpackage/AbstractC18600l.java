package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: lۜۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18600l {
    public static final C10685l loadAd;
    public static final Set yandex = AbstractC8669l.m2407import(new Character[]{'/', '?', '#', '@'});

    static {
        List list = C14248l.loadAd;
        loadAd = AbstractC12396l.crashlytics(AbstractC14055l.remoteconfig("HTTP/1.0", "HTTP/1.1"), new C13206l(18), new C3755l(2));
    }

    public static final C17721l amazon(C16231l c16231l, C9754l c9754l) {
        AbstractC5473l.isPro(c16231l, c9754l);
        C17721l c17721l = (C17721l) AbstractC16901l.m4236public(C10685l.m2943abstract(AbstractC15176l.yandex, c16231l, c9754l.f19893l, c9754l.f19892l, new C12513l((byte) 0, 11), 8));
        if (c17721l != null) {
            c9754l.f19893l = c17721l.yandex.length() + c9754l.f19893l;
            return c17721l;
        }
        int iMopub = AbstractC5473l.mopub(c16231l, c9754l);
        CharSequence charSequenceSubSequence = c16231l.subSequence(c9754l.f19893l, iMopub);
        c9754l.f19893l = iMopub;
        return new C17721l(charSequenceSubSequence.toString());
    }

    public static final String billing(C16231l c16231l, C9754l c9754l) {
        AbstractC5473l.isPro(c16231l, c9754l);
        int i = c9754l.f19893l;
        int i2 = c9754l.f19892l;
        if (i >= i2) {
            C18073l.firebase(c16231l, "Failed to parse version: ");
            return null;
        }
        String str = (String) AbstractC16901l.m4236public(C10685l.m2943abstract(loadAd, c16231l, i, i2, new C12513l((byte) 0, 12), 8));
        if (str != null) {
            c9754l.f19893l = str.length() + c9754l.f19893l;
            return str;
        }
        int iMopub = AbstractC5473l.mopub(c16231l, c9754l);
        CharSequence charSequenceSubSequence = c16231l.subSequence(c9754l.f19893l, iMopub);
        c9754l.f19893l = iMopub;
        throw new C17072l("Unsupported HTTP version: " + ((Object) charSequenceSubSequence), 7);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x0077 A[Catch: all -> 0x007b, TryCatch #1 {all -> 0x007b, blocks: (B:24:0x006b, B:26:0x0077, B:30:0x007f, B:34:0x008c, B:37:0x0098, B:40:0x00a4, B:42:0x00a9, B:58:0x00d1, B:19:0x0053, B:45:0x00b0, B:54:0x00c4, B:55:0x00c7, B:56:0x00c8, B:57:0x00cb, B:59:0x00dd, B:60:0x00e4, B:61:0x00e5, B:63:0x00ed), top: B:69:0x006b }] */
    /* JADX WARN: Code duplicated, block: B:30:0x007f A[Catch: all -> 0x007b, TryCatch #1 {all -> 0x007b, blocks: (B:24:0x006b, B:26:0x0077, B:30:0x007f, B:34:0x008c, B:37:0x0098, B:40:0x00a4, B:42:0x00a9, B:58:0x00d1, B:19:0x0053, B:45:0x00b0, B:54:0x00c4, B:55:0x00c7, B:56:0x00c8, B:57:0x00cb, B:59:0x00dd, B:60:0x00e4, B:61:0x00e5, B:63:0x00ed), top: B:69:0x006b }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x008c A[Catch: all -> 0x007b, TryCatch #1 {all -> 0x007b, blocks: (B:24:0x006b, B:26:0x0077, B:30:0x007f, B:34:0x008c, B:37:0x0098, B:40:0x00a4, B:42:0x00a9, B:58:0x00d1, B:19:0x0053, B:45:0x00b0, B:54:0x00c4, B:55:0x00c7, B:56:0x00c8, B:57:0x00cb, B:59:0x00dd, B:60:0x00e4, B:61:0x00e5, B:63:0x00ed), top: B:69:0x006b }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0098 A[Catch: all -> 0x007b, TryCatch #1 {all -> 0x007b, blocks: (B:24:0x006b, B:26:0x0077, B:30:0x007f, B:34:0x008c, B:37:0x0098, B:40:0x00a4, B:42:0x00a9, B:58:0x00d1, B:19:0x0053, B:45:0x00b0, B:54:0x00c4, B:55:0x00c7, B:56:0x00c8, B:57:0x00cb, B:59:0x00dd, B:60:0x00e4, B:61:0x00e5, B:63:0x00ed), top: B:69:0x006b }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a9 A[Catch: all -> 0x007b, TryCatch #1 {all -> 0x007b, blocks: (B:24:0x006b, B:26:0x0077, B:30:0x007f, B:34:0x008c, B:37:0x0098, B:40:0x00a4, B:42:0x00a9, B:58:0x00d1, B:19:0x0053, B:45:0x00b0, B:54:0x00c4, B:55:0x00c7, B:56:0x00c8, B:57:0x00cb, B:59:0x00dd, B:60:0x00e4, B:61:0x00e5, B:63:0x00ed), top: B:69:0x006b }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0 A[Catch: all -> 0x007b, TryCatch #1 {all -> 0x007b, blocks: (B:24:0x006b, B:26:0x0077, B:30:0x007f, B:34:0x008c, B:37:0x0098, B:40:0x00a4, B:42:0x00a9, B:58:0x00d1, B:19:0x0053, B:45:0x00b0, B:54:0x00c4, B:55:0x00c7, B:56:0x00c8, B:57:0x00cb, B:59:0x00dd, B:60:0x00e4, B:61:0x00e5, B:63:0x00ed), top: B:69:0x006b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00a4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0066 -> B:69:0x006b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object crashlytics(defpackage.InterfaceC9354l r17, defpackage.C16231l r18, defpackage.C9754l r19, defpackage.AbstractC0283l r20) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC18600l.crashlytics(lٍؘؒ, lؙٖۚ, lٍۗؓ, lّؑۧ):java.lang.Object");
    }

    public static final int loadAd(C16231l c16231l, C9754l c9754l) {
        int i = c9754l.f19892l;
        for (int i2 = c9754l.f19893l; i2 < i; i2++) {
            char cCharAt = c16231l.charAt(i2);
            if (cCharAt == ':' && i2 != c9754l.f19893l) {
                c9754l.f19893l = i2 + 1;
                return i2;
            }
            if (AbstractC8576l.subs(cCharAt, 32) <= 0 || AbstractC12024l.inmobi("\"(),/:;<=>?@[\\]{}", cCharAt)) {
                int i3 = c9754l.f19893l;
                if (cCharAt == ':') {
                    throw new C17072l("Empty header names are not allowed as per RFC7230.", 7);
                }
                if (i2 == i3) {
                    throw new C17072l("Multiline headers via line folding is not supported since it is deprecated as per RFC7230.", 7);
                }
                yandex(c16231l, cCharAt);
                throw null;
            }
        }
        throw new C17072l("No colon in HTTP header in " + c16231l.subSequence(c9754l.f19893l, c9754l.f19892l).toString() + " in builder: \n" + ((Object) c16231l), 7);
    }

    public static final void mopub(C13545l c13545l) {
        if (AbstractC12024l.m3341strictfp(c13545l, ":")) {
            throw new C17072l("Host header with ':' should contains port: " + ((Object) c13545l), 7);
        }
        for (int i = 0; i < c13545l.length(); i++) {
            Character chValueOf = Character.valueOf(c13545l.charAt(i));
            Set set = yandex;
            if (set.contains(chValueOf)) {
                throw new C17072l("Host cannot contain any of the following symbols: " + set, 7);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:32:0x0085  */
    /* JADX WARN: Code duplicated, block: B:33:0x0087 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x002f, B:30:0x0079, B:33:0x0087, B:35:0x008f, B:43:0x00b8, B:45:0x00c6, B:47:0x00cc, B:49:0x00d2, B:60:0x00fb, B:61:0x0102, B:62:0x0103, B:63:0x010a, B:64:0x010b, B:65:0x012d, B:39:0x00a5, B:41:0x00ad, B:42:0x00b2, B:26:0x0066), top: B:71:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x008f A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x002f, B:30:0x0079, B:33:0x0087, B:35:0x008f, B:43:0x00b8, B:45:0x00c6, B:47:0x00cc, B:49:0x00d2, B:60:0x00fb, B:61:0x0102, B:62:0x0103, B:63:0x010a, B:64:0x010b, B:65:0x012d, B:39:0x00a5, B:41:0x00ad, B:42:0x00b2, B:26:0x0066), top: B:71:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x002f, B:30:0x0079, B:33:0x0087, B:35:0x008f, B:43:0x00b8, B:45:0x00c6, B:47:0x00cc, B:49:0x00d2, B:60:0x00fb, B:61:0x0102, B:62:0x0103, B:63:0x010a, B:64:0x010b, B:65:0x012d, B:39:0x00a5, B:41:0x00ad, B:42:0x00b2, B:26:0x0066), top: B:71:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b2 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x002f, B:30:0x0079, B:33:0x0087, B:35:0x008f, B:43:0x00b8, B:45:0x00c6, B:47:0x00cc, B:49:0x00d2, B:60:0x00fb, B:61:0x0102, B:62:0x0103, B:63:0x010a, B:64:0x010b, B:65:0x012d, B:39:0x00a5, B:41:0x00ad, B:42:0x00b2, B:26:0x0066), top: B:71:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c6 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x002f, B:30:0x0079, B:33:0x0087, B:35:0x008f, B:43:0x00b8, B:45:0x00c6, B:47:0x00cc, B:49:0x00d2, B:60:0x00fb, B:61:0x0102, B:62:0x0103, B:63:0x010a, B:64:0x010b, B:65:0x012d, B:39:0x00a5, B:41:0x00ad, B:42:0x00b2, B:26:0x0066), top: B:71:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00cc A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x002f, B:30:0x0079, B:33:0x0087, B:35:0x008f, B:43:0x00b8, B:45:0x00c6, B:47:0x00cc, B:49:0x00d2, B:60:0x00fb, B:61:0x0102, B:62:0x0103, B:63:0x010a, B:64:0x010b, B:65:0x012d, B:39:0x00a5, B:41:0x00ad, B:42:0x00b2, B:26:0x0066), top: B:71:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d2 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x002f, B:30:0x0079, B:33:0x0087, B:35:0x008f, B:43:0x00b8, B:45:0x00c6, B:47:0x00cc, B:49:0x00d2, B:60:0x00fb, B:61:0x0102, B:62:0x0103, B:63:0x010a, B:64:0x010b, B:65:0x012d, B:39:0x00a5, B:41:0x00ad, B:42:0x00b2, B:26:0x0066), top: B:71:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f2 A[Catch: all -> 0x00f8, TRY_LEAVE, TryCatch #0 {all -> 0x00f8, blocks: (B:53:0x00ec, B:56:0x00f2), top: B:69:0x00ec }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00fb A[Catch: all -> 0x0038, TRY_ENTER, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x002f, B:30:0x0079, B:33:0x0087, B:35:0x008f, B:43:0x00b8, B:45:0x00c6, B:47:0x00cc, B:49:0x00d2, B:60:0x00fb, B:61:0x0102, B:62:0x0103, B:63:0x010a, B:64:0x010b, B:65:0x012d, B:39:0x00a5, B:41:0x00ad, B:42:0x00b2, B:26:0x0066), top: B:71:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0103 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x002f, B:30:0x0079, B:33:0x0087, B:35:0x008f, B:43:0x00b8, B:45:0x00c6, B:47:0x00cc, B:49:0x00d2, B:60:0x00fb, B:61:0x0102, B:62:0x0103, B:63:0x010a, B:64:0x010b, B:65:0x012d, B:39:0x00a5, B:41:0x00ad, B:42:0x00b2, B:26:0x0066), top: B:71:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x010b A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x002f, B:30:0x0079, B:33:0x0087, B:35:0x008f, B:43:0x00b8, B:45:0x00c6, B:47:0x00cc, B:49:0x00d2, B:60:0x00fb, B:61:0x0102, B:62:0x0103, B:63:0x010a, B:64:0x010b, B:65:0x012d, B:39:0x00a5, B:41:0x00ad, B:42:0x00b2, B:26:0x0066), top: B:71:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x012e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [lِؔۚ] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0076 -> B:30:0x0079). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object purchase(defpackage.InterfaceC9354l r14, defpackage.AbstractC0283l r15) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC18600l.purchase(lٍؘؒ, lّؑۧ):java.lang.Object");
    }

    public static final void yandex(C16231l c16231l, char c) {
        throw new C17072l("Character with code " + (c & 255) + " is not allowed in header names, \n" + ((Object) c16231l), 7);
    }
}
