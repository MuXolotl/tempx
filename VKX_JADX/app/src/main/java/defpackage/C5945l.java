package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lؘۙۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5945l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final /* synthetic */ Context f12526l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Context f12527l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Context f12528l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f12529l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object[] f12530l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ C0858l f12531l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Object[] f12532l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C6666l f12533l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f12534l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5945l(C0858l c0858l, Context context, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f12531l = c0858l;
        this.f12526l = context;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c0 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:7:0x0021, B:34:0x00de, B:13:0x002f, B:29:0x009b, B:16:0x0036, B:19:0x0043, B:21:0x0063, B:24:0x0083, B:26:0x0089, B:30:0x00c0), top: B:39:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00db  */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        C6666l c6666l;
        Object[] objArr;
        Object[] objArr2;
        Context context;
        Context context2;
        C0858l c0858l = this.f12531l;
        AudioTrack audioTrack = c0858l.f2514l;
        int i = this.f12534l;
        int i2 = R.string.bitrate_result;
        Context context3 = this.f12526l;
        try {
            if (i == 0) {
                AbstractC2829l.crashlytics(obj);
                C7268l.f15111l.getClass();
                boolean zPro = audioTrack.pro();
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (zPro) {
                    int i3 = audioTrack.loadAd;
                    long j = audioTrack.crashlytics;
                    StringBuilder sb = new StringBuilder();
                    sb.append(j);
                    sb.append('_');
                    sb.append(i3);
                    String string = sb.toString();
                    C5198l c5198lM3161l = C6336l.loadAd.m3161l();
                    CachedTrack cachedTrack = c5198lM3161l != null ? (CachedTrack) AbstractC11356l.loadAd(c5198lM3161l.m1735l(AbstractC18202l.yandex.loadAd(CachedTrack.class), "uid == $0", Arrays.copyOf(new Object[]{string}, 1))) : null;
                    if (cachedTrack == null || !cachedTrack.inmobi()) {
                        c6666l = C6666l.yandex;
                        objArr = new Object[1];
                        C1083l c1083l = C1083l.f2980l;
                        this.f12530l = objArr;
                        this.f12533l = c6666l;
                        this.f12527l = context3;
                        this.f12528l = context3;
                        this.f12532l = objArr;
                        this.f12529l = R.string.bitrate_result;
                        this.f12534l = 2;
                        obj = c1083l.mopub(audioTrack, this);
                        if (obj != enumC9342l) {
                            objArr2 = objArr;
                            context = context3;
                            context2 = context;
                            objArr[0] = obj;
                            String string2 = context.getString(i2, objArr2);
                            c6666l.getClass();
                            AbstractC11708l.yandex(new C15245l(0, context2, string2));
                        }
                    } else {
                        ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
                        C14019l c14019l = new C14019l(c0858l, null, 29);
                        this.f12534l = 1;
                        obj = AbstractC10999l.firebase(executorC6708l, c14019l, this);
                        if (obj == enumC9342l) {
                        }
                        MediaFormat mediaFormat = (MediaFormat) obj;
                        int integer = mediaFormat.getInteger("bitrate");
                        mediaFormat.getInteger("sample-rate");
                        AbstractC11708l.yandex(new C15245l(0, context3, context3.getString(R.string.bitrate_result, new Integer(integer / 1000))));
                    }
                } else {
                    c6666l = C6666l.yandex;
                    objArr = new Object[1];
                    C1083l c1083l2 = C1083l.f2980l;
                    this.f12530l = objArr;
                    this.f12533l = c6666l;
                    this.f12527l = context3;
                    this.f12528l = context3;
                    this.f12532l = objArr;
                    this.f12529l = R.string.bitrate_result;
                    this.f12534l = 2;
                    obj = c1083l2.mopub(audioTrack, this);
                    if (obj != enumC9342l) {
                        objArr2 = objArr;
                        context = context3;
                        context2 = context;
                        objArr[0] = obj;
                        String string3 = context.getString(i2, objArr2);
                        c6666l.getClass();
                        AbstractC11708l.yandex(new C15245l(0, context2, string3));
                    }
                }
                return enumC9342l;
            }
            if (i == 1) {
                AbstractC2829l.crashlytics(obj);
                MediaFormat mediaFormat2 = (MediaFormat) obj;
                int integer2 = mediaFormat2.getInteger("bitrate");
                mediaFormat2.getInteger("sample-rate");
                AbstractC11708l.yandex(new C15245l(0, context3, context3.getString(R.string.bitrate_result, new Integer(integer2 / 1000))));
            } else {
                if (i != 2) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = this.f12529l;
                objArr = this.f12532l;
                context = this.f12528l;
                context2 = this.f12527l;
                c6666l = this.f12533l;
                objArr2 = this.f12530l;
                AbstractC2829l.crashlytics(obj);
                objArr[0] = obj;
                String string4 = context.getString(i2, objArr2);
                c6666l.getClass();
                AbstractC11708l.yandex(new C15245l(0, context2, string4));
            }
        } catch (Exception e) {
            e.printStackTrace();
            AbstractC11708l.yandex(new C15245l(0, context3, context3.getString(R.string.bitrate_error)));
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C5945l(this.f12531l, this.f12526l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C5945l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
