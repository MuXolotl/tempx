package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;

/* JADX INFO: renamed from: lًٗؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8041l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ long f16737l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7188l f16738l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f16739l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ int f16740l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8041l(int i, long j, AbstractC7188l abstractC7188l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f16740l = i;
        this.f16737l = j;
        this.f16738l = abstractC7188l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        List list;
        List list2;
        int i = this.f16739l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            this.f16739l = 1;
            obj = C11485l.f23075l.tapsense(this.f16740l, this.f16737l, 0, 0, this);
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
        Iterable<AudioTrack> iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(iterable, 10));
        for (AudioTrack audioTrack : iterable) {
            List list3 = audioTrack.startapp;
            if (list3 != null) {
                if (list3.isEmpty()) {
                    list3 = null;
                }
                list = list3;
            } else {
                list = null;
            }
            List list4 = audioTrack.adcel;
            if (list4 != null) {
                if (list4.isEmpty()) {
                    list4 = null;
                }
                list2 = list4;
            } else {
                list2 = null;
            }
            AudioAlbum audioAlbum = audioTrack.vip;
            arrayList.add(this.f16738l.purchase(AudioTrack.Signature(audioTrack, null, audioAlbum != null ? AudioAlbum.yandex(audioAlbum) : null, list, list2, 0, -106497, 7)));
        }
        return arrayList;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C8041l(this.f16740l, this.f16737l, this.f16738l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C8041l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
