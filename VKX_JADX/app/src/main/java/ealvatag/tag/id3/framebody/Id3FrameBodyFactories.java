package ealvatag.tag.id3.framebody;

import defpackage.AbstractC13675l;
import defpackage.C0869l;
import defpackage.C13698l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class Id3FrameBodyFactories implements Id3FrameBodyFactory {
    private static volatile Id3FrameBodyFactory instance;
    private final AbstractC13675l factoryMap;

    private Id3FrameBodyFactories() {
        C13698l c13698lYandex = AbstractC13675l.yandex();
        c13698lYandex.mo3668catch("AENC", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.105
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyAENC(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("APIC", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.104
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyAPIC(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("ASPI", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.103
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyASPI(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("CHAP", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.102
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyCHAP(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("COMM", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.101
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyCOMM(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("COMR", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.100
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyCOMR(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("CRM", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.99
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyCRM(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("CTOC", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.98
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyCTOC(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("ENCR", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.97
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyENCR(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("EQU2", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.96
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyEQU2(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("EQUA", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.95
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyEQUA(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("ETCO", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.94
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyETCO(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("GEOB", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.93
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyGEOB(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("GRID", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.92
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyGRID(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("GRP1", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.91
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyGRP1(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("IPLS", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.90
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyIPLS(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("LINK", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.89
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyLINK(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("MCDI", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.88
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyMCDI(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("MLLT", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.87
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyMLLT(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("MVIN", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.86
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyMVIN(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("MVNM", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.85
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyMVNM(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("OWNE", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.84
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyOWNE(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("PCNT", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.83
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyPCNT(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("PIC", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.82
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyPIC(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("POPM", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.81
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyPOPM(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("POSS", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.80
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyPOSS(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("PRIV", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.79
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyPRIV(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("RBUF", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.78
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyRBUF(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("RVA2", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.77
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyRVA2(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("RVAD", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.76
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyRVAD(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("RVRB", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.75
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyRVRB(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("SEEK", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.74
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodySEEK(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("SIGN", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.73
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodySIGN(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("SYLT", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.72
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodySYLT(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("SYTC", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.71
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodySYTC(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TBPM", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.70
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTBPM(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TCMP", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.69
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTCMP(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TCOM", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.68
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTCOM(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TCON", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.67
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTCON(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TCOP", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.66
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTCOP(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TDAT", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.65
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTDAT(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TDEN", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.64
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTDEN(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TDLY", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.63
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTDLY(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TDOR", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.62
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTDOR(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TDRC", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.61
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTDRC(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TDRL", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.60
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTDRL(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TDTG", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.59
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTDTG(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TENC", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.58
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTENC(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TEXT", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.57
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTEXT(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TFLT", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.56
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTFLT(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TIME", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.55
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTIME(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TIPL", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.54
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTIPL(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TIT1", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.53
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTIT1(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TIT2", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.52
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTIT2(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TIT3", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.51
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTIT3(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TKEY", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.50
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTKEY(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TLAN", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.49
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTLAN(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TLEN", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.48
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTLEN(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TMCL", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.47
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTMCL(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TMED", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.46
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTMED(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TMOO", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.45
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTMOO(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TOAL", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.44
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTOAL(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TOFN", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.43
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTOFN(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TOLY", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.42
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTOLY(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TOPE", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.41
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTOPE(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TORY", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.40
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTORY(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TOWN", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.39
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTOWN(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TPE1", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.38
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTPE1(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TPE2", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.37
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTPE2(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TPE3", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.36
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTPE3(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TPE4", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.35
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTPE4(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TPOS", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.34
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTPOS(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TPRO", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.33
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTPRO(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TPUB", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.32
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTPUB(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TRCK", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.31
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTRCK(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TRDA", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.30
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTRDA(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TRSN", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.29
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTRSN(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TRSO", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.28
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTRSO(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TSIZ", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.27
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTSIZ(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TSO2", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.26
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTSO2(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TSOA", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.25
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTSOA(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TSOC", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.24
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTSOC(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TSOP", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.23
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTSOP(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TSOT", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.22
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTSOT(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TSRC", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.21
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTSRC(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TSSE", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.20
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTSSE(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TSST", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.19
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTSST(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TXXX", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.18
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTXXX(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TYER", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.17
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTYER(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("UFID", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.16
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyUFID(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("USER", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.15
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyUSER(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("USLT", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.14
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyUSLT(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("WCOM", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.13
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyWCOM(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("WCOP", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.12
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyWCOP(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("WOAF", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.11
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyWOAF(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("WOAR", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.10
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyWOAR(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("WOAS", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.9
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyWOAS(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("WORS", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.8
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyWORS(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("WPAY", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.7
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyWPAY(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("WPUB", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.6
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyWPUB(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("WXXX", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.5
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyWXXX(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("XSOA", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.4
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyXSOA(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("XSOP", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.3
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyXSOP(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("XSOT", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.2
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyXSOT(c0869l, i);
            }
        });
        c13698lYandex.mo3668catch("TALB", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.1
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) {
                return new FrameBodyTALB(c0869l, i);
            }
        });
        this.factoryMap = c13698lYandex.adcel();
    }

    public static Id3FrameBodyFactory instance() {
        if (instance == null) {
            synchronized (Id3FrameBodyFactories.class) {
                try {
                    if (instance == null) {
                        instance = new Id3FrameBodyFactories();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
    public AbstractID3v2FrameBody make(String str, C0869l c0869l, int i) throws FrameIdentifierException {
        Id3FrameBodyFactory id3FrameBodyFactory = (Id3FrameBodyFactory) this.factoryMap.get(str);
        if (id3FrameBodyFactory != null) {
            return id3FrameBodyFactory.make(str, c0869l, i);
        }
        throw new FrameIdentifierException(str);
    }
}
