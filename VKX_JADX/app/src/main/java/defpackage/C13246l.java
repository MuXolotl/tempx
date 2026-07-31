package defpackage;

import android.content.Intent;
import android.net.Uri;
import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٍْؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13246l extends C1538l implements Function0 {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26021l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13246l(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f26021l = i4;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0224 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0226 A[LOOP:4: B:107:0x01f8->B:117:0x0226, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:161:0x0229 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C18289l c18289l;
        char c;
        int i = this.f26021l;
        int i2 = 1;
        Object obj = this.f26698l;
        switch (i) {
            case 0:
                ((C0996l) obj).f34617l.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(AbstractC0653l.ads(new StringBuilder("https://static."), AbstractC9549l.purchase, "/restore/"))));
                return Unit.INSTANCE;
            case 1:
                ((C11562l) obj).mo1143default();
                return Unit.INSTANCE;
            case 2:
                ((C11562l) obj).isVip().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://vkx.app/license")));
                return Unit.INSTANCE;
            case 3:
                C11562l c11562l = (C11562l) obj;
                c11562l.getClass();
                c11562l.m4125private(new C9197l(true));
                return Unit.INSTANCE;
            case 4:
                ((C17136l) obj).mo1143default();
                return Unit.INSTANCE;
            case 5:
                ((C2994l) obj).mo1143default();
                return Unit.INSTANCE;
            case 6:
                ((C16911l) obj).mo1143default();
                return Unit.INSTANCE;
            case 7:
                ((C0311l) obj).mo1143default();
                return Unit.INSTANCE;
            case 8:
                ((C7246l) obj).mo1143default();
                return Unit.INSTANCE;
            case 9:
                C15779l c15779l = (C15779l) obj;
                C6295l c6295l = c15779l.crashlytics;
                C6295l c6295l2 = c15779l.amazon;
                C15552l c15552l = c15779l.yandex;
                C6543l c6543lBilling = c15552l.billing();
                char c2 = 7;
                EnumC11822l enumC11822l = EnumC11822l.f23653l;
                if (c6543lBilling == null) {
                    Object[] objArr = c6295l2.loadAd;
                    long[] jArr = c6295l2.yandex;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            if ((((~j) << c2) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                int i5 = 0;
                                while (i5 < i4) {
                                    if ((j & 255) < 128) {
                                        ((InterfaceC10653l) objArr[(i3 << 3) + i5]).mo1231native(enumC11822l);
                                    }
                                    j >>= 8;
                                    i5++;
                                    c2 = c2;
                                }
                                c = c2;
                                if (i4 == 8) {
                                }
                            } else {
                                c = c2;
                            }
                            if (i3 != length) {
                                i3++;
                                c2 = c;
                            }
                        }
                    }
                } else if (c6543lBilling.f29462l) {
                    if (c6295l.crashlytics(c6543lBilling)) {
                        c6543lBilling.m2025l();
                    }
                    EnumC11822l enumC11822lM2028l = c6543lBilling.m2028l();
                    if (!c6543lBilling.f29454l.f29462l) {
                        AbstractC0081l.crashlytics("visitAncestors called on an unattached node");
                    }
                    AbstractC14971l abstractC14971l = c6543lBilling.f29454l;
                    C3654l c3654lMetrica = AbstractC5573l.metrica(c6543lBilling);
                    int i6 = 0;
                    while (c3654lMetrica != null) {
                        if ((((AbstractC14971l) c3654lMetrica.f7703l.mopub).f29457l & 5120) != 0) {
                            while (abstractC14971l != null) {
                                int i7 = abstractC14971l.f29450l;
                                if ((i7 & 5120) != 0) {
                                    if ((i7 & 1024) != 0) {
                                        i6++;
                                    }
                                    if ((abstractC14971l instanceof InterfaceC10653l) && c6295l2.crashlytics(abstractC14971l)) {
                                        if (i6 <= 1) {
                                            ((InterfaceC10653l) abstractC14971l).mo1231native(enumC11822lM2028l);
                                        } else {
                                            ((InterfaceC10653l) abstractC14971l).mo1231native(EnumC11822l.f23650l);
                                        }
                                        c6295l2.remoteconfig(abstractC14971l);
                                    }
                                }
                                abstractC14971l = abstractC14971l.f29456l;
                            }
                        }
                        c3654lMetrica = c3654lMetrica.license();
                        abstractC14971l = (c3654lMetrica == null || (c18289l = c3654lMetrica.f7703l) == null) ? null : (C13924l) c18289l.billing;
                    }
                    Object[] objArr2 = c6295l2.loadAd;
                    long[] jArr2 = c6295l2.yandex;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j2 = jArr2[i8];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                for (int i10 = 0; i10 < i9; i10++) {
                                    if ((j2 & 255) < 128) {
                                        ((InterfaceC10653l) objArr2[(i8 << 3) + i10]).mo1231native(enumC11822l);
                                    }
                                    j2 >>= 8;
                                }
                                if (i9 == 8) {
                                    if (i8 != length2) {
                                        i8++;
                                    }
                                }
                            } else if (i8 != length2) {
                                i8++;
                            }
                        }
                    }
                }
                if (c15552l.billing() == null || c15552l.crashlytics.m2028l() == enumC11822l) {
                    c15552l.crashlytics();
                }
                c6295l.loadAd();
                c6295l2.loadAd();
                c15779l.purchase = false;
                return Unit.INSTANCE;
            case 10:
                return Boolean.valueOf(((C12044l) obj).f23965l.m2026l(7));
            case 11:
                ((InterfaceC4138l) obj).purchase();
                return Unit.INSTANCE;
            case 12:
                ((C11183l) obj).m3046l();
                return Unit.INSTANCE;
            case 13:
                ((C16942l) obj).purchase();
                return Unit.INSTANCE;
            case 14:
                ((C0936l) obj).mo1143default();
                return Unit.INSTANCE;
            case 15:
                ((C15414l) obj).mo1143default();
                return Unit.INSTANCE;
            case 16:
                C17984l.m4451public((C17984l) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C17984l c17984l = (C17984l) obj;
                c17984l.getClass();
                new C7883l(1, new C16568l(c17984l, i2)).Signature(c17984l.isVip());
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C17984l.m4451public((C17984l) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C17984l c17984l2 = (C17984l) obj;
                c17984l2.getClass();
                new C7883l(1, new C16568l(c17984l2, i2)).Signature(c17984l2.isVip());
                return Unit.INSTANCE;
            case 20:
                ((C11663l) obj).mo1143default();
                return Unit.INSTANCE;
            case 21:
                ((C8757l) obj).mo1143default();
                return Unit.INSTANCE;
            case 22:
                C8757l c8757l = (C8757l) obj;
                c8757l.getClass();
                if (!AbstractC4340l.loadAd) {
                    C18073l.license("Scrobbler not initialized!");
                    return null;
                }
                AbstractC4340l.yandex.edit().remove("username").remove("sessionKey").apply();
                c8757l.f18021l.setValue(null);
                return Unit.INSTANCE;
            case 23:
                ((C2281l) obj).mo1143default();
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((C15243l) obj).mo1143default();
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((C15285l) obj).getClass();
                C8183l.loadAd.f36642l.billing();
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((C15285l) obj).getClass();
                VKXApplication vKXApplication = VKXApplication.f36631l;
                AbstractC12832l.mopub(C1215l.yandex, vKXApplication != null ? vKXApplication : null);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((C17986l) obj).purchase();
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((C17986l) obj).purchase();
                return Unit.INSTANCE;
            default:
                ((C13695l) obj).mo1143default();
                return Unit.INSTANCE;
        }
    }
}
