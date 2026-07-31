package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lًۢۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8341l implements InterfaceC2743l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final List f17268l;

    public C8341l() {
        this.f17268l = AbstractC14055l.remoteconfig(new C8195l("re.sova.five", "522FA41D301BD4B884EE6AAA7EDC30ABBA5B3D7E"), new C8195l("com.tea.android", "BD7BEC878C5D48E9D4C201050B8EFDA82316F0A8"), new C8195l("ru.utkacraft.vkdirect.dev", "382B654761DD67703E82464968E99714E4A8CCC5"), new C8195l("com.vtosters.android", "C8EAB7342DA62B4A229E1BFDEB27B029DD6788A1"), new C8195l("com.vkmp3mod.android", "545399BC1468D43DD6D2FD6CAAD2EBC6E0FFCBAC"), new C8195l("com.vkontakte.android", "545399BC1468D43DD6D2FD6CAAD2EBC6E0FFCBAC"), new C8195l("com.vkontakte.android", "276114497D5A44F3B2C9403BBEE2DFC903DBFAF1"), new C8195l("com.vtosters.lite", "c3ea27ca14bd72e3e6ae203497b4445adac1f945"), new C8195l("com.vtosters.lite", "C8EAB7342DA62B4A229E1BFDEB27B029DD6788A1"), new C8195l("com.supernova", "276114497D5A44F3B2C9403BBEE2DFC903DBFAF1"));
    }

    @Override // defpackage.InterfaceC2743l
    public long firebase(int i) {
        AbstractC12442l.admob(i == 0);
        return 0L;
    }

    @Override // defpackage.InterfaceC2743l
    public List metrica(long j) {
        return j >= 0 ? this.f17268l : Collections.EMPTY_LIST;
    }

    @Override // defpackage.InterfaceC2743l
    public int purchase(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // defpackage.InterfaceC2743l
    public int subscription() {
        return 1;
    }

    public C8341l(List list) {
        this.f17268l = list;
    }
}
