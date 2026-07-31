package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Shader;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍٗۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C17016l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ long f33150l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C17869l f33151l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33152l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Context f33153l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C13250l f33154l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f33155l;

    public /* synthetic */ C17016l(long j, C13250l c13250l, C17869l c17869l, C6906l c6906l, Context context) {
        this.f33150l = j;
        this.f33154l = c13250l;
        this.f33151l = c17869l;
        this.f33155l = c6906l;
        this.f33153l = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        long j;
        InterfaceC13349l interfaceC13349l;
        InterfaceC13349l interfaceC13349l2;
        Object objBilling;
        Object objBilling2;
        int i = this.f33152l;
        Object obj2 = this.f33155l;
        switch (i) {
            case 0:
                AbstractC9544l abstractC9544l = (AbstractC9544l) obj2;
                InterfaceC13349l interfaceC13349l3 = (InterfaceC13349l) obj;
                long j2 = this.f33150l;
                long j3 = j2 ^ (-9223372034707292160L);
                long jAdmob = interfaceC13349l3.admob();
                C13250l c13250l = this.f33154l;
                long jAdmob2 = C14174l.admob(c13250l.f26029l, jAdmob);
                C17869l c17869l = this.f33151l;
                C11183l c11183l = c17869l.yandex;
                InterfaceC1220l interfaceC1220l = AbstractC13958l.yandex;
                boolean z = c11183l.f22480l != null;
                C16931l c16931l = new C16931l(11, c17869l);
                InterfaceC13349l interfaceC13349l4 = interfaceC13349l3;
                C11183l c11183l2 = c11183l;
                AbstractC13359l.crashlytics(interfaceC13349l4, j3, jAdmob2, z, c16931l);
                long jAdmob3 = interfaceC13349l4.admob();
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jAdmob3 >> 32)) + (Math.max(Float.intBitsToFloat((int) (j2 >> 32)), 0.0f) * 2.0f))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jAdmob3 & 4294967295L)) + (Math.max(Float.intBitsToFloat((int) (j2 & 4294967295L)), 0.0f) * 2.0f))) & 4294967295L);
                float fPurchase = AbstractC13958l.purchase(c11183l2);
                long j4 = j2;
                if (fPurchase > 0.0f) {
                    long j5 = (((j3 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L);
                    Context context = this.f33153l;
                    j = 4294967297L;
                    if (j5 != 0 || C1187l.loadAd(j3, 0L)) {
                        C5008l c5008l = AbstractC2570l.yandex;
                        C6295l c6295l = (C6295l) c5008l.f10245l;
                        C6295l c6295l2 = (C6295l) c5008l.f10245l;
                        if (c6295l2.subs()) {
                            objBilling = c6295l2.billing();
                            c6295l2.remoteconfig(objBilling);
                        } else {
                            objBilling = null;
                        }
                        C4480l c4480lYandex = (C4480l) objBilling;
                        if (c4480lYandex == null) {
                            c4480lYandex = AbstractC4311l.yandex();
                        }
                        try {
                            c4480lYandex.yandex.setAntiAlias(true);
                            c4480lYandex.amazon(AbstractC8576l.amazon(fPurchase, 0.0f, 1.0f));
                            Bitmap bitmapRemoteconfig = AbstractC2847l.remoteconfig(context);
                            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                            BitmapShader bitmapShader = new BitmapShader(bitmapRemoteconfig, tileMode, tileMode);
                            float f = c13250l.f26029l;
                            if (f <= 0.0f) {
                                f = 1.0f;
                            }
                            if (Math.abs(f - 1.0f) >= 0.001f) {
                                Matrix matrix = new Matrix();
                                float f2 = 1.0f / f;
                                matrix.setScale(f2, f2);
                                bitmapShader.setLocalMatrix(matrix);
                            }
                            c4480lYandex.isPro(bitmapShader);
                            c4480lYandex.purchase(9);
                            interfaceC13349l4.mo2065break().m4555synchronized().subs(AbstractC7470l.isPro(0L, jFloatToRawIntBits), c4480lYandex);
                            Unit unit = Unit.INSTANCE;
                            c4480lYandex.yandex.reset();
                            if (c6295l.amazon < 3) {
                                c6295l.smaato(c4480lYandex);
                            }
                        } catch (Throwable th) {
                            c4480lYandex.yandex.reset();
                            if (c6295l.amazon < 3) {
                                c6295l.smaato(c4480lYandex);
                            }
                            throw th;
                        }
                    } else {
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
                        ((C16543l) interfaceC13349l4.mo2065break().f36010l).inmobi(fIntBitsToFloat, fIntBitsToFloat2);
                        try {
                            C5008l c5008l2 = AbstractC2570l.yandex;
                            C6295l c6295l3 = (C6295l) c5008l2.f10245l;
                            if (c6295l3.subs()) {
                                objBilling2 = c6295l3.billing();
                                c6295l3.remoteconfig(objBilling2);
                            } else {
                                objBilling2 = null;
                            }
                            C4480l c4480lYandex2 = (C4480l) objBilling2;
                            if (c4480lYandex2 == null) {
                                c4480lYandex2 = AbstractC4311l.yandex();
                            }
                            try {
                                c4480lYandex2.yandex.setAntiAlias(true);
                                c4480lYandex2.amazon(AbstractC8576l.amazon(fPurchase, 0.0f, 1.0f));
                                Bitmap bitmapRemoteconfig2 = AbstractC2847l.remoteconfig(context);
                                Shader.TileMode tileMode2 = Shader.TileMode.REPEAT;
                                BitmapShader bitmapShader2 = new BitmapShader(bitmapRemoteconfig2, tileMode2, tileMode2);
                                float f3 = c13250l.f26029l;
                                float f4 = f3 > 0.0f ? f3 : 1.0f;
                                if (Math.abs(f4 - 1.0f) >= 0.001f) {
                                    Matrix matrix2 = new Matrix();
                                    float f5 = 1.0f / f4;
                                    matrix2.setScale(f5, f5);
                                    bitmapShader2.setLocalMatrix(matrix2);
                                }
                                c4480lYandex2.isPro(bitmapShader2);
                                c4480lYandex2.purchase(9);
                                interfaceC13349l4.mo2065break().m4555synchronized().subs(AbstractC7470l.isPro(0L, jFloatToRawIntBits), c4480lYandex2);
                                Unit unit2 = Unit.INSTANCE;
                                c4480lYandex2.yandex.reset();
                                C6295l c6295l4 = (C6295l) c5008l2.f10245l;
                                if (c6295l4.amazon < 3) {
                                    c6295l4.smaato(c4480lYandex2);
                                }
                                ((C16543l) interfaceC13349l4.mo2065break().f36010l).inmobi(-fIntBitsToFloat, -fIntBitsToFloat2);
                            } catch (Throwable th2) {
                                c4480lYandex2.yandex.reset();
                                C6295l c6295l5 = (C6295l) c5008l2.f10245l;
                                if (c6295l5.amazon < 3) {
                                    c6295l5.smaato(c4480lYandex2);
                                }
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            ((C16543l) interfaceC13349l4.mo2065break().f36010l).inmobi(-fIntBitsToFloat, -fIntBitsToFloat2);
                            throw th3;
                        }
                    }
                } else {
                    j = 4294967297L;
                }
                if (((((j3 & 9187343241974906880L) ^ 9187343241974906880L) - j) & (-9223372034707292160L)) != 0 || C1187l.loadAd(j3, 0L)) {
                    interfaceC13349l = interfaceC13349l4;
                    Iterator it = AbstractC13958l.billing(c11183l2).iterator();
                    while (it.hasNext()) {
                        AbstractC13359l.amazon(interfaceC13349l, (C12870l) it.next(), c11183l2, j4, jFloatToRawIntBits, abstractC9544l);
                    }
                } else {
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 >> 32));
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j3 & 4294967295L));
                    ((C16543l) interfaceC13349l4.mo2065break().f36010l).inmobi(fIntBitsToFloat3, fIntBitsToFloat4);
                    try {
                        Iterator it2 = AbstractC13958l.billing(c11183l2).iterator();
                        while (it2.hasNext()) {
                            C11183l c11183l3 = c11183l2;
                            interfaceC13349l2 = interfaceC13349l4;
                            long j6 = jFloatToRawIntBits;
                            long j7 = j4;
                            try {
                                AbstractC13359l.amazon(interfaceC13349l2, (C12870l) it2.next(), c11183l3, j7, j6, abstractC9544l);
                                interfaceC13349l4 = interfaceC13349l2;
                                c11183l2 = c11183l3;
                                j4 = j7;
                                jFloatToRawIntBits = j6;
                            } catch (Throwable th4) {
                                th = th4;
                                ((C16543l) interfaceC13349l2.mo2065break().f36010l).inmobi(-fIntBitsToFloat3, -fIntBitsToFloat4);
                                throw th;
                            }
                        }
                        interfaceC13349l = interfaceC13349l4;
                        ((C16543l) interfaceC13349l.mo2065break().f36010l).inmobi(-fIntBitsToFloat3, -fIntBitsToFloat4);
                    } catch (Throwable th5) {
                        th = th5;
                        interfaceC13349l2 = interfaceC13349l4;
                    }
                }
                if (abstractC9544l != null) {
                    AbstractC9361l.vip(interfaceC13349l, abstractC9544l, 0L, interfaceC13349l.admob(), 0.0f, null, null, 6, 58);
                }
                return Unit.INSTANCE;
            default:
                C6742l c6742l = (C6742l) obj2;
                C11925l c11925l = (C11925l) obj;
                C17869l c17869l2 = this.f33151l;
                C11183l c11183l4 = c17869l2.yandex;
                c11925l.billing(c11183l4.f22500l);
                InterfaceC1220l interfaceC1220l2 = AbstractC13958l.yandex;
                c11925l.mopub(c11183l4.f22480l != null);
                C10417l c10417l = c11183l4.f22487l;
                C6906l c6906lYandex = c10417l != null ? AbstractC17551l.yandex(c10417l) : null;
                if (c6906lYandex != null) {
                    c11925l.admob(1);
                }
                c6742l.subscription(AbstractC14707l.billing(c6742l.admob()), c11925l, new C17016l(this.f33150l, this.f33154l, c17869l2, c6906lYandex, this.f33153l));
                AbstractC2576l.loadAd(c6742l, c11925l);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C17016l(C17869l c17869l, C6742l c6742l, long j, C13250l c13250l, Context context) {
        this.f33151l = c17869l;
        this.f33155l = c6742l;
        this.f33150l = j;
        this.f33154l = c13250l;
        this.f33153l = context;
    }
}
