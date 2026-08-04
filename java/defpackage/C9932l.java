package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* JADX INFO: renamed from: lٍۥٍ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9932l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ long f20224l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f20225l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ int f20226l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9932l(int i, long j, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f20226l = i;
        this.f20224l = j;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f20225l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            C11485l c11485l = C11485l.f23075l;
            this.f20225l = 1;
            obj = c11485l.vip(this.f20226l, this.f20224l, this);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (obj == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        CachedPlaylist cachedPlaylist = (CachedPlaylist) obj;
        if (cachedPlaylist == null) {
            return "{}";
        }
        AudioPlaylist audioPlaylistCrashlytics = cachedPlaylist.crashlytics();
        return AbstractC9968l.yandex(VKXApplication.f36629l, AbstractC18202l.yandex(AudioPlaylist.class)).purchase(AudioPlaylist.firebase(audioPlaylistCrashlytics, audioPlaylistCrashlytics.isVip, -9175041));
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C9932l(this.f20226l, this.f20224l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C9932l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
