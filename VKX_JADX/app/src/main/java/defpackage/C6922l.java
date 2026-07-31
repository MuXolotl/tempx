package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems;
import ua.itaysonlab.vkapi2.objects.message.Conversation;
import ua.itaysonlab.vkapi2.objects.message.ConversationChatPhoto;
import ua.itaysonlab.vkapi2.objects.message.ConversationChatSettings;
import ua.itaysonlab.vkapi2.objects.message.ConversationElement;
import ua.itaysonlab.vkapi2.objects.message.ConversationPeer;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;

/* JADX INFO: renamed from: lؙۨٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6922l implements InterfaceC17842l {
    public final C10832l crashlytics;
    public final C3151l loadAd;
    public final /* synthetic */ C16793l yandex;
    public final C18662l amazon = AbstractC18263l.purchase(this);
    public final C11919l purchase = new C11919l(Boolean.TRUE);
    public final C11919l billing = new C11919l(Boolean.FALSE);
    public final C11919l mopub = new C11919l("");
    public final C11919l admob = new C11919l(C11507l.f23131l);

    public C6922l(C16793l c16793l, C3151l c3151l, C10832l c10832l) {
        this.yandex = c16793l;
        this.loadAd = c3151l;
        this.crashlytics = c10832l;
        InterfaceC12356l interfaceC12356l = c16793l.yandex;
        interfaceC12356l.mopub(new C17326l(interfaceC12356l, this, 6));
    }

    @Override // defpackage.InterfaceC17842l
    public final C10023l amazon() {
        return this.yandex.loadAd;
    }

    @Override // defpackage.InterfaceC17842l
    public final C4917l billing() {
        return this.yandex.purchase;
    }

    @Override // defpackage.InterfaceC17842l
    public final C6921l crashlytics() {
        return this.yandex.crashlytics;
    }

    @Override // defpackage.InterfaceC17842l
    public final InterfaceC12356l loadAd() {
        return this.yandex.yandex;
    }

    @Override // defpackage.InterfaceC17842l
    public final InterfaceC9573l purchase() {
        return this.yandex.amazon;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009f A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0033, B:35:0x0097, B:37:0x009f, B:38:0x00ac, B:40:0x00b2, B:43:0x00c1, B:44:0x00d0, B:48:0x00d7, B:51:0x00e4, B:52:0x00ed, B:54:0x00f3, B:55:0x0105, B:58:0x010a, B:62:0x0116, B:63:0x011f, B:65:0x0125, B:66:0x0137, B:70:0x013f, B:71:0x014c, B:73:0x0152, B:76:0x0160, B:78:0x0164, B:83:0x016c, B:100:0x01b2, B:84:0x0174, B:86:0x017c, B:89:0x0199, B:94:0x01a2, B:99:0x01ac, B:87:0x018c, B:101:0x01c5, B:103:0x01e4, B:107:0x01ec, B:20:0x0042, B:30:0x0075, B:23:0x004e, B:26:0x005c, B:31:0x0078), top: B:115:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b2 A[Catch: all -> 0x0037, LOOP:0: B:38:0x00ac->B:40:0x00b2, LOOP_END, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0033, B:35:0x0097, B:37:0x009f, B:38:0x00ac, B:40:0x00b2, B:43:0x00c1, B:44:0x00d0, B:48:0x00d7, B:51:0x00e4, B:52:0x00ed, B:54:0x00f3, B:55:0x0105, B:58:0x010a, B:62:0x0116, B:63:0x011f, B:65:0x0125, B:66:0x0137, B:70:0x013f, B:71:0x014c, B:73:0x0152, B:76:0x0160, B:78:0x0164, B:83:0x016c, B:100:0x01b2, B:84:0x0174, B:86:0x017c, B:89:0x0199, B:94:0x01a2, B:99:0x01ac, B:87:0x018c, B:101:0x01c5, B:103:0x01e4, B:107:0x01ec, B:20:0x0042, B:30:0x0075, B:23:0x004e, B:26:0x005c, B:31:0x0078), top: B:115:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object yandex(AbstractC0283l abstractC0283l) {
        C9287l c9287l;
        Object c18435l;
        C6922l c6922l;
        VKResponseWithItems vKResponseWithItems;
        C8195l c8195l;
        List list;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        C11919l c11919l = this.mopub;
        if (abstractC0283l instanceof C9287l) {
            c9287l = (C9287l) abstractC0283l;
            int i = c9287l.f19083l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c9287l.f19083l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c9287l = new C9287l(this, abstractC0283l);
            }
        } else {
            c9287l = new C9287l(this, abstractC0283l);
        }
        Object objSubs = c9287l.f19084l;
        int i2 = c9287l.f19083l;
        C11919l c11919l2 = this.purchase;
        boolean z = true;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(objSubs);
                c11919l2.subscription(Boolean.TRUE);
                int length = ((CharSequence) c11919l.admob()).length();
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (length > 0) {
                    C12772l c12772l = new C12772l((String) c11919l.admob(), 28);
                    c9287l.f19085l = this;
                    c9287l.f19083l = 1;
                    objSubs = c12772l.subs(c9287l);
                    if (objSubs != enumC9342l) {
                        c6922l = this;
                        vKResponseWithItems = (VKResponseWithItems) objSubs;
                    }
                } else {
                    C12772l c12772l2 = new C12772l(40, ((AbstractC18082l) this.admob.admob()).pro());
                    c9287l.f19085l = this;
                    c9287l.f19083l = 2;
                    objSubs = c12772l2.subs(c9287l);
                    if (objSubs != enumC9342l) {
                        c6922l = this;
                        VKResponseWithItems vKResponseWithItems2 = (VKResponseWithItems) objSubs;
                        list = (List) vKResponseWithItems2.yandex;
                        if (list != null) {
                            arrayList2 = new ArrayList(AbstractC14055l.billing(list, 10));
                            it = list.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((ConversationElement) it.next()).yandex);
                            }
                            arrayList = arrayList2;
                        } else {
                            arrayList = null;
                        }
                        vKResponseWithItems = new VKResponseWithItems(arrayList, null, vKResponseWithItems2.crashlytics, vKResponseWithItems2.amazon, null, 18);
                    }
                }
                return enumC9342l;
            }
            if (i2 == 1) {
                c6922l = c9287l.f19085l;
                AbstractC2829l.crashlytics(objSubs);
                vKResponseWithItems = (VKResponseWithItems) objSubs;
            } else {
                if (i2 != 2) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c6922l = c9287l.f19085l;
                AbstractC2829l.crashlytics(objSubs);
                VKResponseWithItems vKResponseWithItems3 = (VKResponseWithItems) objSubs;
                list = (List) vKResponseWithItems3.yandex;
                if (list != null) {
                    arrayList2 = new ArrayList(AbstractC14055l.billing(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((ConversationElement) it.next()).yandex);
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                vKResponseWithItems = new VKResponseWithItems(arrayList, null, vKResponseWithItems3.crashlytics, vKResponseWithItems3.amazon, null, 18);
            }
            List list2 = vKResponseWithItems.crashlytics;
            List<Conversation> list3 = C2580l.f5619l;
            if (list2 == null) {
                list2 = list3;
            }
            int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(list2, 10));
            int i3 = 16;
            if (iFirebase < 16) {
                iFirebase = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iFirebase);
            for (Object obj : list2) {
                linkedHashMap.put(new Long(((VKProfile) obj).yandex), obj);
            }
            List list4 = vKResponseWithItems.amazon;
            if (list4 == null) {
                list4 = list3;
            }
            int iFirebase2 = AbstractC2200l.firebase(AbstractC14055l.billing(list4, 10));
            if (iFirebase2 >= 16) {
                i3 = iFirebase2;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i3);
            for (Object obj2 : list4) {
                linkedHashMap2.put(new Long(((VKProfile) obj2).yandex), obj2);
            }
            List list5 = (List) vKResponseWithItems.yandex;
            if (list5 != null) {
                list3 = list5;
            }
            ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(list3, 10));
            for (Conversation conversation : list3) {
                ConversationChatSettings conversationChatSettings = conversation.loadAd;
                ConversationPeer conversationPeer = conversation.yandex;
                String str = "";
                if (conversationChatSettings != null) {
                    ConversationChatPhoto conversationChatPhoto = conversationChatSettings.loadAd;
                    String str2 = conversationChatPhoto != null ? conversationChatPhoto.yandex : null;
                    if (str2 != null) {
                        str = str2;
                    }
                    c8195l = new C8195l(str, conversationChatSettings.yandex);
                } else {
                    long j = conversationPeer.yandex;
                    VKProfile vKProfile = j < 0 ? (VKProfile) linkedHashMap2.get(new Long(Math.abs(j))) : (VKProfile) linkedHashMap.get(new Long(j));
                    String str3 = vKProfile != null ? vKProfile.amazon : null;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String strYandex = vKProfile != null ? vKProfile.yandex() : null;
                    if (strYandex != null) {
                        str = strYandex;
                    }
                    c8195l = new C8195l(str3, str);
                }
                arrayList3.add(new C16895l(conversationPeer.yandex, (String) c8195l.f17098l, (String) c8195l.f17097l));
            }
            C11919l c11919l3 = c6922l.admob;
            c11919l3.subscription(((AbstractC18082l) c11919l3.admob()).advert(arrayList3));
            C11919l c11919l4 = c6922l.billing;
            if (((CharSequence) c6922l.mopub.admob()).length() != 0 || arrayList3.size() != 40) {
                z = false;
            }
            c11919l4.subscription(Boolean.valueOf(z));
            c18435l = Unit.INSTANCE;
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        Throwable thYandex = C1171l.yandex(c18435l);
        if (thYandex != null) {
            thYandex.printStackTrace();
            this.billing.subscription(Boolean.FALSE);
        }
        c11919l2.subscription(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
