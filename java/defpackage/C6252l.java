package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import ua.itaysonlab.vkapi2.upload.AudioUploader$UploadResponse;
import ua.itaysonlab.vkapi2.upload.BaseDataUploader$UploadUrlResult;

/* JADX INFO: renamed from: lؙؚؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6252l extends Cgoto {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C6252l f13199l = new C6252l(5);

    /* JADX WARN: Code duplicated, block: B:36:0x0125 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: lٕؖؔ, reason: contains not printable characters */
    public final Object m1995l(File file, C10023l c10023l, C4568l c4568l, AbstractC0283l abstractC0283l) throws Throwable {
        C14629l c14629l;
        C10023l c10023l2;
        File file2;
        C4568l c4568l2;
        C12105l c12105lM674strictfp;
        C10023l c10023l3;
        Object objAdmob;
        if (abstractC0283l instanceof C14629l) {
            c14629l = (C14629l) abstractC0283l;
            int i = c14629l.f28627l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c14629l.f28627l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c14629l = new C14629l(this, abstractC0283l);
            }
        } else {
            c14629l = new C14629l(this, abstractC0283l);
        }
        Object objAdmob2 = c14629l.f28623l;
        int i2 = c14629l.f28627l;
        InterfaceC14029l interfaceC14029l = null;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(objAdmob2);
                C12772l c12772l = new C12772l((byte) 0, 11);
                c14629l.f28626l = file;
                c10023l2 = c10023l;
                c14629l.f28625l = c10023l2;
                c14629l.f28628l = c4568l;
                c14629l.f28627l = 1;
                objAdmob2 = AbstractC8189l.admob(c12772l, c14629l);
                if (objAdmob2 != enumC9342l) {
                    file2 = file;
                    c4568l2 = c4568l;
                }
                return enumC9342l;
            }
            if (i2 == 1) {
                c4568l2 = c14629l.f28628l;
                c10023l2 = c14629l.f28625l;
                file2 = c14629l.f28626l;
                AbstractC2829l.crashlytics(objAdmob2);
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        AbstractC2829l.crashlytics(objAdmob2);
                        return objAdmob2;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c10023l3 = c14629l.f28625l;
                AbstractC2829l.crashlytics(objAdmob2);
            }
            AudioUploader$UploadResponse audioUploader$UploadResponse = (AudioUploader$UploadResponse) objAdmob2;
            C16534l c16534l = new C16534l(audioUploader$UploadResponse.loadAd, audioUploader$UploadResponse.crashlytics, audioUploader$UploadResponse.yandex, (String) c10023l3.f20418l, (String) c10023l3.f20419l);
            c14629l.f28626l = null;
            c14629l.f28625l = null;
            c14629l.f28628l = null;
            c14629l.f28627l = 3;
            objAdmob = AbstractC8189l.admob(c16534l, c14629l);
            if (objAdmob != enumC9342l) {
                return enumC9342l;
            }
            return objAdmob;
            c12105lM674strictfp = AbstractC0775l.m674strictfp(AbstractC12024l.m3348transient('.', file2.getName(), ""));
        } catch (IllegalArgumentException unused) {
            c12105lM674strictfp = null;
        }
        String str = ((BaseDataUploader$UploadUrlResult) objAdmob2).yandex;
        c14629l.f28626l = null;
        c14629l.f28625l = c10023l2;
        c14629l.f28628l = null;
        c14629l.f28627l = 2;
        C10111l c10111l = new C10111l(26);
        c10111l.m2880for(C3599l.billing);
        String name = file2.getName();
        C11155l c11155l = C12105l.amazon;
        c10111l.yandex(name, new C16995l(new C16995l(c12105lM674strictfp, file2, 1), c4568l2, 0));
        ArrayList arrayList = (ArrayList) c10111l.f20589l;
        if (arrayList.isEmpty()) {
            C8339l.smaato("Multipart body must have at least one part.");
            return null;
        }
        C3599l c3599l = new C3599l((C3844l) c10111l.f20587l, (C12105l) c10111l.f20586l, AbstractC11432l.isPro(arrayList));
        C11644l c11644l = new C11644l(28);
        C8688l c8688l = C10328l.purchase;
        c11644l.m3154l("User-Agent", AbstractC10409l.crashlytics().amazon.ads());
        c11644l.m3157l(str);
        c11644l.m3145l("POST", c3599l);
        C17032l c17032l = new C17032l(c11644l);
        C16552l c16552l = AbstractC11463l.yandex;
        objAdmob2 = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C13624l(this, c17032l, interfaceC14029l, 3), c14629l);
        if (objAdmob2 != enumC9342l) {
            c10023l3 = c10023l2;
            AudioUploader$UploadResponse audioUploader$UploadResponse2 = (AudioUploader$UploadResponse) objAdmob2;
            C16534l c16534l2 = new C16534l(audioUploader$UploadResponse2.loadAd, audioUploader$UploadResponse2.crashlytics, audioUploader$UploadResponse2.yandex, (String) c10023l3.f20418l, (String) c10023l3.f20419l);
            c14629l.f28626l = null;
            c14629l.f28625l = null;
            c14629l.f28628l = null;
            c14629l.f28627l = 3;
            objAdmob = AbstractC8189l.admob(c16534l2, c14629l);
            if (objAdmob != enumC9342l) {
                return objAdmob;
            }
        }
        return enumC9342l;
    }
}
