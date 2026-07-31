package defpackage;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٖؓؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1868l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ String f4290l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f4291l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ File f4292l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1868l(File file, String str, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f4292l = file;
        this.f4290l = str;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        int i = this.f4291l;
        Throwable th = null;
        File file = this.f4292l;
        boolean z = true;
        try {
            if (i == 0) {
                AbstractC2829l.crashlytics(obj);
                if (file.exists()) {
                    file.delete();
                }
                file.createNewFile();
                VKXApplication.Companion companion = VKXApplication.f36628l;
                C11610l c11610l = AbstractC3629l.yandex;
                if (c11610l == null) {
                    c11610l = null;
                }
                C11644l c11644l = new C11644l(28);
                c11644l.m3157l(this.f4290l);
                C17778l c17778lYandex = c11610l.yandex(new C17032l(c11644l));
                this.f4291l = 1;
                obj = AbstractC8069l.loadAd(c17778lYandex, this);
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
            C18389l c18389l = (C18389l) obj;
            C7167l c7167l = new C7167l(AbstractC7709l.amazon(file));
            try {
                AbstractC15300l.crashlytics(c7167l.mo736volatile(c18389l.f35907l.mo1516l()));
                try {
                    c7167l.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    c7167l.close();
                } catch (Throwable th4) {
                    AbstractC11718l.yandex(th, th4);
                }
            }
            if (th != null) {
                throw th;
            }
        } catch (Exception e) {
            e.printStackTrace();
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C1868l(this.f4292l, this.f4290l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1868l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
