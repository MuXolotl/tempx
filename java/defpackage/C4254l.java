package defpackage;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* JADX INFO: renamed from: lٜؖٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4254l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ AppActivity f8729l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f8730l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f8731l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4254l(AppActivity appActivity, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f8730l = i;
        this.f8729l = appActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006b  */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        boolean zM4612strictfp;
        int i = this.f8730l;
        AppActivity appActivity = this.f8729l;
        Object obj2 = this.f8731l;
        switch (i) {
            case 0:
                C8774l c8774l = (C8774l) obj2;
                AbstractC2829l.crashlytics(obj);
                AudioPlaylist audioPlaylist = c8774l.yandex;
                int i2 = audioPlaylist.crashlytics;
                long j = audioPlaylist.amazon;
                C5198l c5198lM3161l = C6336l.loadAd.m3161l();
                if (c5198lM3161l != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(j);
                    sb.append('_');
                    sb.append(i2);
                    CachedPlaylist cachedPlaylist = (CachedPlaylist) AbstractC11356l.loadAd(c5198lM3161l.m1735l(AbstractC18202l.yandex.loadAd(CachedPlaylist.class), "uid == $0", Arrays.copyOf(new Object[]{sb.toString()}, 1)));
                    if (cachedPlaylist != null) {
                        zM4612strictfp = cachedPlaylist.m4612strictfp();
                    } else {
                        zM4612strictfp = false;
                    }
                } else {
                    zM4612strictfp = false;
                }
                if (zM4612strictfp) {
                    AbstractC10999l.mopub(AbstractC11990l.firebase(appActivity), ExecutorC6708l.f14063l, 0, new C7641l(c8774l, appActivity, null, 7), 2);
                }
                break;
            default:
                C10288l c10288l = (C10288l) obj2;
                AbstractC2829l.crashlytics(obj);
                if (c10288l.yandex) {
                    new C0787l(c10288l.loadAd).Signature(appActivity);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f8730l;
        AppActivity appActivity = this.f8729l;
        switch (i) {
            case 0:
                C4254l c4254l = new C4254l(appActivity, interfaceC14029l, 0);
                c4254l.f8731l = obj;
                return c4254l;
            default:
                C4254l c4254l2 = new C4254l(appActivity, interfaceC14029l, 1);
                c4254l2.f8731l = obj;
                return c4254l2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8730l) {
            case 0:
                return ((C4254l) ads((InterfaceC14029l) obj2, (C8774l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C4254l) ads((InterfaceC14029l) obj2, (C10288l) obj)).Signature(Unit.INSTANCE);
        }
    }
}
