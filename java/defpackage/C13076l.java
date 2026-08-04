package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: lْؒٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13076l implements InterfaceC17215l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C8755l f25595l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C10276l f25596l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Inflater f25599l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C13143l f25598l = new C13143l();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C13143l f25597l = new C13143l();

    static {
        C9258l c9258l = AbstractC1186l.f3181l;
        f25595l = new C8755l(-9223372036854775807L, -9223372036854775807L, C13708l.f26763l);
    }

    public C13076l(List list) {
        int i;
        C10276l c10276l = new C10276l();
        this.f25596l = c10276l;
        String strTrim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = AbstractC15323l.yandex;
        for (String str2 : strTrim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] strArrSplit = str2.substring(9).split(",", -1);
                c10276l.billing = new int[strArrSplit.length];
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    int[] iArr = c10276l.billing;
                    try {
                        i = Integer.parseInt(strArrSplit[i2].trim(), 16);
                    } catch (RuntimeException e) {
                        AbstractC6427l.metrica("VobsubParser", "Parsing color failed", e);
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] strArrSplit2 = str2.substring(6).trim().split("x", -1);
                if (strArrSplit2.length != 2) {
                    AbstractC6427l.vip("VobsubParser", "Ignoring malformed IDX size line: '" + str2 + "'");
                } else {
                    try {
                        c10276l.mopub = Integer.parseInt(strArrSplit2[0]);
                        c10276l.admob = Integer.parseInt(strArrSplit2[1]);
                        c10276l.amazon = true;
                    } catch (RuntimeException e2) {
                        AbstractC6427l.metrica("VobsubParser", "Parsing IDX failed", e2);
                    }
                }
            }
        }
    }

    @Override // defpackage.InterfaceC17215l
    public final /* synthetic */ InterfaceC2743l isPro(int i, int i2, byte[] bArr) {
        return AbstractC0653l.billing(this, bArr, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0284  */
    /* JADX WARN: Code duplicated, block: B:102:0x028a  */
    /* JADX WARN: Code duplicated, block: B:88:0x026a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0271  */
    /* JADX WARN: Code duplicated, block: B:97:0x027e  */
    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x00bb. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.InterfaceC17215l
    public final void startapp(byte[] bArr, int i, int i2, C8807l c8807l, InterfaceC18679l interfaceC18679l) {
        C8755l c8755l;
        char c;
        long j;
        char c2;
        C17456l c17456l;
        long j2;
        long j3;
        C13708l c13708lIsVip;
        long j4;
        Rect rect;
        C13143l c13143l = this.f25598l;
        c13143l.m3565private(i + i2, bArr);
        c13143l.m3562for(i);
        if (this.f25599l == null) {
            this.f25599l = new Inflater();
        }
        Inflater inflater = this.f25599l;
        C13143l c13143l2 = this.f25597l;
        if (AbstractC15323l.m3959case(c13143l, c13143l2, inflater)) {
            c13143l.m3565private(c13143l2.crashlytics, c13143l2.yandex);
        }
        C10276l c10276l = this.f25596l;
        long j5 = -9223372036854775807L;
        c10276l.loadAd = -9223372036854775807L;
        c10276l.crashlytics = -9223372036854775807L;
        char c3 = 0;
        c10276l.purchase = false;
        c10276l.subs = null;
        c10276l.isPro = -1;
        c10276l.firebase = -1;
        int iYandex = c13143l.yandex();
        if (iYandex < 2 || c13143l.m3567synchronized() != iYandex) {
            c8755l = f25595l;
        } else {
            if (c10276l.billing == null) {
                AbstractC6427l.vip("VobsubParser", "Skipping SPU (no palette)");
            } else {
                if (c10276l.amazon) {
                    int i3 = c13143l.loadAd - 2;
                    c13143l.m3562for(c13143l.m3567synchronized() + i3);
                    while (true) {
                        if (c13143l.yandex() < 4) {
                            j = j5;
                            c2 = c3;
                            c = c2;
                        } else {
                            int i4 = c13143l.loadAd;
                            int iM3567synchronized = c13143l.m3567synchronized() * ModuleDescriptor.MODULE_VERSION;
                            int iM3567synchronized2 = c13143l.m3567synchronized() + i3;
                            c = (iM3567synchronized2 == i4 || iM3567synchronized2 >= c13143l.crashlytics) ? c3 : (char) 1;
                            int i5 = c != 0 ? iM3567synchronized2 : c13143l.crashlytics;
                            j = j5;
                            char c4 = 1;
                            while (c13143l.loadAd < i5 && c4 != 0) {
                                long j6 = iM3567synchronized;
                                int[] iArr = c10276l.yandex;
                                char c5 = c3;
                                int iSignatures = c13143l.signatures();
                                if (iSignatures != 255) {
                                    switch (iSignatures) {
                                        case 0:
                                            c4 = 1;
                                            break;
                                        case 1:
                                            c10276l.loadAd = j6;
                                            c4 = 1;
                                            break;
                                        case 2:
                                            c10276l.crashlytics = j6;
                                            c4 = 1;
                                            break;
                                        case 3:
                                            if (c13143l.yandex() >= 2) {
                                                int iSignatures2 = c13143l.signatures();
                                                int iSignatures3 = c13143l.signatures();
                                                iArr[3] = C10276l.yandex(c10276l.billing, iSignatures2 >> 4);
                                                iArr[2] = C10276l.yandex(c10276l.billing, iSignatures2 & 15);
                                                iArr[1] = C10276l.yandex(c10276l.billing, iSignatures3 >> 4);
                                                iArr[c5] = C10276l.yandex(c10276l.billing, iSignatures3 & 15);
                                                c10276l.purchase = true;
                                                c4 = 1;
                                            } else {
                                                AbstractC6427l.vip("VobsubParser", "Incomplete color command");
                                                c4 = c5;
                                            }
                                            break;
                                        case 4:
                                            if (c13143l.yandex() < 2) {
                                                AbstractC6427l.vip("VobsubParser", "Incomplete alpha command");
                                            } else if (c10276l.purchase) {
                                                int iSignatures4 = c13143l.signatures();
                                                int iSignatures5 = c13143l.signatures();
                                                iArr[3] = C10276l.crashlytics(iArr[3], iSignatures4 >> 4);
                                                iArr[2] = C10276l.crashlytics(iArr[2], iSignatures4 & 15);
                                                iArr[1] = C10276l.crashlytics(iArr[1], iSignatures5 >> 4);
                                                iArr[c5] = C10276l.crashlytics(iArr[c5], iSignatures5 & 15);
                                                c4 = 1;
                                            } else {
                                                AbstractC6427l.vip("VobsubParser", "Ignoring alpha command before color command");
                                            }
                                            c4 = c5;
                                            break;
                                        case 5:
                                            if (c13143l.yandex() >= 6) {
                                                int iSignatures6 = c13143l.signatures();
                                                int iSignatures7 = c13143l.signatures();
                                                int i6 = (iSignatures6 << 4) | (iSignatures7 >> 4);
                                                int iSignatures8 = ((iSignatures7 & 15) << 8) | c13143l.signatures();
                                                int iSignatures9 = c13143l.signatures();
                                                int iSignatures10 = c13143l.signatures();
                                                c10276l.subs = new Rect(i6, (iSignatures9 << 4) | (iSignatures10 >> 4), iSignatures8 + 1, (((iSignatures10 & 15) << 8) | c13143l.signatures()) + 1);
                                                c4 = 1;
                                            } else {
                                                AbstractC6427l.vip("VobsubParser", "Incomplete area command");
                                                c4 = c5;
                                            }
                                            break;
                                        case 6:
                                            if (c13143l.yandex() >= 4) {
                                                c10276l.isPro = c13143l.m3567synchronized();
                                                c10276l.firebase = c13143l.m3567synchronized();
                                                c4 = 1;
                                            } else {
                                                AbstractC6427l.vip("VobsubParser", "Incomplete offsets command");
                                                c4 = c5;
                                            }
                                            break;
                                        default:
                                            AbstractC12900l.subscription("Unrecognized command: ", iSignatures, "VobsubParser");
                                            c4 = c5;
                                            break;
                                    }
                                } else {
                                    c4 = c5;
                                }
                                c3 = c5;
                            }
                            c2 = c3;
                            if (c != 0) {
                                c13143l.m3562for(iM3567synchronized2);
                            }
                        }
                        if (c != 0) {
                            j5 = j;
                            c3 = c2;
                        }
                    }
                } else {
                    AbstractC6427l.vip("VobsubParser", "Skipping SPU (no plane)");
                }
                if (c10276l.billing != null || !c10276l.amazon || !c10276l.purchase || (rect = c10276l.subs) == null || c10276l.isPro == -1 || c10276l.firebase == -1 || rect.width() < 2 || c10276l.subs.height() < 2) {
                    c17456l = null;
                } else {
                    Rect rect2 = c10276l.subs;
                    int[] iArr2 = new int[rect2.height() * rect2.width()];
                    C5257l c5257l = new C5257l();
                    c13143l.m3562for(c10276l.isPro);
                    c5257l.smaato(c13143l);
                    c10276l.loadAd(c5257l, true, rect2, iArr2);
                    c13143l.m3562for(c10276l.firebase);
                    c5257l.smaato(c13143l);
                    c10276l.loadAd(c5257l, c2, rect2, iArr2);
                    c17456l = new C17456l(null, null, null, Bitmap.createBitmap(iArr2, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / c10276l.admob, 0, 0, rect2.left / c10276l.mopub, 0, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, rect2.width() / c10276l.mopub, rect2.height() / c10276l.admob, false, -16777216, RecyclerView.UNDEFINED_DURATION, 0.0f, 0);
                }
                j2 = c10276l.crashlytics;
                if (j2 != j) {
                    j4 = c10276l.loadAd;
                    if (j4 != j && j2 > j4) {
                        j2 -= j4;
                    }
                    j3 = j2;
                } else {
                    j3 = j;
                }
                if (c17456l != null) {
                    c13708lIsVip = AbstractC1186l.isVip(c17456l);
                } else {
                    c13708lIsVip = C13708l.f26763l;
                }
                c8755l = new C8755l(c10276l.loadAd, j3, c13708lIsVip);
            }
            j = -9223372036854775807L;
            c2 = 0;
            if (c10276l.billing != null) {
                c17456l = null;
            } else {
                c17456l = null;
            }
            j2 = c10276l.crashlytics;
            if (j2 != j) {
                j4 = c10276l.loadAd;
                if (j4 != j) {
                    j2 -= j4;
                }
                j3 = j2;
            } else {
                j3 = j;
            }
            if (c17456l != null) {
                c13708lIsVip = AbstractC1186l.isVip(c17456l);
            } else {
                c13708lIsVip = C13708l.f26763l;
            }
            c8755l = new C8755l(c10276l.loadAd, j3, c13708lIsVip);
        }
        interfaceC18679l.accept(c8755l);
    }

    @Override // defpackage.InterfaceC17215l
    public final /* synthetic */ void reset() {
    }
}
